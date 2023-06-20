package package_June14;

import java.util.Scanner;
import java.math.BigInteger;

public class MyActivity07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("please input positive num:");
		int num = kb.nextInt();

		while ( num < 0 )
		{
			System.out.println("num invalid, please input positive num:");
			num = kb.nextInt();
		}

		BigInteger fact = BigInteger.ONE;

		if (num == 0)
		{
			fact=BigInteger.ONE;;
		}
		for (int i=1; i<= num ; i++)
		{
			fact = fact.multiply((BigInteger.valueOf(i)));
		}
		System.out.println("the factorial of " + num + " is : " + fact);
		
		kb.close();
	}

}
