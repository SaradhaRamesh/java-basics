package loooping;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int temp=0;
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			temp=i*i;
			temp++;
			System.out.print(temp+" ");
			}

	}

}
