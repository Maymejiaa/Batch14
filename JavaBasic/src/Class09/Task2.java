package Class09;

public class Task2 {

	public static void main(String[] args) {
		
		String[] animal= {"dog", "cat", "zebra","fish","lion" ,"rabbit"};
        
		for(String animals : animal) {
        	System.out.print(animals + " ");
        }
		
		for (int a=0; a<animal.length; a++) {
			System.out.print(animal[a]+" ");
		}
	}

}
