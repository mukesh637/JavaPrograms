package class_object;

public class NonStaticMembers {
	
	int num1=10; // non-static variable
	
	public void display() // non-static method
	{
		System.out.println("In display method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NonStaticMembers S1= new NonStaticMembers(); // create an object of the class
		
		System.out.println(new NonStaticMembers().num1); // non-static data members can be accessed by an Object
		new NonStaticMembers().display(); // non-static function members can be accessed by an Object
		
		System.out.println(S1.num1); // non-static data members can be accessed by an Object
		S1.display(); // non-static function members can be accessed by an Object
		
		new NonStaticMembers().num1=30; // This is not called Re-initialization,it's not the correct way 
		
		S1.num1=20; // for Re-initialization we must store it in a reference variable
		System.out.println(S1.num1);

	}

}
