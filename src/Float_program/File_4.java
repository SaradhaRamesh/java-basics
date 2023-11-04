package Float_program;

import java.util.Scanner;

public class File_4 {

	public static void main(String[] args) {
		int num1,num2;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter num 1:");
		num1=s.nextInt();
		System.out.print("Enter num 2:");
		num2=s.nextInt();
		System.out.println(num1+num2);
		s.close();
	}

}
