package Array_prg;

import java.util.Scanner;

public class File_1 {
	void printarr(int n,int arr[]) {
		System.out.print("Array elemnet:");
		for(int i=0;i<n;i++) 
			System.out.println(arr[i]);
		
			}
	public static void main(String[] args) {
		File_1 obj=new File_1();
		Scanner s= new Scanner(System.in);
		int n;
		System.out.print("Enter the n elements:");
		n=s.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter the array elements:");
		for(int i=0;i<n;i++) 
			arr[i]=s.nextInt();
			obj.printarr(n,arr);
		
	}

}
