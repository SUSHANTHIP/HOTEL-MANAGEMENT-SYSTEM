package src;

public class Billprocess {

	public static void bill() {
		// TODO Auto-generated method stub
		int ldr=4000;
		double billpay=0;
		int no_day_stay=0;
		if (ldr>4000)
		{
			billpay=ldr*no_day_stay;
			System.out.println("Successfully paid");
		}
		else if(ldr<4000)
		{
			System.out.println("pay the full amount");
		}
	}

}
