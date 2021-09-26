package src;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ADMIN {
public static void adminfun() throws Exception {
	System.out.println("1.Add room ");
	System.out.println("2.update room");
	Scanner m=new Scanner(System.in);
	int m1 = m.nextInt();
	switch(m1)
	{
	case 1:
	System.out.print("Enter Room id: ");
	int room_id = m.nextInt();

	System.out.print("Enter Room type: ");
	 m.nextLine();
	String type = m.nextLine();

	System.out.print("Enter Perday price: ");
	int price =m.nextInt();
	
	System.out.print("Enter No of beds: ");
	int beds = m.nextInt();
	
	System.out.print("Enter  AC OR NON-AC: ");
	 m.nextLine();
	String ac= m.nextLine();

	System.out.print("Enter Room Status: ");
	
	String status = m.nextLine();
	System.out.print("Enter Room number: ");
	int room_no = m.nextInt();

	 PreparedStatement ps=Myconnection.getConnection().prepareStatement("insert into finalroomdetails(room_id,room_type,Per_day_price,no_of_beds,AC_NON_AC,room_status,room_number)values (?,?,?,?,?,?,?)");  
     ps.setInt(1,room_id);  
     ps.setString(2,type);
     ps.setInt(3,price);
     ps.setInt(4,beds); 
     ps.setString(5,ac);
     ps.setString(6,status);
     ps.setInt(7,room_no);
     int rs=ps.executeUpdate(); 
     if(rs>0)
 	{
 			
 			System.out.println("Successfully inserted..");
 			
 	}
 	}
}
}
