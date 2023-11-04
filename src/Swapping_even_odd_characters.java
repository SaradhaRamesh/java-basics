import java.util.Scanner;

public class Swapping_even_odd_characters {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String n=s.next();
		int str=n.length();
		char ch[]=n.toCharArray();
		for(int i=0;i<str-1;i+=2) {
			System.out.print(ch[i+1]+""+ch[i]);
		}
	}

}
