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

}
