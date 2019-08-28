package com.bridgelabz.arrays;

import java.util.Scanner;

import com.bridgelabz.utility.ArraysUtility;

public class CalendarTwoDim {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int month, year;
		boolean isLeapYear;
		int days, day;
		int[] daysPerYear = { 31, 28, 30, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		System.out.println("Enter month");
		month = scanner.nextInt();
		if (month > 0 && month <= 12) {
			System.out.println("Enter Year");
			year = scanner.nextInt();
			if (year > 1582 && year < 9999) {
				isLeapYear = ArraysUtility.isLeapYear(year);
				if (isLeapYear && month == 2) {
					days = 29;
					day = ArraysUtility.calculateDayOfWeek(1, month, year);
					ArraysUtility.printCalendar(day,days);
					
				} else {
					days = daysPerYear[month - 1];
					day = ArraysUtility.calculateDayOfWeek(1, month, year);
					ArraysUtility.printCalendar(day,days);
				}

			} else
				System.out.println("please enter valid year");
		} else
			System.out.println("Please enter valid month");

		scanner.close();
	}

}
