package com.bridgelabz.arrays;

public class MultiplyTwoDimArray {

	public static void main(String[] args) {
		int r1 = 2, r2 = 3, c1 = 3, c2 = 2;
		int[][] A = { { 2, 1, 3 }, { 5, 8, 4 } };// 2x3
		int[][] B = { { 5, 4 }, { 2, 9 }, { 7, 1 } };// 3x2
		int[][] AB = new int[r1][c2];

		if (r2 == c1) {
			// AB
			for (int i = 0; i < r1; i++) {
				for (int j = 0; j < c2; j++) {
					for (int k = 0; k < r2; k++) {
						AB[i][j] += A[i][k] * B[k][j];
					}
				}
			}
			// Displaying the result
			System.out.println("AxB is:");
			for (int[] row : AB) {
				for (int column : row) {
					System.out.print(column + " ");
				}
				System.out.println();
			}
		}

		// BA B 3x2 A 2x3
		r1 = 3;
		c1 = 2;
		r2 = 2;
		c2 = 3;
		int[][] BA = new int[r1][c2];
		if (r2 == c1) {
			// BA
			for (int i = 0; i < r1; i++) {
				for (int j = 0; j < c2; j++) {
					for (int k = 0; k < r2; k++) {
						BA[i][j] += B[i][k] * A[k][j];
					}
				}
			}
			// Displaying the result
			System.out.println("BxA is:");
			for (int[] row : BA) {
				for (int column : row) {
					System.out.print(column + "    ");
				}
				System.out.println();
			}
		}

	}

}
