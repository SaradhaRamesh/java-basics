import java.util.Scanner;

public class Perfect_square {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		s.useDelimiter("[\\s]+");
		int n=s.nextInt();
		int m=s.nextInt();
		if(n==m)
			System.out.print("yes");
		else
			System.out.print("no");
	}

}
