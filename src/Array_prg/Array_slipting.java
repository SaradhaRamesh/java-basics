package Array_prg;

import java.util.Scanner;

public class Array_slipting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, pos;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of elements you want in array:");
		n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter all the elements:");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.print("Enter the position from where you want to slpit:");
		pos=s.nextInt();
		System.out.println("First array:");
		for(int i=0;i<pos;i++){
			System.out.println(" "+arr[i]);
			
		}
		System.out.println("Second array:");
		for(int i=pos;i<n;i++){
			System.out.println(" "+arr[i]);
			
		}
		
	}

}
