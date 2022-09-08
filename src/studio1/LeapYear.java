package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("What year do you want to know about?");
		int year = in.nextInt();
		boolean isLeapYear = (year%4 == 0) && ((year%100 != 0) || (year%400 == 0));
		System.out.print(year + " is a leap year: " + isLeapYear);
	}

}
