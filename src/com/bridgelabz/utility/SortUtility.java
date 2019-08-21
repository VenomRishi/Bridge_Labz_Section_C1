/******************************************************************************
 *  Purpose: This is utility file which contains logic of all programs for
 *  		 sorting.
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   21-08-2019
 *  @updated 21-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.utility;

public class SortUtility {

	public static int[] bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if (arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}

}
