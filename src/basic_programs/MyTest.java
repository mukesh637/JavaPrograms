package basic_programs;

public class MyTest {

	public void student() 
	{
	int num1=101; // Local variable
	System.out.println("In local variable: " + num1);
	}
	
	int stdid=50; // non-static variable
	public String student1(String name) // non-static method
	{
		System.out.println(name);
		return "sahu";
	}
	
	static String stdname="Mukesh"; // static variable	
	public static int student2(int id) // static method
	
	{
		System.out.println("student id: " + id);
		return 200;
	}
	// Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(stdname); // Static members can be accessed by directly or by class name.
		//student1(102);
		System.out.println(student2(102));
		
		System.out.println(MyTest.stdname);
		System.out.println(MyTest.student2(102));
		
		MyTest t1= new MyTest(); // Create object of the class to access the non-static members.
		System.out.println(t1.stdid);
		System.out.println(t1.student1("sonali"));
		
		t1.student();
		
	}

}
