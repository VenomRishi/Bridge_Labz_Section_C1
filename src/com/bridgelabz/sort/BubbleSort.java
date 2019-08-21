/******************************************************************************
 *  Purpose: Program is written for Bubble sort.
 *  		 
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   21-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.sort;

import com.bridgelabz.utility.SortUtility;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 2, 1, 3, 5, 4, 6, 9, 7, 8 };
		System.out.println("Unsorted array\n");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println();
		int[] sortedArr=SortUtility.bubbleSort(arr);
		System.out.println("Sorted array\n");
		for (int i = 0; i < sortedArr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
