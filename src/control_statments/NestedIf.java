package control_statments;

public class NestedIf {

	public static void main(String[] args) {
		int num=200;
		
		if(num>100)
		{
			System.out.println(num + " is greater than 100");
		
		    if(num==200)
		    {
			  System.out.println(num + " is equal to 200");
		    }
		    if(num<100)
		    {
			  System.out.println(num + " is less than 100");
		    }
		}  
		else
		{
			System.out.println(num + " is invalid");
		}
		
		}
	}	


