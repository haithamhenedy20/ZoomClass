package Moduleweek3;

public class RR_Prime_Number {
	
	
	public static void main(String[] args) {
		//if there is no remainder THEN the number GIVEN is NOT PRIME (Imagine given = 4 then 4/2 = 2 so Not Prime)
		//If there is remainder THEN the number GIVEN is PRIME (Imagine given = 3 then 3/2 = 1.4 so its Prime)
		//Summary : Prime = remainder exist!
		int given = 2; //this is the number u give an u want to check if its prime or no
		boolean isPrime = true;//any number 2 b prime 1)should be divided by 1 or by itself only 2) to be more than 1
		
		if(given>1) {
			for(int i=2; i<given; i++) {
				
				if(given%i==0) {//translation:if given divided by bla bla (and there was no remainder=0) then its not prime
					isPrime=false;
					break;
				}
			}
		}else
		
			{
				isPrime=true;
			}
			 System.out.println("Given number"+given+"is Prime?"+isPrime);
		}
	   
	    

	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
}
