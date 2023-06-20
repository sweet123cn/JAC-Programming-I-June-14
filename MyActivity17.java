package package_June14;

import java.util.Scanner;

public class MyActivity17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("please input a integer number:");
		int num = kb.nextInt();

		for (int i = 1; i <= 10; i++)
		{
			System.out.println(num + "*" + i + " =" + num*i);
		}

		kb.close();
	}

}
