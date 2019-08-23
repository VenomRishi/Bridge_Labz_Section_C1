/******************************************************************************
 *  Purpose: Program is written for Magic binary search.
 *  		 
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   21-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.search;

import java.util.Scanner;

import com.bridgelabz.utility.SearchUtility;

public class MagicNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt("3");
		int range = (int) Math.pow(2, n);
		System.out.println("Range is 0 to " + range);
		SearchUtility.magicNumber(range);
		
		scanner.close();

	}

}
