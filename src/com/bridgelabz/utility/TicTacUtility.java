package com.bridgelabz.utility;

public class TicTacUtility {

	public static void initializingBoard(char[][] board) {
		// initializing board
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				board[i][j] = '-';
			}
		}
		/*
		 * board --- --- ---
		 */
	}

	// generating random number for taking decision to choose corner or center

	/**
	 * Purpose: printing board
	 * 
	 * @param board
	 */
	public static void printBoard(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
