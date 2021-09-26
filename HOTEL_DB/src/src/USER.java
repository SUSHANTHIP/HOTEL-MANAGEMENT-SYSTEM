package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class USER  {
	public static void main(String[] args)throws Exception{
	
		
	//Register the driver manager
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","root"); //(url,Username,password)

			

			System.out.println("-------------HOTEL MANAGEMENT SYSTEM--------------");
			System.out.println();
			System.out.println("USER LOGIN");
			System.out.println();
			Scanner sc=new Scanner(System.in);
			String name,pass;
			
			System.out.println("ENTER THE NAME");
			name=sc.nextLine();
			System.out.println("ENTER THE PASSWORD");
			pass=sc.nextLine();
	       
			
			
	PreparedStatement ps=con.prepareStatement("insert into login values(?,?)");
	
	        ps.setString(1,name);
			ps.setString(2,pass);
			

	       
	        
				int data=ps.executeUpdate();
						
				if(data>0)
				{
					
					System.out.println("you have successfully logged in...!");
				}
				else
				{
					System.out.println("Not Inserted");
				}
				//System.out.println("=====================================");
				//ResultSet set=ps.executeQuery("Select * from login");
			     // while(set.next())
				//{
					//System.out.println(set.getString(1)+"      "+set.getString(2));
				 //}
				
				//close connection
				
				con.close();

	}

	
}




