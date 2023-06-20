package package_June14;

import java.util.Scanner;

public class MyActivity04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		int max = 0;
		
		System.out.println("please input number 1:");
		int num1 = kb.nextInt();
		max = num1;

		System.out.println("please input number 2:");
		int num2 = kb.nextInt();
		if (num2 > max)
		{
			max = num2;
		}

		System.out.println("please input number 3:");
		int num3 = kb.nextInt();
		if (num3 > max)
		{
			max = num3;
		}

		System.out.println("please input number 4:");
		int num4 = kb.nextInt();
		if (num4 > max)
		{
			max = num4;
		}

		System.out.println("Maxium = " + max);



		kb.close();
	}

}
