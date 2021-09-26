package src;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Signup1 {
public static void signup() throws Exception {
	System.out.println("SIGN-UP");
	System.out.println();
	Scanner sc=new Scanner(System.in);
	String name,pass,confpass,email,phone;
	
	System.out.println("ENTER YOUR NAME");
	name=sc.nextLine();
	System.out.println("ENTER YOUR PASSWORD");
	pass=sc.nextLine();
	System.out.println("ENTER THE CONFIRM PASSWORD");
	confpass=sc.nextLine();
	System.out.println("ENTER YOUR EMAIL-ID");
	email=sc.nextLine();
	System.out.println("ENTER YOUR MOBILE NUMBER");
	phone=sc.nextLine();
	
	PreparedStatement ps=Myconnection.getConnection().prepareStatement("insert into signup values(?,?,?,?,?)");
	
    ps.setString(1,name);
	ps.setString(2,pass);
	ps.setString(3,confpass);
	ps.setString(4,email);
	ps.setString(5,phone);
	int data=ps.executeUpdate();
	if(data>0)
		{
			
			System.out.println("you have successfully SIGNUP...!");
			Login.login();
		}
		else
		{
			System.out.println("Not Inserted");
			
		}
	
}
}
