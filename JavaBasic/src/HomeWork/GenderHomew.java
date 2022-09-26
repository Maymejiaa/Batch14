package HomeWork;

import java.util.Scanner;

public class GenderHomew {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		System.out.println("Please enter your gender");
		
		char gender=scan.next().charAt(0);
		
		System.out.println("Please enter your age");
		int age= scan.nextInt(); 
		
	
	if (age>25 && gender=='f') 
	{ 
		System.out.println("Woman ");
	}
	
	else if (age>25 && gender=='m')  
	{System.out.println("Man ");}
	
	else if (age<25 && gender=='f' ) {System.out.println("Girl ");}
	
	else if ( age<25 && gender=='m') {
		System.out.println("Boy");
	}
	}
}
