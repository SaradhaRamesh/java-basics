import java.util.Scanner;

public class Switch_prg {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner s= new Scanner(System.in);
		while(true) {
		
		
		int n,m,p;
		
		System.out.println("Enter the first number : ");
		n=s.nextInt();
		System.out.println("Enter the Second number : ");
		m=s.nextInt();
		
		System.out.println("choose the operation you want to perform");
		System.out.println("choose 1 for Addition");
		System.out.println("choose 2 for Addition");
		System.out.println("choose 3 for Addition");
		System.out.println("choose 4 for Addition");
		System.out.println("choose 5 for Addition");
		System.out.println("choose 6 for Addition");
		p=s.nextInt();
		switch(p) {
		case 1:
			System.out.println(n+m);
			break;
		case 2:
			System.out.println(n-m);
			break;
		case 3:
			System.out.println(n*m);
			break;
		case 4:
			System.out.println(n/m);
			break;
		case 5:
			System.out.println(n%m);
			break;
		case 6:
			System.exit(0);
			break;
			
		}
	}
		
	}

}
