import java.util.Scanner;

public class Sum_digits {

	public static void main(String[] args) {
		int n,r,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the input: ");
		n=s.nextInt();
		while(n>0)
		{
			r=n%10;
			sum+=r;
			n=n/10;
		}
		System.out.println("sum = "+sum);
		s.close();
	}
		
}
