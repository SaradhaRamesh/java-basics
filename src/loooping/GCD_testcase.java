package loooping;

import java.util.Scanner;

public class GCD_testcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		s.useDelimiter("[\\s]+");
		int n1=s.nextInt();
		int n2=s.nextInt();
		int gcd=1;
		for(int i=1;i<=n1&&i<=n2;i++) {
			if(n1%i==0&&n2%i==0)
				gcd=i;
		}
//System.out.print("GCD of "+n1+" and "+n2+" is "+gcd);
if(gcd ==1)
	System.out.print("-1");
else
	System.out.print(gcd);
	}

}
