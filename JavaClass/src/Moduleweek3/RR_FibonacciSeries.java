package Moduleweek3;

public class RR_FibonacciSeries {

	public static void main(String[] args) {
		 
		// write program 2 print the 1st 10 numbers of febonacci series
		//In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc
					
		/*int a,b,c;
					
		a=0;
		b=1;
		for (int i=1;i<10 ; i++) {
			System.out.println(a) ;
			c=a+b;//c=1
			//a=b;//a=1
			//b=c;//b=1c;//b=1
			
			System.out.println("-----------------------------------------------------------");
			*/
		
		System.out.println("Problem 4.1-----------------------------------------------------------------");
		System.out.println("Problem: count how many times a specific character was repeated in a string??");
			//null=  e7la2           empty=  ""/no count     Space= " " countable 
			String str="Hih9898jhjh%%";
			System.out.println(str);
			int Total= str.length();
			System.out.println("String count before replacing the h with empty= " +Total);
			str= str.replace("h","");
			System.out.println(str);
			int Total2= str.length();
			System.out.println("String count after replacing the h with empty= "+ Total2);
			int TotalCountOfHletter= Total-Total2;
			System.out.println("TotalCountOfHletter = " + TotalCountOfHletter);
			
			
			
		System.out.println("Problem 4.2------------------------------------------------------------------");
        System.out.println("Problem: find out how many alpha characters are present in a string?");
		//null=             empty=  ""/no count     Space= " " countable 
			
			//"[^]" = this means all
			String stri="1234567RFRF";
			System.out.println(stri);
			
			//int numberOLD = stri.length();
			//System.out.println("Number words in string OLD :"+numberOLD);
			stri= stri.replaceAll("[^A-Za-z]", "");
			System.out.println(stri);
			int numberNEW = stri.length();
		   //system.out.println("Number words in string NEW :"+numberNEW);
			System.out.println("how many alpha characters in string  :"+numberNEW);

			
			
		System.out.println("Problem 4.3----------------------------------------------------------");
        System.out.println("Problem: find out no. of words in string?");
			
			String myString="Today is Wednesday and it is Java Class";
			String[] array = myString.split(" ");
			int words = array.length;
			System.out.println("Total words in string :: "+myString+"="+words);
			
			
		//Problem: Write a Java Program to reverse 
			System.out.println("Problem 5.----------------------------------------------------------");
			
			
				
			  
		}
   }
	
