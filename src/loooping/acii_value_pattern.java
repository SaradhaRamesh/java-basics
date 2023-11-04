package loooping;

import java.util.Scanner;

public class acii_value_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n,ascii;
		int n;
		char ch;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the n value:");
		n=s.nextInt();
		for(int i=1;i<=n;i++) {
			//ascii=65;
			ch='A';
			for(int j=1;j<=i;j++) {
				//System.out.printf("%c ",ascii);
				System.out.print(ch++);
				
				//ascii++;
			}
			System.out.println();
		}
	}

}
