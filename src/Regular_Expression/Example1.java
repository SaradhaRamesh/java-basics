package Regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("a(bb)");
		Matcher m=p.matcher("aabbabbabbaaa");
		while(m.find())
			System.out.println("start:"+m.start()+"End:"+m.end()+",Group:"+m.group());
		
	}

}
