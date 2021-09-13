package basic_programs;

import java.util.Scanner;

public class MyScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		double accbal= 2000.0;
		System.out.println("Enter the amount to be withdrawn:");
		double amt= sc.nextDouble();
		amt= accbal;
		System.out.println(amt);

	}

}
