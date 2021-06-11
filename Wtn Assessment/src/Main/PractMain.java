package Main;
import java.util.*;
public class PractMain {


			public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter Previous Month Reading = ");
				int  previous_month=sc.nextInt();
				System.out.println("Enter Current Month Reading = ");
				int current_month=sc.nextInt();
				System.out.println("Enter Connection Type = ");
				String connection_type=sc.next();
				System.out.println(new Service().generateBill(current_month,previous_month,connection_type));
			}
	}

