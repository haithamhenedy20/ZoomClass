package Moduleweek3;

import java.util.Scanner;

public class RR_ScannerAndSwitch {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		 System.out.println("please etner");
	     int day = scan.nextInt();
	     System.out.println("your numbe :r:" + day);
	     RR_ScannerAndSwitch object4calling = new RR_ScannerAndSwitch();
	    
	   
	    
	     object4calling.experiment(day);
	     
	}
	
	public void experiment (int day) {
		
		 switch (day) {
	     case 1:
	    	 System.out.println("sunday");
	    	 break;
	     case 2:
	    	 System.out.println("mon");
	    	 break;
	     case 3:
	    	 System.out.println("tuedsay");
	    	 break;
	     case 4:
	    	 System.out.println("wed");
	    	 break;
	     case 5:
	    	 System.out.println("sdddy");
	    	 break;
	     case 6:
	    	 System.out.println("dd");
	    	 break;
	     case 7:
	    	 System.out.println("dd");
	    	 break;
	    	 default :
	    		 System.err.println("pleeaseeeeeeee");
	     }
		
	}

}

//
//System.out.println("please enter your password");
//String password=scan.nextLine();
//System.out.println("password is : "+password);