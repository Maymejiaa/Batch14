package HomeWork;

import java.util.Scanner;

public class LogicalO02 {

	public static void main (String[]args) {
		
		Scanner scan= new Scanner (System.in);
		
		System.out.println("Please enter two strings");
		
		String word1= scan.nextLine();
		String word2= scan.nextLine();
		
		System.out.println("Please enter two numbers");
		int num1= scan.nextInt();
		int num2= scan.nextInt();
		
		if (num1==num2 && word1.equals("word2")) {
		 System.out.println("AND"); }
		
		else if (num1==num2||word1.equals("word"))
		{ System.out.println("OR");}
		
		else if (num1!=num2 && !word1.equals("!word2")) {
			System.out.println("NONE");}
		
	}
}
