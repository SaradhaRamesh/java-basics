package programs;

public class Outer {
	 private static char grade='A';
	 static void test() {
		 System.out.println("Grade:Inside ststic method "+grade);
	 }
	 static class Nested{
		 public void fun() {
			 System.out.println("Grade:Inside nested class "+grade); 
		 }
	 }
	 public class check{
		 void display() {
			 System.out.println("check class grade: "+grade);
		 }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Nested obj = new Outer.Nested();
		obj.fun();
		System.out.println("static variable "+grade);
	    test();
	    Outer.check ck = new Outer().new check();
	    ck.display();
	}

}
