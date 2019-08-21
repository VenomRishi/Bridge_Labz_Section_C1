/******************************************************************************
 *  Purpose: Program is written for String binary search.
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

public class StringBinarySearch {

	public static void main(String[] args) {
		String[] strArr = { "rishi", "vicky", "ramesh", "suresh", "naufil" };
		Arrays.sort(strArr);
		String key;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name to find in string array");
		key = scanner.next();
		int index = SearchUtility.stringBinarySearch(strArr, key);
		if (index == -1) {
			System.out.println("Key not found");
		} else {
			for (int i = 0; i < strArr.length; i++) {
				System.out.print(strArr[i]+" ");
			}
			System.out.println();
			System.out.println("Key found =" + strArr[index] + " index at " + index);
		}
		
		scanner.close();

	}

}
