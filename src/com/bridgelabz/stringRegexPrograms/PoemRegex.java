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

public class PoemRegex {

	public static void main(String[] args) {
		char userinput;
		Scanner scanner=new Scanner(System.in);
		System.out.println("please select menu");
		System.out.println("a. Chicks ­ chick\n"
				+ "b. Duck ­ quack\n"
				+ "c. Turkey ­ gobble\n"
				+ "d. Pig ­ oink, oink\n"
				+ "e. Cow ­ moo, moo\n"
				+ "f. Cat ­meow, meow\n"
				+ "g. Mule ­ Heehaw\n" 
				+ "h. Dog ­ bow wow\n" 
				+ "i. Turtle ­ nerp, nerp\n"
				);
		userinput=scanner.next().charAt(0);
		switch (userinput) {
		case 'a':
			StringRegexUtility.poem("Chicks", "chick");
			break;
		case 'b':
			StringRegexUtility.poem("Duck", "quack");
			break;
		case 'c':
			StringRegexUtility.poem("Turkey", "gobble");
			break;
		case 'd':
			StringRegexUtility.poem("Pig", "oink");
			break;
		case 'e':
			StringRegexUtility.poem("Cow", "moo");
			break;
		case 'f':
			StringRegexUtility.poem("Cat", "meow");
			break;
		case 'g':
			StringRegexUtility.poem("Mule", "Heehaw");
			break;
		case 'h':
			StringRegexUtility.poem("Dog", "bow");
			break;
		case 'i':
			StringRegexUtility.poem("Turtle", "nerp");
			break;
		default:
			System.out.println("Select proper input");
			break;
		}
		scanner.close();

	}

}
