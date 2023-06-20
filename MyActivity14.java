package package_June14;

import java.util.Scanner;

public class MyActivity14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		int count = 0 ;
		double sum = 0;
		double avg = 0;

		String input;

		while (true)
		{
			System.out.println("please input a number[q or Q to quit]:");
			input = kb.next();

			if (input.equalsIgnoreCase("q"))
			{
				break;
			}

			count = count + 1;
			sum = sum + Double.parseDouble(input);
			avg = sum / count;
			
		}

		System.out.println("the sum is :" + sum);
		System.out.printf("the avg is %.3f %n" , avg);

		kb.close();
	}

}
