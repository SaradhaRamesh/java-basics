import java.util.Scanner;

public class String_Array {

	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	String word=s.nextLine();
	//Object char_array = list(word);
	char ch[]=word.toCharArray();
	int upper=0,lower=0,vowel=0,consonant=0,whitespace=0,special=0,digit=0;
	for(int i=0;i<ch.length;i++) {
		if(Character.isLetter(ch[i])) {
			if(Character.isUpperCase(ch[i])&&upper==0) {
				System.out.println("Capital letter:"+(i+1));
				upper++;
			}
		
		else if(Character.isLowerCase(ch[i])&&lower==0) {
				System.out.println("Small letter:"+(i+1));
				lower++;
			}
		}
		else if(Character.isDigit(ch[i])&&digit==0) {
			System.out.println("Digit:"+(i+1));
			digit++;
		}

		
		else if(ch[i]==' '&&whitespace==0) {
			System.out.println("Whitespace:"+(i+1));
			whitespace++;
		}
		
		else if(ch[i]!=' '&&special==0&& !Character.isLetter(ch[i])) {
			System.out.println("Special:"+(i+1));
			special++;
		}
		if(vowel==0||consonant==0) {
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
			{
				System.out.println("vowel:"+(i+1));
				vowel++;
			}
			else if(consonant==0){
				System.out.println("Consonant:"+(i+1));
				consonant++;
			}
		}
		
		
		}
	}
			
	
	 

	}


