package package_June14;

import java.util.Scanner;
import java.math.BigInteger;

public class MyActivity06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("please input positive num for Fibonacchi:");
		int num = kb.nextInt();

		while ( num < 0 )
		{
			System.out.println("num invalid, please input positive num:");
			num = kb.nextInt();
		}

		BigInteger a = BigInteger.ZERO;
		BigInteger b = BigInteger.ONE; 
		BigInteger c = BigInteger.ZERO;
		// 0,1,1,2,3,5,8
		for (int i = 1; i <= num; i++)
		{
			System.out.print(c + " ");
			a = b;
			b = c;
			c = a.add(b);
		}
		
		kb.close();

	}

}
