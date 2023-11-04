
package Array_prg;

import java.util.Scanner;

public class Remove_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,count,flag=0;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter array size:");
		n=s.nextInt();
		int arr[]=new int[n];
			System.out.println("Enter array elements");
		for(int i=0;i<n;i++) 
			arr[i]=s.nextInt();
		System.out.println("The elements are");
		for(int i=0;i<n;i++) {
			count=0;
			for(int j=0;j<n;j++) {
				if(arr[i]==arr[j]&&i!=j) 
					count++;
				}
			if(count==0) {
				System.out.print(arr[i]+" ");
				flag=1;
			}
		}
			if(flag==0)
				System.out.println("All the elements are repeated");
		}	
		
	}

	

