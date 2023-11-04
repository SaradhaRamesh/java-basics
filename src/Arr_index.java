import java.util.Scanner;

public class Arr_index {

	public static void main(String[] args) {
		int n;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		n=s.nextInt();
		int arr[]=new int[n];//integer array declaration
		String array1[]=new String[n];//string array 
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++) {
			array1[i]=s.next();//getting input
			}
		System.out.println("output");
		for(int i=0;i<n;i++) {
			System.out.println(array1[i]);
			}
		s.close();
	}


}
