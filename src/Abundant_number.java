import java.util.Scanner;

public class Abundant_number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//System.out.print("Enter the input value:");
		int n = s. nextInt();
		int sum=0;
			for(int i=1;i<=n/2;i++) {
				if(n%i==0) {
					sum=sum+i;
				}
						
			}
			if(sum>n)
				System.out.print("abudant number");
			else
				System.out.print("Not abudant number");
		}
			
	}


