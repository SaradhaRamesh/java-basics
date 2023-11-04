import java.util.Scanner;

public class Test_cae {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N=s.nextInt();
		s.useDelimiter("[\\s]+");
		int check=0;
		int L=s.nextInt();
		int R=s.nextInt();
		//int arr[]=new int[R];
		/*for(int i=0;i<=R;i++) 
			for(int j=L;j<R;j++)
		{ 
			arr[i]=L++;
			if(arr[i]==N) {
				check++;
			System.out.print("yes");
			break;
			}
			}
			if(check==0)
				System.out.print("no");
		*/
		if(N>=L && N<=R)
			System.out.println("yes");
		else
			System.out.println("no");
			
	}

}
