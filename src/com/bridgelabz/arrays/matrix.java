package com.bridgelabz.arrays;

import java.util.Scanner;

public class matrix {
	public static void main(String args[]) {
		int r1, r2, c1, c2, i, j, k;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter row and column matrix 1");
		r1 = scanner.nextInt();
		c1 = scanner.nextInt();

		System.out.println("Enter row and column matrix2");
		r2 = scanner.nextInt();
		c2 = scanner.nextInt();

		if (c1 == r2) {
			int A[][] = new int[r1][c1];
			int B[][] = new int[r2][c2];
			int res[][] = new int[r1][c2];

			System.out.println("Enter elements of matrix1");

			for (i = 0; i < r1; i++) {
				for (j = 0; j < c1; j++) {
					System.out.print(+ i + " " + j + " : \t");
					A[i][j] = scanner.nextInt();
				}
				System.out.println();
			}
			//printing matrix 1
			System.out.println("Matrix 1:");
			for (i = 0; i < r1; i++) {
				for (j = 0; j < c1; j++) {
					System.out.print(A[i][j] + " ");
				}
				System.out.println();

			}

			System.out.println("Enter elements of matrix2");

			for (i = 0; i < r2; i++) {
				for (j = 0; j < c2; j++) {
					System.out.print(+ i + " " + j + " : \t");
					B[i][j] = scanner.nextInt();
				}
				System.out.println();
			}
			//printing matrix 2
			System.out.println("Matrix 2:");
			for (i = 0; i < r2; i++) {
				for (j = 0; j < c2; j++) {
					System.out.print(B[i][j] + " ");
				}
				System.out.println();
			}

			///multiplication of matrix
			for (i = 0; i < r1; i++) {
				for (j = 0; j < c2; j++) {
					for (k = 0; k < r2; k++) {
						res[i][j] += A[i][k] * B[k][j];
					}
				}
			}
			
			System.out.println("Multiplication of:\n");
			//printing matrix 1
			System.out.println("Matrix 1:");
			for (i = 0; i < r1; i++) {
				for (j = 0; j < c1; j++) {
					System.out.print(A[i][j] + " ");
				}
				System.out.println();

			}
			System.out.print("X\n");
			//printing matrix 2
			System.out.println("Matrix 2:");
			for (i = 0; i < r2; i++) {
				for (j = 0; j < c2; j++) {
					System.out.print(B[i][j] + " ");
				}
				System.out.println();
			}
			//printing result
			System.out.println("Result of two matrix");
			for (i = 0; i < r1; i++) {
				for (j = 0; j < c2; j++) {
					System.out.print(res[i][j] + " ");
				}
				System.out.println();
			}
		} else
			System.out.print("multipication does not exist ");
		scanner.close();
	}

}