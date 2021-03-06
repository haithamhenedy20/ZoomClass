package myStudyInSequence;

public class NullEmptySpaceZero {

	public static void main(String[] args) {
		String S1="";
		String S2=" ";
		String S3="1";
		String S4="2";
		System.out.println(S1.length());
		System.out.println(S2.length());
		System.out.println("S3B4 REPLACE =" +S3.length());
		System.out.println("S4B4 REPLACE =" +S4.length());
		
		// 2) Empty ---> there is object and value is nothing / empty
		S3=S3.replace("1", "");
		System.out.println("S3 AFTER REPLACE with empty = " +S3.length());
		
	    // 3) Space ---> there is object and there is a value, and it is a space character or space string
		S4=S4.replace("2", " ");
		System.out.println("S3 AFTER REPLACE with space = " +S4.length());
		
		
		
		// Null vs Empty vs Space vs Zero  ----- Referred to an Object State or Behavior
		// ********************************************************
       /*
		public void exampleMehods() {
		// 1) Null ----> there is no object or object is Null
		//    code example 1: 
		      WebDriver myDriver; 
		      
	    //    code example 2:
		      WebDriver myDriver2 = new ChromeDriver();
		      myDriver2 = null;
		
		// 2) Empty ---> there is object and value is nothing / empty  
		//    code exmaple 1:
		      String myStringObject = "";
		      if(myStringObject.isEmpty()) {
		    	  // return True
		      }
		      
	    // 3) Space ---> there is object and there is a value, and it is a space character or space string
		//    code example 1: 
		      String myStringObject2 = " ";
		      
	    //	  code example 2:
		      char myChar = ' ';      
		
		// 4) Zero ---> object return zero instead of all others above      
		//    code example 1:
		      List<String> myListStringObject = new ArrayList<String>();
		      int totalElements = myListStringObject.size();
		      System.out.println("total elements: [ " + totalElements + " ]");
		      // total Elements will return '0' / Zero
		      */
		
	}

}
