package loooping;

import java.util.Scanner;

public class prg_1 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter num1:");
		a=s.nextInt();
		System.out.print("Enter num2:");
		b=s.nextInt();
		System.out.print("Enter num2:");
		c=s.nextInt();
		if(a>b&&a>c)
			System.out.println("a is greater: "+a);
		else if(b>c)
			System.out.println("a is greater: "+b);
		else
			System.out.println("a is greater: "+c);
			
		
		
		s.close();
	}

}
