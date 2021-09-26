package src;

import java.util.Scanner;

public class MAINPAGE {
	public static void main(String[] args)throws Exception{
		char d;
		do {
		Scanner n=new Scanner(System.in);
		System.out.println("-------------HOTEL MANAGEMENT SYSTEM--------------");
		System.out.println();
		System.out.println("1.Admin");
		System.out.println("2.User");
		int n2 = n.nextInt();
		switch(n2)
		{
		
		case 1:
			ADMIN.adminfun();
			break;
		case 2:
			System.out.println(" 1- SIGN-UP");
			System.out.println(" 2- LOGIN");
			
			int n1 = n.nextInt();
			switch(n1)
			{
			
			case 1:
				Signup1.signup();
				break;
			case 2:
				
				Login.login();
				break;

			}

		}
		System.out.println("do u want continue \nY \nN");
		d = n.next().charAt(0);

		} while(d=='Y'||d=='y');
			//System.out.println("=====================================");

					//System.out.println("=====================================");
			//ResultSet set=ps.executeQuery("Select * from login");
		     // while(set.next())
			//{
				//System.out.println(set.getString(1)+"      "+set.getString(2));
			 //}
			
			//close connection
			
			//con.close();

}


}


       


