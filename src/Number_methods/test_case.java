package Number_methods;

import java.util.Scanner;

public class test_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0,r,o=0;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter any number:");
		n=s.nextInt();
		
		
		while(n>0) {
			r=n%10;
			r++;
			sum=sum*10+r;
			n=n/10;
			}
		
		while(sum>0) {
			r=sum%10;
			o=o*10+r;
			sum=sum/10;
			
		}
		System.out.print(o);
		
	}

}
