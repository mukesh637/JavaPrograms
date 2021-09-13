package operatersprograms;

public class LogicalOperators {

	public static void main(String[] args) {
		int i= 10, j=30;
		i=i+10; // compound assignment operator.
		boolean c= true;
		boolean result= (i*j) >= (j*i) && !c;
		boolean result$1= (i*j) >= (j*i) || !c;
		System.out.println(result);
		System.out.println(result$1);
		System.out.println(i);


	}

}
