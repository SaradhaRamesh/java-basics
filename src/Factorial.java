import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		int n,fact=1;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the n value:");
		n=s.nextInt();
		for(int i=1;i<=n;i++) {
			fact*=i;
			}
		System.out.println("factorial of "+n+"  is "+fact);
		

	}

}
