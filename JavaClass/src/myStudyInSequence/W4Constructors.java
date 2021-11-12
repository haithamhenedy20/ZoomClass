package myStudyInSequence;

import java.util.Scanner;

public class W4Constructors {
	
	public int Empl_id;
	public String Name ;
	public String department;
	public double salary;
	public double bonus;
	public boolean resident;
	private static int no_of_aa;

//below is default constructor its will replace the original default(hidden) one only difference that i will insert mine values
	public W4Constructors() {
		Empl_id=100;
		Name = "haitham";
		department="dddd";
		salary=10000.2;
		bonus=1.1;
		resident=true;
	}
	//below is constructor with 2 values 
	public W4Constructors (int idno, String name) {
			
			Empl_id = idno;
			Name = name;
		}
	
	//below is constructor with 3 values :	
	
	public W4Constructors (int idno, String name,String DEP ) {
		Empl_id = idno;
		Name = name;
		department=DEP;
	}
	
	//below is constructor with 4 values :
	public W4Constructors (int idno, String name,String DEP, double ss) {
		
		Empl_id = idno;
		Name = name;
		department=DEP;
		ss= salary;
		
	}
	
	//below is constructor with 5 values with chain constructor :
	public W4Constructors (int idno, String name,String DEP, double ss,double ff) {
		//Empl_id = idno;
		//Name = name;
		//department=DEP;
		//ss= salary;
		this (idno, name, DEP, ss);
		ff=bonus;
	}
	
	public static int no_of_aa () {
		
		return no_of_aa;
	}
	
	public void prt_employee_data () {
		System.out.println(Empl_id);
		System.out.println(Name);
		System.out.println(department);
		System.out.println(salary);
		System.out.println(bonus);
		System.out.println(resident);
		System.out.println(no_of_aa ++);
		
	   }	
	}

