package constructor_programs;

public class Bike { // default constructor which displays the default values  
	
	String name;
	String color;
	
	void display()
	{
		System.out.println(name + " " + color);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b1= new Bike();
		b1.display();


	}

}
