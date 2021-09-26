package src;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Login {
	
	
public static void login() throws Exception {
	System.out.println("USER LOGIN");
	System.out.println();
	Scanner scan=new Scanner(System.in);
	System.out.println("ENTER THE NAME");
	String u_name=scan.nextLine();
	System.out.println("ENTER THE PASSWORD");
	String u_pass=scan.nextLine();
    PreparedStatement ps1 = Myconnection.getConnection().prepareStatement("select * from signup where name='" + u_name + "' and password='" + u_pass + "'");
	ResultSet rs = ps1.executeQuery();
	if(rs.next())
	{
			
			System.out.println("you have successfully logged in...!");
			display.display();
	}
	else
	{
			System.out.println("Please give the correct password and user");
	}


}
}
