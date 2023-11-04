
public class Bit_manipulation {
static public boolean isPowerOfTwo(int x)
{
	return (x!=0)&&((x&(x-1))==0);
}
	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(10));
		System.out.println(isPowerOfTwo(8));
		//swapping concept
		int a=5;
		int b=7;
		System.out.println("a="+a);
		System.out.println("b="+b);
		a^=b;
		b^=a;
		a^=b;
		System.out.println("After swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);
	
	}

}
