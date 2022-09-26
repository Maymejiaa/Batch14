package Class09;

public class Task3Integer {

	public static void main(String[] args) {
	
		int[] numbers = new int [] {1,2,3,4,5,6};
		int sum=0;
		
		for(int a=0; a<numbers.length; a++) {
			sum= sum + numbers[a];
		}
		System.out.println ("The sum of all elements is "+sum);
	}

}
