package loooping;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		int gcd=1;
		for(int i=1;i<=n1&&i<=n2;i++) {
			if(n1%i==0&&n2%i==0)
				gcd=i;
		}
		int lcm=(n1*n2)/gcd;
System.out.print("LCM of "+n1+" and "+n2+" is "+lcm);

	}

}
