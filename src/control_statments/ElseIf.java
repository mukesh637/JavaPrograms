package control_statments;

public class ElseIf {

	public static void main(String[] args) {
		int a= -10;
		
		if(a>0)
		{
			System.out.println("a is positive number");
		}
		else if(a<0)
		{
			System.out.println("a is negative number");
		}
		else if(a==0)
		{
			System.out.println("a equals to 0");
		}
		else
		{
			System.out.println("number is invalid");
		}
		
		System.out.println("Outside block");

	}

}
