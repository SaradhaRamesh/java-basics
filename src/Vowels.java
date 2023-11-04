import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char ch= s.next().charAt(0);
		switch(ch) {
			case 'a'|'A':
			case 'i'|'I':
			case 'o'|'O':
			case 'u'|'U':
			case 'e'|'E':
				System.out.print("vowel");
				break;
	default: 
		System.out.print("constant");
		}
	}

}
