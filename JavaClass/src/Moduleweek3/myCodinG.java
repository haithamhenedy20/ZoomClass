package Moduleweek3;

public class myCodinG {

	public static void main(String[] args) {
		
		//System.out.println("Problem: count how many times a specific character was repeated in a string??");
		String x= "HGYUJKLMHG";
		
		int totalStringLenght= x.length();
		System.out.println("totalStringLenght= "+ totalStringLenght);
		
		x=x.replace("H","");
		System.out.println("new string = "+ x);
		int totalStringLenghtAfterReplacingH=x.length();
		System.out.println("totalStringLenghtAfterReplacingH= "+ totalStringLenghtAfterReplacingH);
		int occuranceOfLetterH= totalStringLenghtAfterReplacingH - totalStringLenght;
		

		System.out.println("-----------------------------------------------------------------------------");

        //System.out.println("Problem: find out how many alpha characters are present in a string?");
		String Y= "HGYU??????";
		System.out.println(Y);

		Y=Y.replaceAll("[^A-Za-z]", "");//each time will replace one alpha character an will give u back the new string & will count it accumulatively 
		System.out.println("String Y after replace alphas with empty's= "+ Y);
		//Replace() = replace a character 'f' or replace substring "hello"
		//ReplaceAll() =The difference between replace() and replaceAll() method is that the replace() method replaces all the occurrences of old char with new char 
		//while replaceAll() method replaces all the occurrences of old string with the new string.


	}

}
