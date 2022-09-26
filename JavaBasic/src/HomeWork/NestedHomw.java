package HomeWork;

import java.util.Scanner;

public class NestedHomw {

	public static void main(String[] args) {
		
		
		try (Scanner scan = new Scanner (System.in)) {
			System.out.println("Please enter 3 distint  number ");
			
			int n1=scan.nextInt(); 
			int n2=scan.nextInt();
			int n3=scan.nextInt(); 
			
			if (n1>n2 && n1>n3){
				System.out.println("Largest number is "+n1);
			}
			
			 if (n2>n1 && n2>n3) {
				System.out.println("Largest number is "+n2);
			} 
			
			 if (n3>n1 && n3>n2){ 
				System.out.println("Largest number is "+n3);
			}
		}
		
		
		
		
		
	}

}
