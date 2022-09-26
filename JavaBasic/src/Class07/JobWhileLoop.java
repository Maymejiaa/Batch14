package Class07;

import java.util.Scanner;

public class JobWhileLoop {

	public static void main(String[] args) {
		// example with string in ehile loop and using only while 
		Scanner sc = new Scanner(System.in);
		String answer;
		System.out.println("Did you get a job?");
		answer = sc.nextLine();
		while(!answer.equals("yes")) {
		System.out.println("Did you get a job?");
		answer = sc.nextLine();
	}

}
}