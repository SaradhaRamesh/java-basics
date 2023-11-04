package Array_prg;

import java.util.Scanner;

public class Increament_prg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt()+1;
		}
		for(int i=0;i<n;i++) {
			//arr[i]+=1;
			System.out.print(arr[i]+" ");
		}
			}

}
