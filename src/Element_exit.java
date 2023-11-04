import java.util.Scanner;

public class Element_exit {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		s.useDelimiter("[\\s]+");
		int check=0;
		int n=s.nextInt();
		int k=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) { 
			arr[i]=s.nextInt();
			if(arr[i]==k) {
				check++;
			System.out.print("yes");
			break;
			}
			}
			if(check==0)
				System.out.print("no");
			
		
	
		
		s.close();
	}

}
