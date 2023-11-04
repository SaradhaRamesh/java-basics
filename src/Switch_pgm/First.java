package Switch_pgm;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		int stud_id, m1,m2,m3,tot,avg;
		String stud_name;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter student id");
		stud_id=s.nextInt();
		System.out.println("Enter student name");
		stud_name=s.next();
		System.out.println("Enter m1");
		m1=s.nextInt();
		System.out.println("Enter m2");
		m2=s.nextInt();
		System.out.println("Enter student m3");
		m3=s.nextInt();
		tot= m1+m2+m3;
		avg=tot/3;
		if(avg >= 90)
			System.out.println("Excellent");
		else if(avg >= 80)
			System.out.println("Very good");
		else if(avg >= 70)
			System.out.println("Good");
		else if(avg >= 60)
			System.out.println("improve");
		else if(avg >= 50)
			System.out.println("work hard");
		else if(avg >= 40)
			System.out.println("Fail");
		else
			System.out.println("Not Eligible");
		
		
		
		
		
		
		

	}

}
