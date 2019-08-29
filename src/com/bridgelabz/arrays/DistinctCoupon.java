package com.bridgelabz.arrays;

import java.util.Scanner;

import com.bridgelabz.utility.ArraysUtility;

public class DistinctCoupon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int range;
		System.out.println("enter how many times generate coupons");
		range = scanner.nextInt();
		int[][] arr = new int[2][range];
		/*
		 * ------ ------
		 */
		for (int i = 0; i < range; i++) {
			arr[0][i] = i + 1;
			arr[1][i] = 0;
		}
		/*
		 * 123456 000000
		 */
		int coupon;
		for (int i = 0; i < range; i++) {
			coupon = ArraysUtility.randomNumber(range);// 2
			arr[1][coupon] = arr[1][coupon]+ 1;

		}

		// printing array
		System.out.println("range number");
		for (int i = 0; i < range; i++) {
			System.out.print(arr[0][i] + " ");
		}
		System.out.println();
		System.out.println("Count coupons occurence");
		for (int i = 0; i < range; i++) {
			System.out.print(arr[1][i] + " ");
		}
		System.out.println();
		for (int j = 0; j < range; j++) {
			if (arr[1][j] == 1) {
				System.out.print(arr[0][j] + " coupon comes disting");
				System.out.println();
			}
		}

		scanner.close();

	}

}
