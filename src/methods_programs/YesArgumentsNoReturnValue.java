package methods_programs;

public class YesArgumentsNoReturnValue {
	
	public static void display(int i, String j)
	{
		System.out.println("In display method");
		System.out.println(i + "," + j);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Entry Main method");
		display(10,"java");
		System.out.println("Exist Main method");

	}

}
