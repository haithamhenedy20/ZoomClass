package myStudyInSequence;

import java.util.Scanner;

public class WeekThreeClassTwo {
	/*WHILE LOOP: its not a must to know exact number will be executed
	 WHILE(CONDITION) {
	  STATEMENT;
	  }
	 */
	/*DO WHILE LOOP:SMILAR To while loop but here code will be executed at least once
	  DO {
	  STATEMENT; }
	  WHILE (CONDITION);
	 */
	/*FOR LOOP :
	  fOR (INITIALIZION,CONDITION,UPDATE){
	   STATEMENT
	  }
	 */

	public static void main(String[] args) {
		
		//WHILE LOOP: 
		int x=10;
		while (x<15) {
		System.out.println("value of x = " + x);
		x++; 
		}
		
		System.out.println("xxxxxxxxxxxxxxxxxxxx" );
		
		//DO WHILE LOOP
		int y=10;
		 do {
		System.out.println("value of y = " + y);
		y++;
		
		System.out.println("value of y after increment= " + y);
		 }	
		while (y<15);     
	   System.out.println("xxxxxxxxxxxxxxxxxxxx" );
	   
	   //FOR LOOP :
	   int ar[] = {1,2,3,6,7,8,62};
	    System.out.println(ar.length);
	    for (int i=0; i<ar.length; i++ ) {
	    System.out.println("VALUE OF INT I = " + i);
	    
	    System.out.println("xxxxxxxxxxxxxxxxxxxx" );
	   }  
	    
	    //FOR EACH-LOOP :
		   int ar1[] = {1,2,3,6,7,8,62};
		   for (int num : ar1 ) {System.out.println(num);}
		   
		   
	   System.out.println("xxxxxxxxxxxxxxxxxxxx" );

		    
		//WRITE PROGRAM JAVA T0 DISPLAY 1ST 10 NATURAL NUMBERS..
		   Scanner scan= new Scanner(System.in);
		   System.out.println("please enter your number : ");
		   int F = scan.nextInt();
		   
		   for (F=0; F<5; F++) {System.out.println("your number F is : "  + F);}
		   
		  
   }
	
}

