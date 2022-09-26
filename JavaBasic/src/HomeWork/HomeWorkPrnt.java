package HomeWork;

import java.util.Scanner;

public class HomeWorkPrnt {

	public static void main(String[] args) {
     Scanner scan=new Scanner (System.in);
     System.out.println("Please enter your country ");
     String country = scan.nextLine();
     String lenguage;
     switch (country) {
     case "Mexico":
     lenguage="espanol ";
     break;
     case "Salvador":
    	 lenguage="espanol";
    	 break;
     case "Usa":
     lenguage="english";
     break;
     case "Rusia":
     lenguage="russian";
     case "Pakistan":
     lenguage="urdu";
     break;
     default:
    	 country= "unknow";
    	lenguage="unknown";}
     
     System.out.println("Your"+lenguage);
     
     
    
    
     
     }
     
     
      
	}
