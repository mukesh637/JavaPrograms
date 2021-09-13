package oops_programs;

public class Bird extends Animal {
	
	String name="parrot";
	
	public String eat(String size)
	{
		System.out.println("Parrot is a bird and it's eating");
		System.out.println(size);
		return "small";
	}

}
