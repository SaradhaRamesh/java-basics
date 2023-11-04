package loooping;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,f1=0,f2=1,f3;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the n value:");
		n=s.nextInt();
		System.out.print(f1+" "+f2+" ");
		
		for(int i=2;i<n;i++) {
			f3=f1+f2;
			System.out.print(f3+" ");
			f1=f2;
			f2=f3;
		}
	}

}
