package package_June14;

import java.util.Scanner;

public class MyActivity12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("please input number:");
		int num = kb.nextInt();

		for ( int i = 1; i <= num ; i++ )
		{
			System.out.println("Number is :" + i + " and cube of the " + i +" is :" + (int)Math.pow(i, 3));
		}

		kb.close();
	}

}
