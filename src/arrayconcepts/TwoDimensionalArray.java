package arrayconcepts;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x[][] = new String[2][4];
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";
		x[0][3] = "D";
		
		x[1][0] = "A1";
		x[1][1] = "B1";
		x[1][2] = "C1";
		x[1][3] = "D1";
		
		System.out.println(x.length); // To find the length of the Rows
		System.out.println(x[0].length); // To find the length of the columns
		
		// Use 2 for loop to print all the values of 2D array
		for(int row=0;row<x.length;row++) {
			for(int col=0;col<x[0].length;col++) {
				
				System.out.println(x[row][col]);
			}
		}

	}

}
