package package_June14;

import java.util.Scanner;

public class MyActivity09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("please input the number of minutes:");
		long minutesNum = kb.nextLong();

		while (minutesNum < 0)
		{
			System.out.println("the number of minutes valid, please input again:");
			minutesNum = kb.nextLong();
		}

		long years = 0;
		long days = 0;

		years = minutesNum / (60*24*365);
		minutesNum = minutesNum - (years * 60 * 24 * 365);

		days = minutesNum / (60*24);
		minutesNum = minutesNum - (days * 60 * 24);
        
        System.out.println("it is " + years + " years, " + days + " days, " + minutesNum + " minutes");

		kb.close();
	}

}
