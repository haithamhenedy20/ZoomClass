package Moduleweek3;

import java.util.ArrayList;

public class RR_arrayListinJava {
	
	public static void main(String[] args) {
		
		//very very important :   https://stackabuse.com/how-to-declare-and-initialize-an-array-in-java/
		ArrayList<String> arrylst = new ArrayList<String>();
		arrylst.add("haytham");
		arrylst.add("kenda");
		arrylst.add("youssef");
		System.out.print("current array list elements : "+arrylst);

		arrylst.add(0, "salem");
		arrylst.add(1, "nesha");
		arrylst.add(2, "jeje");
		System.out.print("current array list elements : "+arrylst);
		
		arrylst.remove(0);
		arrylst.remove(1);
		System.out.print("current array list elements : "+arrylst);
		System.out.print("o index : "+arrylst.get(0));
		
		arrylst.remove(arrylst.size()-1);
		System.out.println("lets see this : " + arrylst);

		for(int i=0 ; i<arrylst.size(); i++) {
			String b = arrylst.get(i);
			System.out.println(b);
		}
	}

}
