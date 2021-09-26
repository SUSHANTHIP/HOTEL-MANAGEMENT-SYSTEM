package src;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Booking {

	
	public static void booking() throws Exception {
		System.out.println("BOOKING");
		System.out.println();
		Scanner sc=new Scanner(System.in);
		//String u_name,pass,r_type,govt_id;
		//int room_id,room_no,no_day_stay;
		System.out.println("ENTER YOUR NAME");
		String u_name=sc.next();
		System.out.println("ENTER YOUR PASSWORD");
		String pass=sc.next();
		System.out.println("ENTER YOUR ROOM-ID");
		int room_id=sc.nextInt();
		
		
		System.out.println("ENTER YOUR ROOM NUMBER");
		int room_no=sc.nextInt();
		System.out.println("ENTER YOUR ID PROOF(AADHAR/PAN-CARD)");
		String govt_id=sc.next();
		
		System.out.println("ENTER NUMBER OF DAYS TO STAY");
		int no_day_stay=sc.nextInt();
		
		System.out.println("ENTER YOUR ROOM TYPE");
		sc.nextLine();
		String type=sc.nextLine();
		//String[] r_type = type.split(" ");
		System.out.println(type);
	
		System.out.println("PAY YOUR AMOUNT");
		String bill=sc.nextLine();
		
	
		String sql="insert into booking(user_name,password,room_id,room_type,room_number,govt_id,no_of_stay)values(?,?,?,?,?,?,?)";
		//PreparedStatement ps=Myconnection.getConnection().prepareStatement("insert into booking(u_name,password,room_id,room_type,room_number,govt_id,No_day_stay)"+"values(?,?,?,?,?,?,?)");
		
		PreparedStatement ps=Myconnection.getConnection().prepareStatement(sql);
	    ps.setString(1,u_name);
		ps.setString(2,pass);
		ps.setInt(3,room_id);
		ps.setString(4,type);
		ps.setInt(5,room_no);
		ps.setString(6,govt_id);
		ps.setInt(7,no_day_stay);
		
		int data=ps.executeUpdate();
		if(data>0)
			{
				
				System.out.println("you have successfully BOOKED...:)");
				
			}
			else
			{
				System.out.println("Not BOOKED:(");
				
			}
		
	}
		
	}


