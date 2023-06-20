package package_June14;

import java.util.Scanner;

public class MyActivity15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("please input Grade:");
		String grade = kb.next();
		
		String description = "";
		switch (grade) {
			case "E":
				description = "Excellent";
				break;
			case "V":
				description = "Very Good";
				break;
			case "G":
				description = "Good";
				break;
			case "A":
				description = "Average";
				break;
			case "F":
				description = "Fail";
				break;
			default:
				description = "Grade is error";
				break;
		}

		System.out.println("The grade " + grade + " is equivalent to " + description);

		kb.close();
		
	}

}
