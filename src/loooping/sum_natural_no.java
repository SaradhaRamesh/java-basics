package loooping;

import java.util.Scanner;

public class sum_natural_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the value ");
		n=s.nextInt();
		for(int i=-10;i<=n;i++) {
			sum+=i;
		}
		System.out.println("sum of "+n+" is "+sum);
	}

}
