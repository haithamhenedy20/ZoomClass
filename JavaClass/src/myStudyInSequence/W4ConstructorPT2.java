package myStudyInSequence;

public class W4ConstructorPT2 {

	public static void main(String[] args) {
		
		
		//W4Constructors caller = new W4Constructors();
		//caller.prt_employee_data();
		
		
	W4Constructors twovariablesconstructorcaller = new W4Constructors(50 , "sayed" );
	twovariablesconstructorcaller.prt_employee_data();
		
  W4Constructors Threevariablesconstructorcaller = new W4Constructors(200 , "sayed","nesha" );
		Threevariablesconstructorcaller.prt_employee_data();
		
	W4Constructors fourvariablesconstructorcaller = new W4Constructors(5550 , "xxx","sasas",550.0);
	fourvariablesconstructorcaller.prt_employee_data();
		
	W4Constructors fivevariablesconstructorcallerChain = new W4Constructors(5550 , "xxx","sasas",550.0,1.1);
	fivevariablesconstructorcallerChain.prt_employee_data();
		
	//matzawelsh nafsak lw maftakartesh a dah
		int b= W4Constructors.no_of_aa();
		System.out.println("please"+b);
		
	}

}
