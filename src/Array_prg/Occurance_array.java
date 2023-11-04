package Array_prg;

import java.util.Scanner;

public class Occurance_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,count=0,element;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter array size:");
		n=s.nextInt();
		System.out.println("Enter all the Elements:");
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			
			arr[i]=s.nextInt();
			}
		System.out.print("Enter the element of which you want to count number of courrence:");
		element=s.nextInt();
		for(int i=0;i<n;i++) {
			if(arr[i]==element) {
				count++;
			
			}
		}
		if(count<1)
			System.out.print("Elemnet not present");
		else
		System.out.print("Number of courrence:"+count);
			}

}
