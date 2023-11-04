import java.util.Scanner;

public class Xor_demo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int x=n%4;
		if(x==0)
			System.out.println(n);
		else if(x==1)
			System.out.println("1");
		else if(x==2)
			System.out.println(n+1);
		else if(x==3)
			System.out.println("0");
		
	}

}
