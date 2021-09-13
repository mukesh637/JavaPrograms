package arrayconcepts;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[1]);
		System.out.println(i.length); // To find out the length of the array
		//System.out.println(i[4]); // ArrayIndexOutOfBoundsException
		
		for(int j=0;j<i.length;j++) // To print all the array value in console
		{
			System.out.println(i[j]);
			
		}
		
		Object ob[] = new Object[6]; // Object is a class, by using Object array concept we can store multiple data types values.
		ob[0] = 10;
		ob[1] = "Mukesh";
		ob[2] = 'M';
		ob[3] = "17-05-1991";
		ob[4] = "bangalore";
		ob[5] = 99.5;
		
		for(int j=0;j<ob.length;j++) // To print all the array value in console
		{
			System.out.println(ob[j]);
			
		}
		

	}

}
