package String_Buffer;

public class File_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s1= new StringBuffer();
		StringBuffer s2= new StringBuffer("20");
		StringBuffer s3= new StringBuffer("welcome");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		s1.append("s a r a d h a r a m e s h ");
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		s1.setLength(5);
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		System.out.println(s1);
		System.out.println(s1.reverse());
				

	}

}
