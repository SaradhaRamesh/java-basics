package loooping;

public class label_stmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = {10,20,30,40,50};
		sara :for (int x:number) {
			if(x==30) 
				continue sara;
		
		System.out.print(x);
		System.out.print("\n");
} 
	}

}
