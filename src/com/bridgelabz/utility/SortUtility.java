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

	/**
	 * Purpose: Bubble sort algorithm
	 * 
	 * @param arr
	 * @return
	 */
	public static int[] bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	public static String[] insertionSort(String[] arr) {
		int n = arr.length;
		String key;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i].compareToIgnoreCase(arr[j]) > 0) {
					key = arr[i];
					arr[i] = arr[j];
					arr[j] = key;
				}
			}
		}
		return arr;
	}

	/**
	 * Purpose: Printing string array
	 * 
	 * @param arr string array
	 */
	public static void printArray(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	/**
	 * Purpose: Printing Integer array
	 * 
	 * @param arr string array
	 */
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void mergeSort(String[] arr, int low, int high) {

		if (low < high) {
			int mid = (low + high) / 2;
			// Sort first and second halves
			mergeSort(arr, low, mid);
			mergeSort(arr, mid + 1, high);

			merge(arr, low, mid, high);
		}

	}

	private static void merge(String[] arr, int low, int mid, int high) {

		// Find sizes of two subarrays to be merged
		int n1 = mid - low + 1;
		int n2 = high - mid;

		/* Create temp arrays */
		String L[] = new String[n1];
		String R[] = new String[n2];

		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i)
			L[i] = arr[low + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[mid + 1 + j];

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarry array
		int k = low;
		while (i < n1 && j < n2) {
			if (L[i].compareTo(R[j]) <= 0) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	/**
	 * Purpose: Count frequency of words
	 * 
	 * @param strArr
	 */
	public static void frequencyCount(String[] strArr) {
		mergeSort(strArr, 0, strArr.length - 1);
		System.out.println("Sorted Array using Merge sort");
		printArray(strArr);
		System.out.println();

		int count = 1, j = 0;

		for (int i = 0; i < strArr.length - 2; i++) {
			j++;
			if (strArr[i].equals(strArr[i + 1])) {
				count++;

			} else {
				System.out.print("Key: " + strArr[i] + " Value: " + count + " ");
				System.out.println();
				count = 1;
			}

		}
		if (strArr[j].equals(strArr[j + 1])) {
			count++;
			System.out.print("Key: " + strArr[j] + " Value: " + count + " ");

		}

	}

}
