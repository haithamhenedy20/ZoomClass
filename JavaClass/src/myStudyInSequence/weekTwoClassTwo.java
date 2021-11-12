package myStudyInSequence;

import java.util.Scanner;

public class weekTwoClassTwo {
	
     int x=30;
     
	public static void main(String[] args) {
		//users enter user name
		//users enter password
		//click login
		//if user have account,let him login 2 system
		//if user have no account,display registration page
		Scanner scanobj = new Scanner(System.in);
		System.out.println("please enter user name");
		String username = scanobj.nextLine();
		System.out.println("user name is "+ username);

		//Its confirmed new JDK better to use .equals than 2 use (username == "john")
		if (username.equals("john")) {System.out.println("welcome" +username);}
		else if (username.equals("abc")) {System.out.println("please sign up");}
		}
}