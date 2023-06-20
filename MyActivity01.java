package package_June14;

import java.util.Scanner;

public class MyActivity01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		System.out.println("please input the principle:");
		double principle = kb.nextDouble();

		while ( principle < 0 )
		{
			System.out.println("principle invalid, please input positive num:");
			principle = kb.nextDouble();
		}

		System.out.println("please input the interestRate:");
		double interestRate = kb.nextDouble();

		while ( interestRate < 0 )
		{
			System.out.println("interestRate invalid, please input positive num:");
			interestRate = kb.nextDouble();
		}

		System.out.println("please input the number Of Years:");
		double numOfYears = kb.nextDouble();

		while ( numOfYears < 0 )
		{
			System.out.println("number of years invalid, please input positive num:");
			numOfYears = kb.nextDouble();
		}

		double value = principle;

		for ( int i = 1 ; i <= numOfYears ; i++)
		{
			value = value + value * interestRate;
		}

		System.out.format("profit of investment is %.2f %n" , (value - principle) );

		kb.close();

	}

}
