package loooping;

import java.util.Scanner;

public class num_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the input: ");
		n=s.nextInt();
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
				System.out.println();
							}
		
	}

}
