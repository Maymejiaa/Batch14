package Class08;

import java.util.Scanner;

public class TaskContBre {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What item whould you like to buy?");
		String item=scan.nextLine();
		
		System.out.println("What is the price of the item?");
		double price=scan.nextDouble();
		double money;
		double total=0;
		
		do {
			System.out.println("How much money do you have ?");
			money=scan.nextDouble();
			
			total+=money;
		    double need;
		    double change;
		    
		    if (total<price) {
		    	need=price-total;
		    	System.out.println("You need to pay more $ "+need );
		    } else if (total>price) {
		    	change=total-price;
		    	System.out.println("here is your change"+ change);
		    	break; 
		    	}
		    }
		    while (total!=price);
		    System.out.println("Thank you for shopping");
			
		
		
		
}}