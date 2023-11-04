package Regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Insencitive {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("java Traning",Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher("Welcome Java Training");
		boolean matchFound= m.find();
		if(matchFound) 
			System.out.println("Match found");
			else
				System.out.println("Match found");
		

	}

}
