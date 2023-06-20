package package_June14;

import java.util.Scanner;

public class MyActivity11c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("please input number:");
		int num = kb.nextInt();

		for (int i = 1 ; i <= num ; i++)
		{
			for (int j = 1 ; j <= i ; j++)
			{
				System.out.print(j);
			}
			System.out.println();

		}

		kb.close();
	}

}
