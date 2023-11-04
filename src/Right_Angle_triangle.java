import java.util.Scanner;

public class Right_Angle_triangle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		s.useDelimiter("\\s");
		int num1=s.nextInt();
		int num2=s.nextInt();
		int num3=s.nextInt();
		if(num3>num1&&num3>num2) {
			Math.pow(num3,2);
		}
	}

}
