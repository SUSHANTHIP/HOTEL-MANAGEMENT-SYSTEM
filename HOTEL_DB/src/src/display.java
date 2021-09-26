package src;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class display {

	static void display() throws Exception {
		char d;
		do {
			
		
		System.out.println("Enter your choice :");
		System.out.println("1.Display room details");
		System.out.println("2.Display room availability ");
		System.out.println("3.Book");
		System.out.println("4.Checkout");
		System.out.println("5.Exit");
		Scanner n=new Scanner(System.in);
		int n1 = n.nextInt();
		
		switch(n1)
		{
		

         case 1:
        	 String room = "SELECT * FROM finalroomdetails";
     		Statement hotel = Myconnection.getConnection().createStatement();
     		ResultSet result = hotel.executeQuery(room);
     		while(result.next())
     		{
     			int room_id = result.getInt("room_id");
     			String r_type = result.getString("room_type");
     			int r_price = result.getInt("Per_day_price");
     			int no_beds = result.getInt("no_of_beds");
     			String ac = result.getString("AC_NON_AC");
     			int room_no = result.getInt("room_number");
     			
     			
     			System.out.println("Room Number: " +room_id +  "\nRoom Type: " + r_type + "\nPrice-Perday: " + r_price + "\nNumber of Beds  " + no_beds + "\nAC/NON-AC: " + ac + "\n Room number" + room_no);
     			System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");

     		}
     		
        	 break;
         case 2:
        	 System.out.println("Enter the room type you need:");
        	 System.out.println("Room types are...");
        	 System.out.println("a.Luxury Double Room");
        	 System.out.println("b.Deluxe Double Room");
        	 System.out.println("c.Luxury Single Room");
        	 System.out.println("d.Deluxe Single Room");
        	 n.nextLine();
        	 String n2 = n.nextLine();
        	
        	String room1 = "SELECT * FROM finalroomdetails where room_status='Available' and room_type='"+n2+"'";
        	 Statement hotel1 = Myconnection.getConnection().createStatement();
        	ResultSet result1 = hotel1.executeQuery(room1);
        	 if(result1.next()==false) {
 	           	 System.out.println("Sorry..unavailable");
 	            }
        	  else {
		             try {
		            	 do
		            	 {
		            		 int room_id = result1.getInt("room_id");
		          			String r_type = result1.getString("room_type");
		          			int r_price = result1.getInt("Per_day_price");
		          			int no_beds = result1.getInt("no_of_beds");
		          			String ac = result1.getString("AC_NON_AC");
		          			int room_no = result1.getInt("room_number");
		          			
		          			
		          			System.out.println("Room Number: " +room_id +  "\nRoom Type: " + r_type + "\nPrice-Perday: " + r_price + "\nNumber of Beds  " + no_beds + "\nAC/NON-AC: " + ac + "\n Room number" + room_no);
		          			System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");

     			
     	        }while(result1.next());
     		             }catch(SQLException e1)
     		             {
     		            	 System.out.println("sorry");
     		             }
     	            
     		}
        	 
        	 break;
         case 3:
        	 Booking.booking();    
             break;
         case 4:System.out.println("Number of single beds : 1\nAC : No\nFree breakfast : Yes\nCharge per day:1200 ");
             break;
         default:
             System.out.println("Enter valid option");
             break;
     }
		System.out.println("do u want continue \nY \nN");
		d = n.next().charAt(0);

		} while(d=='Y'||d=='y');
		
}
}
