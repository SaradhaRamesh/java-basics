import java.util.Scanner;

public class prime_inbetween_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int min,max,count=0,temp;
		System.out.print("Enter min value:");
		min=s.nextInt();
		System.out.print("Enter max value:");
		max=s.nextInt();
		for(int n=min;n<=max;n++) {
			count=0;
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					count++;
					
					break;
				}
					
			}
			if(count==0&& n!=1)
			System.out.print(n+" ");
	}}
}