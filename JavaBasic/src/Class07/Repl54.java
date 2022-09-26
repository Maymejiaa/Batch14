package Class07;

import java.util.Scanner;

public class Repl54 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Int:");
		int end=scan.nextInt();
		for (int num=0; num<=(end*2); num++) {
			System.out.print(num+" ");
		}
	}

}
