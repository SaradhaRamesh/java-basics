package Array_prg;

import java.util.Scanner;

public class Array_divisiblity {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int sum=0;
		System.out.print("Enter array size:");
		 int n=s.nextInt();
		System.out.println("Read array Elements from user:");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			//System.out.print("Enter array element of index "+i+":");
			arr[i]=s.nextInt();
				}
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
if(sum%2==0&&sum%3==0&&sum%5==0)
	System.out.print("1");
else
	System.out.print("0");
	}

}
