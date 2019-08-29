package com.bridgelabz.arrays;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] M = { { 1, 2, 3 }, { 0, 1, 4 }, { 5, 6, 0 } };
		int[][] temp = new int[3][3];
		System.out.println("Transpose Of M:");
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp[i].length; j++) {
				temp[i][j] = M[j][i];
				System.out.print(temp[i][j] + " ");
			}
			System.out.println();
		}

	}

}
