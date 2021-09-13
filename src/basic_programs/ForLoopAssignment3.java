package basic_programs;

public class ForLoopAssignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int a=1; a<=5; a++)
		{
			for(int b=1; b<=5; b++)
			{
				if(b<=a)
				{
					System.out.print("*");	
				}
			}
			System.out.println();
		}

	}

}
