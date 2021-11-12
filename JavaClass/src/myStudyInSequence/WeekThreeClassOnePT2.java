package myStudyInSequence;

import java.util.Scanner;

public class WeekThreeClassOnePT2 {

		public static void main(String[] args) {
			
			//write a java program that keeps a number from the user & generates integer between 1 & 7
			//& displays the name of the weekdays...
			
			Scanner input = new Scanner(System.in);
			System.out.println("please enter input number : ");
			int Day = input.nextInt();
			
			WeekThreeClassOnePT2 obj =new WeekThreeClassOnePT2();
			obj.experimentToWorkOutSideMainMethod(Day); 
			}

		
		public void experimentToWorkOutSideMainMethod (int Day) {
			
			switch (Day) {
			
			case 1 :
				System.out.println("today is sunday ");
				break;
			case 2 :
				System.out.println("today is monday ");
				break;
			case 3 :
				System.out.println("today is tuesday");
				break;
			case 4 :
				System.out.println("today is wednesday ");
				break;
			case 5 :
				System.out.println("today is thursday ");
				break;
				default : {System.out.println("today is the weekend ");}
		}
			
		} 


	}


