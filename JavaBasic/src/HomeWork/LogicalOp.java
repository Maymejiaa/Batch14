package HomeWork;

import java.util.Scanner;

public class LogicalOp {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner (System.in)) {
			System.out.println("Do you need a loan");
			boolean answer=scan.nextBoolean();
			
			if (answer) {
				System.out.println("Whats your credit score?");
				int b1=scan.nextInt();
			 if  (b1<600) {System.out.println("The legibility is  Not elegible");}
			else if
			( b1==600 && b1>600) {System.out.println("The elegibility is Maybe eligible");}
			else if 
			( b1>=700 && b1<801) {System.out.println("The elegibility is Elegible");}
			else if
			(b1>800) {System.out.println("The elegibility is Definitely elegible ");} 
			}
			else 
			 {System.out.println("Elegibility is Unknow");}
		}
		
		

	}

}
