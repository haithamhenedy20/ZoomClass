package Moduleweek3;


public class RR_SwapNumbersAndStrings {
	//write a program to swap 2 numbers without temporary variable/2 string without temp variable!
		public static void main(String[] args) {
		
			int a = 10;
			int b = 20;
			
			a = a + b ; // now i did a = 30
		    b = a - b ;// now b = 30-20 (10)
		    a = a - b ;// now a = 30-10 (20)
		   
		    System.out.println("new a is / "+a);
		    System.out.println("new b is / "+b);
		   
		    
			System.out.println("-----------------------------------------------------------------------------");
		   
	//swap strings
		    String x = "Hello";
		    String y = "Welcome";
		   
		    x = x + y ; //HelloWelcome
		    y = x.substring(0,x.length()-y.length());//substring method takes 2 numbers in this case
		    x = x.substring(y.length());
		   
		    System.out.println(x);
		    System.out.println(y);
		    
			System.out.println("-----------------------------------------------------------------------------");
			
			
			
			
			
		}
	}
	
