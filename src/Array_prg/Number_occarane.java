package Array_prg;

import java.util.Scanner;

public class Number_occarane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,r,count=0;
		Scanner s= new Scanner(System.in);
		n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) 
			arr[i]=s.nextInt();
		System.out.print("Enter the element you want to check occurance?");
		r=s.nextInt();
		for(int i=0;i<n;i++) {
			if (arr[i]==r)
				count++;
		}
		System.out.println(count);
	}

}
