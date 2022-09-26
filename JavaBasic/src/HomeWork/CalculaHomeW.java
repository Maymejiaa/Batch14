package HomeWork;

import java.util.Scanner;

class CalculaHomeW {

	public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Please enter a number ");
	 int n1=scan.nextInt();
	 System.out.println("Please enter your operator +,-,*");
	char operator=scan.next().charAt(0);
	 System.out.println("Please enter a number");
	 int n2=scan.nextInt();
	 
	 int sum=n1+n2;
	 int sub=n1-n2;
	 int mul=n1*n2;
	 int div=n1/n2;
	
	 if (operator=='+') { 
		 System.out.println("the result is equal to " + sum);
		 
	 }
	 else if  (operator=='-') {
		 System.out.println("the result is equal to "+ div);
		 
	 } else if (operator=='*') {
		 System.out.println("the result is equal to "+mul);
		 
	 } else if (operator=='/') {
		 System.out.println("the result is equal to "+div );
	 }
	 else System.out.println("enter valid operator");
	 
	}

}
