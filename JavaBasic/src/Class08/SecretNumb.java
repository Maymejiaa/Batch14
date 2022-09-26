package Class08;

import java.util.Scanner;

public class SecretNumb {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int secret=5;
		int numb =scan.nextInt();
		do {
			System.out.println("Please enter the secret number ");
		 numb = scan.nextInt();
		
		} while (numb!=secret);
		
		System.out.println("You won ");
	
	}

}
