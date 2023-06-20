package package_June14;

import java.util.Scanner;

public class MyActivity11e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("please input number:");
		int num = kb.nextInt();

		for (int i = 1 ; i <= num ; i++)
		{
			for (int j = 1 ; j<= num-i ; j++)
			{
			System.out.print(" ");
			}

			for (int j = num-i ; j < num ; j++)
			{
				System.out.print("*");
			}
			System.out.println();

		}

		for (int i = 1 ; i <= num-1 ; i++)
		{
			for (int j = num-i ; j< num ; j++)
			{
			System.out.print(" ");
			}

			for (int j = 1 ; j <= num-i ; j++)
			{
				System.out.print("*");
			}
			System.out.println();

		}

		kb.close();
	}

}
