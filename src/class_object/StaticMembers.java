package class_object;

public class StaticMembers {
	
	static int a=10; // static variable
	
	public static void display() // static method
	{
		System.out.println("Display method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(a); // if static members are present within same class,
		display();             //  then we can access them in 2 ways: 1. directly, 2. by class name	
		System.out.println(StaticMembers.a);
		StaticMembers.display();
		a=20; // for Re-initialization we can direct change the value of the variable
		System.out.println(a);
		
// if static members are present in different class, then we can access them in 1 way: by class name

	}

}

