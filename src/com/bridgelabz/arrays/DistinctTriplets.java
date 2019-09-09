package com.bridgelabz.arrays;

import java.util.Scanner;

import com.bridgelabz.utility.ArraysUtility;

public class DistinctTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraysUtility utility=new ArraysUtility();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number for elements");
		int count=scanner.nextInt();
		System.out.println("Enter elements");
		int[] arr=new int[count];
		for (int i = 0; i < count; i++) {
			arr[i]=scanner.nextInt();
		}
		utility.findDistinctTriplets(arr,count);
		
		scanner.close();
		

	}

}
