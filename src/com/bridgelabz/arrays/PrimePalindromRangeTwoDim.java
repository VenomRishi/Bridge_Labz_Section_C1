package com.bridgelabz.arrays;

import com.bridgelabz.utility.ArraysUtility;

public class PrimePalindromRangeTwoDim {

	public static void main(String[] args) {
		int start = 0;
		int end = 100;

		int[][] primePalindromeNumber = new int[10][];

		int j1 = 0, j2 = 0;
		// declaration of array is done
		for (int i = 0; i < 10; i++) {
			for (int j = start; j <= end; j++) {
				if (ArraysUtility.isPrime(j)) {
					if (ArraysUtility.isPalindrome(j)) {
						j1++;
					}
					
				}
			}
			primePalindromeNumber[i] = new int[j1];
			start = end + 1;
			end += 100;
			j1 = 0;

		}
		start = 0;
		end = 100;
		j1 = 0;
		// putting values in array
		for (int i = 0; i < 10; i++) {
			for (int j = start; j <= end; j++) {

				if (ArraysUtility.isPrime(j)) {
					if (ArraysUtility.isPalindrome(j)) {
					primePalindromeNumber[i][j2] = j;
					j2++;
					}
				}

			}
			start = end + 1;
			end += 100;
			j2 = 0;
		}

		// printing array
		for (int i = 0; i < primePalindromeNumber.length; i++) {
			for (int j = 0; j < primePalindromeNumber[i].length; j++)
				System.out.print(primePalindromeNumber[i][j] + " ");
			System.out.println();
		}

	}

}
