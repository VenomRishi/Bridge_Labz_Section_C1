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
import java.util.Random;
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
		int temp = num1;
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

	public static boolean isLeapYear(int year) {
		if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0)
			return true;
		else
			return false;
	}

	public static int calculateDayOfWeek(int day, int month, int year) {
		int y1, x, m, d1;
		y1 = year - (14 - month) / 12;
		x = y1 + (y1 / 4) - (y1 / 100) + (y1 / 400);
		m = month + 12 * ((14 - month) / 12) - 2;
		d1 = (day + x + 31 * m / 12) % 7;
		return d1;
	}

	public static void printCalendar(int day, int days) {
		switch (day) {
		case 0:
			System.out.println("SUN MON TUE WED THU FRI SAT");
			for (int i = 1; i <= days; i++) {
				if (i <= 9) {
					System.out.print(i + "   ");
				} else {
					System.out.print(i + "  ");
				}
				if (i % 7 == 0) {
					System.out.println();
				}
			}
			break;
		case 1:
			System.out.println("SUN MON TUE WED THU FRI SAT");
			System.out.print("    ");
			for (int i = 1; i <= days; i++) {

				if (i <= 9) {
					System.out.print(i + "   ");
				} else {
					System.out.print(i + "  ");
				}
				if (i == 6 || i == 13 || i == 20 || i == 27) {
					System.out.println();
				}
			}
			break;
		case 2:
			System.out.println("SUN MON TUE WED THU FRI SAT");
			System.out.print("        ");
			for (int i = 1; i <= days; i++) {

				if (i <= 9) {
					System.out.print(i + "   ");
				} else {
					System.out.print(i + "  ");
				}
				if (i == 5 || i == 12 || i == 19 || i == 26) {
					System.out.println();
				}
			}
			break;
		case 3:
			System.out.println("SUN MON TUE WED THU FRI SAT");
			System.out.print("            ");
			for (int i = 1; i <= days; i++) {

				if (i <= 9) {
					System.out.print(i + "   ");
				} else {
					System.out.print(i + "  ");
				}
				if (i == 4 || i == 11 || i == 18 || i == 25) {
					System.out.println();
				}
			}
			break;
		case 4:
			System.out.println("SUN MON TUE WED THU FRI SAT");
			System.out.print("                ");
			for (int i = 1; i <= days; i++) {

				if (i <= 9) {
					System.out.print(i + "   ");
				} else {
					System.out.print(i + "  ");
				}
				if (i == 3 || i == 10 || i == 17 || i == 24) {
					System.out.println();
				}
			}
			break;
		case 5:
			System.out.println("SUN MON TUE WED THU FRI SAT");
			System.out.print("                    ");
			for (int i = 1; i <= days; i++) {

				if (i <= 9) {
					System.out.print(i + "   ");
				} else {
					System.out.print(i + "  ");
				}
				if (i == 2 || i == 9 || i == 16 || i == 23 || i == 30) {
					System.out.println();
				}
			}
			break;
		case 6:
			System.out.println("SUN MON TUE WED THU FRI SAT");
			System.out.print("                        ");
			for (int i = 1; i <= days; i++) {

				if (i <= 9) {
					System.out.print(i + "   ");
				} else {
					System.out.print(i + "  ");
				}
				if (i == 1 || i == 8 || i == 15 || i == 22 || i == 29) {
					System.out.println();
				}
			}
			break;
		}

	}

	public static String[] shuffleCardsDeck(String[] arr) {
		Random random = new Random();
		int f1, f2;
		String temp;
		for (int i = 0; i < 52; i++) {
			f1 = random.nextInt(51);
			f2 = random.nextInt(51);
			if (f1 != f2) {
				temp = arr[f1];
				arr[f1] = arr[f2];
				arr[f2] = temp;
			}
		}
		return arr;

	}

	public static double harmonicSeries(int num) {
		double sum = 1;
		if (num == 1) {
			return 1.0;
		} else {
			for (int i = 2; i <= num; i++) {
				sum = sum + ((double) 1 / i);
			}
			return sum;
		}

	}

	public static int rollDice() {
		Random random = new Random();
		return (int) random.nextInt(6) + 1;// 1 to 6
	}
	public static int randomNumber(int range) {
		Random random = new Random();
		return (int) random.nextInt(range) + 1;// 1 to 6
	}

	public void gamling(int stake, int goal, int day) {
		int tempstake = stake;
		int win = 0;
		int loss = 0;
		for (int i = 0; i < day; i++) {
			while (tempstake > 0 && tempstake < goal) {
				if (Math.random() < 0.5) {
					tempstake++;
					win++;
				} else {
					tempstake--;
					loss++;// lose
				}
				if (tempstake == goal) {
					win++;
				}
			}
		}

		int arr[][] = new int[2][1];
		arr[0][0] = win;
		arr[1][0] = loss;

		System.out.println("the number of times the game won is " + arr[0][0]);
		System.out.println("The number of times the game loss is " + arr[1][0]);

	}

	public static int powerOfTwo(int i) {
		return (int) Math.pow(2, i);

	}

	public static int findRepeatedInArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					return arr[i];
				}
			}
		}
		return 0;
	}

	/**
	 * Purpose: for finding triplet or not
	 * 
	 * @param arr array taken from user
	 * @param count	count for how much elements is there in the array
	 */
	public void findDistinctTriplets(int[] arr, int count) {
		for (int i = 0; i < count-2; i++) {
			for (int j = i+1; j < count-1; j++) {
				for (int k = j+1; k < count; k++) {
					if(arr[i]+arr[j]+arr[k]==0) {
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]+" is Triplet");
					}else {
						System.out.println("Not a triplet");
					}
				}
			}
		}
		
		
	}

}
