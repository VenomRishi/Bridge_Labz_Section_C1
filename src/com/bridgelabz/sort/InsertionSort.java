package com.bridgelabz.sort;

import com.bridgelabz.utility.SortUtility;

public class InsertionSort {
	public static void main(String[] args) {
		String[] strArr= {"rishi","vicky","wasim","naufil","abhishek"};
		System.out.println("Unsorted Array");
		SortUtility.printArray(strArr);
		System.out.println();
		SortUtility.insertionSort(strArr);
		System.out.println("Sorted Array using Insertion sort");
		SortUtility.printArray(strArr);
	}
}
