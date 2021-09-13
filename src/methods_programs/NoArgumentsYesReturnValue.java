package methods_programs;

public class NoArgumentsYesReturnValue {
	
	public static int display()
	{
		System.out.println("In display method");
		return 100;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main method entry point");
		display();
		System.out.println("Main method exist point");
		System.out.println(display());
	}

}
