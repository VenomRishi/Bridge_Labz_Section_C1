package com.bridgelabz.search;

import com.bridgelabz.utility.Utility;

public class BinarySearch {

	public static void main(String[] args) {
		Utility utility=new Utility();
		int[] arr= {0,1,2,3,4,5,6,7,8,9};
		int key=7;
		utility.integerBinarySearch(0, arr.length, key);

	}

}
