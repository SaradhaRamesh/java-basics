package Array_prg;

import java.util.Scanner;

public class Array_duplicate_remove {

	public static void main(String[] args) {
		int n,count=0;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter array size:");
		n=s.nextInt();
		//System.out.println("Read array Elements from user:");
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
					arr[i]=s.nextInt();
				}
		for(int i=0;i<n;i++) {
			count=0;
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) 
					count++;
				}
			if(count==0) {
				System.out.print(arr[i]+" ");
			
			}
			
		}
			
	
			
	}

}
