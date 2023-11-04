package Regular_Expression;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example2 {

	public static void main(String[] args) {
		List <String>words = Arrays.asList("one","teo","three","four","five","six","1seven","eleven");
		Pattern p = Pattern.compile("..even");
		for(String word:words) {
			Matcher m=p.matcher(word);
			if(m.matches())
				System.out.printf("%s-> matches %n",word);
			else
				System.out.printf("%s->does not matches %n",word);
		}
	}

}
