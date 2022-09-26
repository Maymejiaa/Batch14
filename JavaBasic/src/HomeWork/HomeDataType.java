package HomeWork;

import java.util.Scanner;
 
public class HomeDataType {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter your birth month");
	    String month = scan.next();
		
		  
				if (month.equals("april") || month.equals("march") || month.equals("may")) {
					System.out.println("you where born in summer");
				}
				else if (month.equals("june") ||  month.equals("july") || month.equals("august")) {
					System.out.println("You where born in summer");
				}
				else if (month.equals("september") || month.equals("octubre") ) {
					System.out.println("You where born in autium");
			    }
				else if (month.equals("november") ||  month.equals("december")) {
				      System.out.println("You where born in winter");}
			    
			    else System.out.println("invalid month ");
		 

	}

}
