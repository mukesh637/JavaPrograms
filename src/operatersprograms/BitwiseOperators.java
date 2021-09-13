package operatersprograms;

public class BitwiseOperators {

	public static void main(String[] args) {
		int a=6, b=5;
		System.out.println("Print the value of & bitwise o/p " + (a&b));
		System.out.println("Print the value of | bitwise o/p " + (a|b));
		System.out.println("Print the value of ^ bitwise o/p " + (a^b));
		System.out.println("Print the value of ~ bitwise o/p " + (~a)); // little different logic here: formula ~n= -(n+1);
		System.out.println("Print the value of ~ bitwise o/p " + (~b)); // little different logic here: formula ~n= -(n+1);
		System.out.println("Print the value of >> bitwise o/p " + (a>>1));
		System.out.println("Print the value of >> bitwise o/p " + (a>>2));
		System.out.println("Print the value of << bitwise o/p " + (a<<1));
		System.out.println("Print the value of << bitwise o/p " + (a<<2));
		int c= -2;
		System.out.println("Print the value of ~ bitwise o/p " + (~c)); // little different logic here: formula ~n= -(n+1);

	}

}
