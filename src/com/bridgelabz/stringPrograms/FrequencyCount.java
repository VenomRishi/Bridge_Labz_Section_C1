package com.bridgelabz.stringPrograms;

import com.bridgelabz.utility.SortUtility;

public class FrequencyCount {

	public static void main(String[] args) {
		String str = "To Be Or Not To Be Be Not";
		String[] strArr = str.split(" ");
		SortUtility.frequencyCount(strArr);

	}

}
