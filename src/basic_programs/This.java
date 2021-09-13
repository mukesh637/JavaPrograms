package basic_programs;

public class This {
	
	int stdid;     // instance variables
	String stdname;
	float stdfees;
	
	/*parameters (formal arguments) and instance variables are same. 
	So, we are using this keyword to distinguish local variable and instance variable.*/
	
	This(int stdid,String stdname,float stdfees)  // local variables
	{
		this.stdid= stdid;
		this.stdname= stdname;
		this.stdfees= stdfees;
	}
	
	void student()
	{
		System.out.println(stdid + stdname + stdfees);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This t1 = new This(101,"Mukesh",2000);
		This t2 = new This(102,"Sona",3000);
		t1.student();
		t2.student();

	}

}
