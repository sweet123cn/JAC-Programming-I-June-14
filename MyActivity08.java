package package_June14;

import java.util.Scanner;

public class MyActivity08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("please input Fahrenheit temperature:");
		double tempF =Math.round(kb.nextDouble() * 10.0) /10.0;

		double tempC = (tempF - 32) * 5 / 9;
        
        System.out.printf("Temperature in Celsius: %.2f %n" , tempC);


		kb.close();

	}

}
