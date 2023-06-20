package package_June14;

import java.util.Scanner;

public class MyActivity13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("please input number of terms:");
		int num = kb.nextInt();

		int sum = 0, value = 0;

		for (int i = 1; i <= num ; i++)
		{
			sum = sum + (int)Math.pow(10,i-1);
			System.out.print(sum + " + ");
			value = value + sum;
		}

		System.out.println();
		System.out.println("The Sum is : " + value);

		kb.close();
	}

}
