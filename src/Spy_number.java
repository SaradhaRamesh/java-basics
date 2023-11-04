import java.util.Scanner;

public class Spy_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,temp=1,sum=0,o;
		Scanner s = new Scanner(System.in);
		//System.out.print("");
		int n= s.nextInt();
		o=n;
		while(n>0) {
			r=n%10;
			sum+=r;
			temp*=r;
			n=n/10;			
		}
		//System.out.print("sum="+sum);
		//System.out.print("temp="+temp);
		if(temp==sum)
			System.out.println(o+" is a spy number");
		else
			System.out.println(o+" is not a spy number");
	}

}
