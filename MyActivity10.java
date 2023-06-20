package package_June14;

import java.util.Scanner;

public class MyActivity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("please input number 1:");
		double num1 = kb.nextDouble();

		System.out.println("please input number 2:");
		double num2 = kb.nextDouble();

		System.out.println("please input number 3:");
		double num3 = kb.nextDouble();
		
		double sum = num1 + num2 + num3;
		double avg = sum /3;
        
        System.out.println("Average is : " + avg);

		kb.close();
	}

}
