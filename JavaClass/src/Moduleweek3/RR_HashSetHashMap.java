package Moduleweek3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class RR_HashSetHashMap {
	
	public static int x=10;

	public static void main(String[] args) {
		
		//Hashset doesnot allow duplicates, see below console..
		Set<String> set= new HashSet<String>();
		set.add("haytham");
		set.add("Hundy");
		set.add("last");
		set.add("last");
		set.add("last");
		System.out.println(set);
	
		//hash Map is for set of keys&values'
		Map<String, String> map= new HashMap<String, String>();
		map.put("Haytham","Hundy");
		map.put("Yassin","Haytham");
		map.put("Kenda","Haytham");//key duplication only 1 chosen
		map.put("Kenda","h");//key duplication only 1 chosen
		map.put("z","x");
		map.put("x","Haytham");//to add an object to hashmap
		//map.get("x");//to get an object from hashmap
		//map.remove("x");//to remove an object from hashmap
		

		System.out.println(map);
		System.out.println(map.get("x"));
		map.size();
		System.out.println(map.size());
		

			
		}
	}

