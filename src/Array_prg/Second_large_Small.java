package Array_prg;

import java.util.Scanner;

public class Second_large_Small {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,temp;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter array size:");
		n=s.nextInt();
		System.out.println("Read array Elements from user:");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			//System.out.print("Enter array element of index "+i+":");
			arr[i]=s.nextInt();
				}
		for(int i=0;i<n-1;i++)//n-1 ==> if we give i<n there will be no element to compare after that 
		{
			for(int j=i+1;j<n;j++)// i+1 indicates next value of i
			{
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				}
			
			}
			System.out.print("Smallest:"+arr[1]);
			System.out.print("\nlargest :"+arr[n-2]);
		
		}
	




	}


