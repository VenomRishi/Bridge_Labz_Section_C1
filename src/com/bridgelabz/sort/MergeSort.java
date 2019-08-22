package com.bridgelabz.sort;

import com.bridgelabz.utility.SortUtility;

public class MergeSort {
	public static void main(String[] args) {
		String[] strArr = { "rishi", "vicky", "wasim", "naufil", "abhishek" };
		System.out.println("Unsorted Array");
		SortUtility.printArray(strArr);
		System.out.println();

		SortUtility.mergeSort(strArr, 0, strArr.length - 1);
		
		System.out.println("Sorted Array using Merge sort");
		SortUtility.printArray(strArr);

	}
}
