package myStudyInSequence;

import java.util.Scanner;

public class WeekThreeClassOne {
	    
	
	public static void main(String[] args) {
		
	//enter ur grade and check with switch/case its different status(take care: here do not hardcode the grade
	//u can depend on the grade u will implement "
		
	    Scanner please = new Scanner(System.in) ;
		System.out.println("please enter your grade");
		
		String grade = please.nextLine();
		System.out.println(" your grade is "+ grade);
		
		switch(grade) {
		case "A" :
		System.out.println("excellent");
		break;
		case "b" :
		System.out.println("V.good");
		break;
		case "c" :
		System.out.println("good");
		break;
		case "D" :
		System.out.println("bad");
		break;
		case "f" :
		System.out.println("Fail");
		break;
		default :  System.out.println("upon ur grade u are lost");
		break;
		}
	
	//write a program take 3 numbers from user & Print greatest number;
	
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("please enter input number : ");
		int NUM1 = input.nextInt();
		System.out.println("your first NUM is equal to :" +  NUM1);
		
		System.out.println("please enter Your 2nd input number : ");
		int NUM2 = input.nextInt();
		System.out.println("your first NUM is equal to :" +  NUM2);
		
		System.out.println("please enter Your 3rd input number : ");
		int NUM3 = input.nextInt();
		System.out.println("your first NUM is equal to :" +  NUM3);
		
		
		System.out.println("                                       ");
		System.out.println("[NUM1 =" + NUM1 + "]" + "[NUM2 = "+ NUM2 + "]" + "[NUM3 = " +NUM3+"]");
		if (NUM1> NUM2 && NUM1> NUM3) {System.out.println("The greatest # is : " + NUM1) ;}
		System.out.println("                                       ");
		if ((NUM2> NUM1) && (NUM2> NUM3)) {System.out.println("greatest # is : " + NUM2) ;}
		if ((NUM3> NUM2) && (NUM3> NUM1)) {System.out.println("greatest # is : " + NUM3) ;}
		
	
		}
		
	   }

	

	