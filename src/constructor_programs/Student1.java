package constructor_programs;

public class Student1 { //  constructor overloading(more than one constructor [with diff parameters]) example

	int stdid;
	String stdname;
	int stdage;
	
	Student1(int i, String j)
	{
		stdid=i;
		stdname=j;
	}
	
	Student1(int i, String j, int a)
	{
		stdid=i;
		stdname=j;
		stdage=a;
	}
	
	void display()
	{
		System.out.println(stdid + " " + stdname+ " " + stdage);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1= new Student1(101, "Mukesh", 28);
		Student1 s2= new Student1(201,"Sona");
		s1.display();
		s2.display();

	}

}
