/******************************************************************************
 *  Purpose: This is utility file which contains logic for files.
 *  		 this file is having methods who can take input process it and 
 *  		 returns the output.
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   25-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.utility;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysUtility {
	Scanner scanner = new Scanner(System.in);

	/**
	 * @param intArr
	 * @param row
	 * @param col
	 */
	public void enter2DIntArray(int[][] intArr, int row, int col) {
		// TODO Auto-generated method stub
		System.out.println("Enter value for it");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("Enter int value :" + i + " " + j);
				intArr[i][j] = scanner.nextInt();
			}
		}
	}

	/**
	 * @param intArr
	 */
	public void print2DIntArray(int[][] intArr) {
		for (int i = 0; i < intArr.length; i++) {
			for (int j = 0; j < intArr.length; j++) {
				System.out.print(intArr[i][j] + " ");
			}
			System.out.println();
		}

	}

	/**
	 * @param doubleArr
	 * @param row
	 * @param col
	 */
	public void enter2DDoubleArray(double[][] doubleArr, int row, int col) {
		// TODO Auto-generated method stub
		System.out.println("Enter value for it");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("Enter double value for :" + i + " " + j);
				doubleArr[i][j] = scanner.nextDouble();
			}
		}

	}

	/**
	 * @param doubleArr
	 */
	public void print2DDoubleArray(double[][] doubleArr) {
		for (int i = 0; i < doubleArr.length; i++) {
			for (int j = 0; j < doubleArr.length; j++) {
				System.out.print(doubleArr[i][j] + " ");
			}
			System.out.println();
		}

	}

	/**
	 * @param boolArr
	 * @param row
	 * @param col
	 */
	public void enter2DBoolArray(boolean[][] boolArr, int row, int col) {
		// TODO Auto-generated method stub
		System.out.println("Enter value for it");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("Enter boolean value for :" + i + " " + j);
				boolArr[i][j] = scanner.nextBoolean();
			}
		}
	}

	/**
	 * @param boolArr
	 */
	public void print2DBoolArray(boolean[][] boolArr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < boolArr.length; i++) {
			for (int j = 0; j < boolArr.length; j++) {
				System.out.print(boolArr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static boolean isPrime(int num) {
		if (num == 0 || num == 1)
			return false;//
		else {
			for (int i = 2; i < num / 2; i++) {
				if (num % i == 0) {
					return false;//
				}
			}
		}

		return true;
	}

	public static boolean isAnagram(int num1, int num2) {
		String str1, str2;
		str1 = String.valueOf(num1);
		str2 = String.valueOf(num2);
		if (str1.length() != str2.length()) {
			return false;
		} else {
			char[] ch1 = new char[str1.length()];
			for (int i = 0; i < ch1.length; i++) {
				ch1[i] = str1.charAt(i);
			}
			char[] ch2 = new char[str2.length()];
			for (int i = 0; i < ch2.length; i++) {
				ch2[i] = str2.charAt(i);
			}
			Arrays.sort(ch1);
			Arrays.sort(ch2);

			if (Arrays.equals(ch1, ch2)) {
				return true;
			} else {

				return false;
			}
		}

	}

	public static boolean isPalindrome(int num1) {
		int sum = 0;
		int r;
		int temp=num1;
		if (num1 <= 10) {
			return false;
		} else {
			while (num1 > 0) {
				r = num1 % 10;
				sum = (sum * 10) + r;
				num1 = num1 / 10;
			}
			if (temp == sum)
				return true;
			else
				return false;

		}

	}
}
