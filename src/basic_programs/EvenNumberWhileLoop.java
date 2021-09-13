package basic_programs;

public class EvenNumberWhileLoop {

	public static void main(String[] args) {
		//WAP to find out the even number between 20-40 range.
	     int num1=20, num2=40;
	     
	     while(num1<=num2)
	     {
	    	 if(num1%2==0)
	    	 {
	    		 System.out.println(num1);
	    	 }
	    	 num1++;
	     }

	}

}
