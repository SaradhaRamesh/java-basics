package loooping;

import java.util.Scanner;

public class Amstrong_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner s = new Scanner(System.in);
				int n,temp,sum=0,r;
				System.out.print("Enter the n value:");
				n=s.nextInt();
				String str1= String.valueOf(n);
				int len=str1.length();
				
		
		
		temp=n;
		while(n>0) {
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
			
		}
		if(temp==sum)
			System.out.print("Amstrong number");
		else
			System.out.print("Amstrong number");
		
		

	}

}
