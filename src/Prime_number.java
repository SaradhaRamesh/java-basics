import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n,count=0;
		System.out.print("Enter n value:");
		n=s.nextInt();
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				System.out.print("Not a prime number");
				count++;
				break;
			}
		}
		if(count==0&&n!=1)
			System.out.print("prime number");
	}

}
