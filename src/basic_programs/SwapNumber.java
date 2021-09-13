package basic_programs;

public class SwapNumber {

	public static void main(String[] args) {
		int a=10, b=20, temp;
		
		temp=b;
		b=a;
		a=temp;
		
		System.out.println("Print current value of a: " + a);
		System.out.println("Print current value of b: " + b);

	}

}
