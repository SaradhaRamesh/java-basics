import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,r,rev=0,temp;
		Scanner s =new Scanner(System.in); 
		System.out.print("Enter the input: ");
		n=s.nextInt();
		temp=n;
		while(n>0) {
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		//System.out.println("rev: "+rev);
		if(temp==rev)
			System.out.println("palindrome ");
		else
			System.out.println("Not a palindrome ");
	}
	

}
