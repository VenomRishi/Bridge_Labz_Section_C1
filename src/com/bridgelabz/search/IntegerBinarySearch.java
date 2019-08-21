/******************************************************************************
 *  Purpose: Program is written for Integer binary search.
 *  		 
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   21-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.search;

import java.util.Arrays;
import java.util.Scanner;

import com.bridgelabz.utility.SearchUtility;

public class IntegerBinarySearch {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int[] arr = { 2, 1, 3, 4, 5, 6, 9, 8, 7 };
		Arrays.parallelSort(arr);
		System.out.println("Enter number to find in array");
		int key = scanner.nextInt();
		int index = SearchUtility.integerBinarySearch(arr, key);
		if (index == -1)
			System.out.println("key not found");
		else
			System.out.println("key found : at index :" + index);
		scanner.close();
	}

}
