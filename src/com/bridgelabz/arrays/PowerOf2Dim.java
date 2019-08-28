package com.bridgelabz.arrays;

import java.util.Scanner;

import com.bridgelabz.utility.ArraysUtility;

public class PowerOf2Dim {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter range from 1 to 31");
		int range = scanner.nextInt();
		int[][] powerArr = new int[5][];
		int unitcounts = 0, tenscounts = 0, hundredscounts = 0, thousandscount = 0, lacscounts = 0;
		// for getting the dimensions
		for (int i = 1; i <= range; i++) {
			if (ArraysUtility.powerOfTwo(i) <= 9) {
				unitcounts++;
			} else if (ArraysUtility.powerOfTwo(i) >= 10 && ArraysUtility.powerOfTwo(i) <= 99) {
				tenscounts++;
			} else if (ArraysUtility.powerOfTwo(i) >= 100 && ArraysUtility.powerOfTwo(i) <= 999) {
				hundredscounts++;
			} else if (ArraysUtility.powerOfTwo(i) >= 1000 && ArraysUtility.powerOfTwo(i) <= 99999) {
				thousandscount++;
			} else {
				lacscounts++;
			}
		}
		powerArr[0] = new int[unitcounts];
		powerArr[1] = new int[tenscounts];
		powerArr[2] = new int[hundredscounts];
		powerArr[3] = new int[thousandscount];
		powerArr[4] = new int[lacscounts];
		unitcounts = 0;
		tenscounts = 0;
		hundredscounts = 0;
		thousandscount = 0;
		lacscounts = 0;
		int pow;
		for (int i = 1; i <= range; i++) {
			pow = ArraysUtility.powerOfTwo(i);
			if (pow <= 9) {
				powerArr[0][unitcounts] = pow;
				unitcounts++;
			} else if (pow >= 10 && pow <= 99) {
				powerArr[1][tenscounts] = pow;
				tenscounts++;
			} else if (pow >= 100 && pow <= 999) {
				powerArr[2][hundredscounts] = pow;
				hundredscounts++;
			} else if(pow >= 1000 && pow <= 99999){
				powerArr[3][thousandscount] = pow;
				thousandscount++;
			}else {
				powerArr[4][lacscounts] = pow;
				lacscounts++;
			}
		}
		for (int i = 0; i < powerArr.length; i++) {
			if (i == 0) {
				System.out.println("count of unit");
			} else if (i == 1) {
				System.out.println("count of tens");
			} else if (i == 2)
				System.out.println("count of hundreds");
			else if(i==3)
				System.out.println("count of thousands");
			else
				System.out.println("count of lacs");
			for (int j = 0; j < powerArr[i].length; j++) {
				System.out.print(powerArr[i][j] + " ");
			}
			System.out.println();
		}
		scanner.close();

	}

}
