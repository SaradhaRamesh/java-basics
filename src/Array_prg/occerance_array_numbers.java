package Array_prg;

import java.util.Scanner;

public class occerance_array_numbers {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int flag=0;
	int n =s.nextInt();
	int arr[]= new int[n];
	int fr[]=new int[n];
	for(int i=0;i<n;i++) {
	arr[i]=s.nextInt();
	}
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
	}
	

	}

}
