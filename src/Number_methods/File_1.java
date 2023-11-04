package Number_methods;

public class File_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Integer x=10;
		Float f=x.floatValue();
		System.out.println(x.floatValue());
		System.out.println("f= "+f);
		
		String str="10";
		Integer y=Integer.parseInt(str);
		Double d=y.doubleValue();
		System.out.println("y= "+y);
		System.out.println("d= "+d);
		
		Integer num1=10;
		Integer num2=20;
		System.out.println(num1.compareTo(num2));
		
		String a="hello";
		String b="hello";
		if(a.compareTo(b)==0)
			System.out.println("Both Strings are equal");
		
		Double f1=-20.54;
		System.out.println("abs= "+Math.abs(4-7));
		System.out.println("ceil= "+Math.ceil(f1));
		System.out.println("round= "+Math.round(f1));
		System.out.println("floor= "+Math.floor(f1));
		
		System.out.println("minimum= "+Math.min(12,24));
		System.out.println("maximum= "+Math.max(12,24));
		System.out.println("power value= "+Math.pow(2,3));
		
		//Character methods
		System.out.println(Character.isLetter('a'));
		System.out.println(Character.isDigit('1'));
		System.out.println(Character.isLowerCase('A'));
		System.out.println(Character.isLowerCase('a'));
		System.out.println(Character.isLowerCase('\n'));
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.toUpperCase('b'));
*/
		String str2="welcome";
		String str3="Welcome";
	//	System.out.println(str2.charAt(5));
	//	System.out.println(str2.charAt(10));//index out of range
	//	System.out.println(str2.compareTo(str3));
	//	System.out.println(str2.compareToIgnoreCase(str3));
		
		System.out.println(str2.concat(str3));
		System.out.println(str2.length());
		System.out.println(str2.substring(4));
		System.out.println(str2.substring(2,7));
		System.out.println(str2.replace('e','a'));
	}

}
