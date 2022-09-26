package HomeWork;

import java.util.Scanner;

public class logicalOpe37 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Are you thristy?");
		boolean op1=scan.nextBoolean();
		System.out.println("Are you sleepy?");
		boolean op2=scan.nextBoolean();
		
		
		if(op1 && !op2) {
			System.out.println("Looks like you need to drink water");
		}
		else if (op1 && op2) {
			System.out.println("Looks like you need to drink coffee");
		} else if (!op1 && op2) {
			System.out.println("Looks like you need to drink tea");
		}
		else System.out.println("Drink nothing");
		
	}

}
