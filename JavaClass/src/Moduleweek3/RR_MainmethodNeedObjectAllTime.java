package Moduleweek3;

public class RR_MainmethodNeedObjectAllTime {

	int x;
	int y;
	int z;
	
	public void go () {
		//normal method can call instance variable direct
		x=10;
		
	}
	
	public static void main(String[] args) {
		
		RR_MainmethodNeedObjectAllTime xx=new RR_MainmethodNeedObjectAllTime();
		//main method cant call instance variable direct without object

		xx.x=10;
		xx.y=12;
		int ff= xx.x+xx.y;
		System.out.println(ff);
	
		
	}
}
