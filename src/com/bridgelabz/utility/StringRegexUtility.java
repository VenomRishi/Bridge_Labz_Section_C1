/******************************************************************************
 *  Purpose: This is utility file which contains logic for functional files.
 *  		 this file is having methods who can take input process it and 
 *  		 returns the output.
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   20-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegexUtility {

	public static void poem(String animal, String sound) {
		String str = "Old MACDONALD had a farm\n" + "E-I-E-I-O\n" + "And on his farm he had a ANIMAL\n" + "E-I-E-I-O\n"
				+ "With a SOUND SOUND here\n" + "And a SOUND SOUND there\n" + "Here a SOUND, there a SOUND\n"
				+ "Everywhere a SOUND SOUND\n" + "Old MacDonald had a farm\n" + "E-I-E-I-O";
		String replaceString = str.replaceAll("ANIMAL", animal);
		String replaceString2 = replaceString.replaceAll("SOUND", sound);

		System.out.println(replaceString2);
	}

	public static void message(String fullname, String mobile) {

		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String firstName = fullname.substring(0, fullname.indexOf(' '));
		String str = "Hello <<name>>, We have your full name\r\n"
				+ "as <<fullname>> in our system. your contact number is 91­xxxxxxxxxx. Please,let us\r\n"
				+ "know in case of any clarification Thank you BridgeLabz Date.";
		String str1 = str.replaceAll("<<name>>", firstName);
		String str2 = str1.replaceAll("<<fullname>>", fullname);
		String str3 = str2.replaceAll("xxxxxxxxxx", mobile);
		String str4 = str3.replaceAll("Date", dateFormat.format(date));

		System.out.println(str4);

	}

	/**
	 * Purpose: regex for no special charater in string
	 * 
	 * @param name user input
	 * @return if valid true else false
	 */
	public boolean isValidName(String name) {
		Pattern pattern = Pattern.compile("^[a-zA-Z]+$");
		Matcher matcher = pattern.matcher(name);
		return matcher.matches();

	}

	/**
	 * Purpose: regex for email
	 * 
	 * @param email user input
	 * @return if valid true else false
	 */
	public boolean isValidEmail(String email) {
		// TODO Auto-generated method stub ^(.+)@(.+)$
		Pattern pattern = Pattern.compile("^(.+)@(.+)$");
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	/**
	 * Purpose: regex for international phone number
	 * 
	 * @param phone user input
	 * @return if valid true else false
	 */
	public boolean isValidMobile(String phone) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("^\\+(?:[0-9] ?){6,14}[0-9]$");
		Matcher matcher = pattern.matcher(phone);
		return matcher.matches();
	}

	public boolean isValidUsername(String userid) {
		// TODO Auto-generated method stub a-zA-Z0-9
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+$");
		Matcher matcher = pattern.matcher(userid);
		return matcher.matches();
	}

	public boolean isValidPassword(String password) {
		// TODO Auto-generated method stub
		/*
		 * (?=.*[a-z]) : This matches the presence of at least one lowercase letter.
		 * (?=.*d) : This matches the presence of at least one digit i.e. 0-9.
		 * (?=.*[@#$%]) : This matches the presence of at least one special character.
		 * ((?=.*[A-Z]) : This matches the presence of at least one capital letter.
		 * {6,16} : This limits the length of password from minimum 6 letters to maximum
		 * 16 letters.
		 */
		Pattern pattern = Pattern.compile("((?=.*[a-z])(?=.*d)(?=.*[@#$%])(?=.*[A-Z]).{8,16}))");
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
	}
}
