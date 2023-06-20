package package_June14;

import java.util.Scanner;

public class MyActivity03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		System.out.println("please input the mark[0-100]:");
		double mark = kb.nextDouble();

		while ( mark < 0 || mark > 100 )
		{
			System.out.println("mark invalid, please input mark[0-100]:");
			mark = kb.nextDouble();
		}

		String grade = " ";

		if (mark > 80)
		{
			grade = "A";
		}
		else if (mark > 60) 
		{
			grade = "B";
		}
		else if (mark > 50) 
		{
			grade = "C";
		}
		else if (mark > 45) 
		{
			grade = "D";
		}
		else if (mark >= 25) 
		{
			grade = "E";
		}
		else
		{
			grade = "F";
		}

		System.out.println("grad = " + grade);

		kb.close();
	}

}
