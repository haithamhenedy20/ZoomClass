package Moduleweek3;

public class aykalam2 {
	
	
	

	public static void main(String[] args) {
		
		String x="hello"; //this is 1st object created in memory -->Hello(obj 1)
		x=x +"hi";       //(this called append)//now ucreated another object and u were not aware -->Hellohi(obj 2)
		//System.out.println(x);
		//this is because as u know string is immutable class- now to make it a mutable class 
		//you have to use string buffer class & string builder class instead both are the same but only 
		//String builder is not thread safe (objects are not synchronized)
		
		//immutable string class
		String z = new String("hi");
		//the below 2 lines is an example for accessor methods
	    int x1=	z.length();
	    System.out.println("2day"+x1);
	    
		System.out.println(z.hashCode());
		z=z+"HIAGAIN";
		System.out.println(z.hashCode());
		
		//mutable string buffer class
		StringBuffer z2 = new StringBuffer("hi");
		System.out.println(z2.hashCode());
		z2.append("jolo");//this is same fnct as concatinuation in the normak string class or same as x=x +"hi";  above
		System.out.println(z2.hashCode());
		System.out.println(z2);
		z2.insert(3, "xxx");
		System.out.println(z2);
	
	}
}
