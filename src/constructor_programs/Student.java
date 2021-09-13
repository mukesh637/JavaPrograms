package constructor_programs;

public class Student {    // Parameterizes constructor example
	
	int stdid;
	String stdname;
	int stdage;
	
	Student(int i, String j)
	{
		stdid=i;
		stdname=j;
	}
	
	void display()
	{
		System.out.println(stdid + " " + stdname);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1= new Student(10,"Mukesh");
		Student s2= new Student(20,"Sona");
		s1.display();
		s2.display();

	}

}
