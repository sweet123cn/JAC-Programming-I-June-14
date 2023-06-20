package package_June14;

import java.util.Scanner;

public class MyActivity02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		System.out.println("please input the length:");
		double length = kb.nextDouble();

		while ( length <= 0 )
		{
			System.out.println("length invalid, please input length:");
			length = kb.nextDouble();
		}

		System.out.println("please input the breadth:");
		double breadth = kb.nextDouble();

		while ( breadth <= 0 )
		{
			System.out.println("breadth invalid, please input breadth:");
			breadth = kb.nextDouble();
		}

		if ( length == breadth)
		{
			System.out.println("it is a square");
		}
		else
		{
			System.out.println("it is not a square");
		}

		kb.close();

	}

}
