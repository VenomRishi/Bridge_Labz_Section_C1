/******************************************************************************
 *  Purpose: Program is written for String Regex used For replacement.
 *  		 
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   22-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.stringRegexPrograms;

import java.util.Scanner;

import com.bridgelabz.utility.StringRegexUtility;


public class MessageRegex {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String fullname,num;
		
		System.out.println("Enter fullname");
		fullname=scanner.nextLine();
		System.out.println("Enter mobile");
		num=scanner.next();
		
		StringRegexUtility.message(fullname, num);
		scanner.close();

	}

}
