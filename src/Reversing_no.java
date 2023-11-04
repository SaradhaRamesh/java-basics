import java.util.Scanner;

public class Reversing_no {

	public static void main(String[] args) {
		int n,r;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the input: ");
		n=s.nextInt();
		while(n>0)
		{
			r=n%10;
			System.out.println(r);
			n=n/10;
			
		}

	}

}
