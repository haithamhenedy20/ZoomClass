package myStudyInSequence;

import java.util.Scanner;

public class WeekTwoClassTwoPT2 {

	public static void main(String[] args) {
	
		//Write prog. allow user to i/p his age, then prog. will show if user allowed to vote (consider age should b more than 18)

		Scanner yes = new Scanner(System.in);
		System.out.println(" please enter your Age : ");
		int age = yes.nextInt();
		System.out.println(" User Age = " + age  );
		if (age >18 ) {System.out.println("User is allowed to Vote ");}
		else {System.out.println("user is not allowed to vote ");}
		yes.close();
		//Write prog.2 confirm if number is even or no!
		
		Scanner excel = new Scanner(System.in);
		System.out.println("please print the required number");
		int Num = excel.nextInt();
		System.out.println("the required number is " + Num);
		
		if (Num%2 == 0) {System.out.println("Num value is even");}
		else {System.out.println("Num value is an odd one");}
		excel.close();
		
		//write java prog 2 get # from user and to inform if its + or -ve
		int n=11;
				Scanner pB = new Scanner(System.in);
				System.out.println("please enter number");
				int number = pB.nextInt();
				System.out.println("number"+number);
				if (n>0) {System.out.println("number is pos.");}
				else if (n<0) {System.out.println("number is neg.");
				}
				else {System.out.println("number is zerooo.");
				}
		pB.close();
		
		//just understanding : if else,if else, ELSE!
		int x=40;
		if (x==10) {System.out.println("x = 10 ");}
		else if (x==20) {System.out.println("x = 20 ");}
		else if (x==30) {System.out.println("x = 30 ");}
		
		else {System.out.println("x is NA ");}
		
		
	}

}