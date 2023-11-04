import java.util.Scanner;

public class Pos_neg {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the value of n:");
		n = s.nextInt();
		if(n>0)
			System.out.println("the given number is positive");
			else if(n==0)
				System.out.println("the given number is zero");
			else 
				
				System.out.println("the given number is negative");

}
}