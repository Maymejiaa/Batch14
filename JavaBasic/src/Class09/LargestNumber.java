package Class09; 

public class LargestNumber {

	public static void main(String[] args) {
		
		int[] number= new int [] {2,8,3,9,100};
		int large=0;
	   
		for(int a=0; a<number.length; a++) {	
		  if(number[a]<large); {
    	   large=number[a]; }
		  
		}
		  System.out.println("The larges Number is "+ large);
	      		    
	}

}
