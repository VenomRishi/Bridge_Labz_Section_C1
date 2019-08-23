package com.bridgelabz.utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class StringRegexUtility {
	
	
	public static void poem(String animal,String sound) {
		String str="Old MACDONALD had a farm\n" + 
				"E-I-E-I-O\n" + 
				"And on his farm he had a ANIMAL\n" + 
				"E-I-E-I-O\n" + 
				"With a SOUND SOUND here\n" + 
				"And a SOUND SOUND there\n" + 
				"Here a SOUND, there a SOUND\n" + 
				"Everywhere a SOUND SOUND\n" + 
				"Old MacDonald had a farm\n" + 
				"E-I-E-I-O";
		String replaceString=str.replaceAll("ANIMAL", animal);
		String replaceString2=replaceString.replaceAll("SOUND", sound);
		
		System.out.println(replaceString2);
	}
	public static void message(String fullname,String mobile) {
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String firstName = fullname.substring(0, fullname.indexOf(' '));
		String str="Hello <<name>>, We have your full name\r\n" + 
				"as <<fullname>> in our system. your contact number is 91­xxxxxxxxxx. Please,let us\r\n" + 
				"know in case of any clarification Thank you BridgeLabz Date.";
		String str1=str.replaceAll("<<name>>", firstName);
		String str2=str1.replaceAll("<<fullname>>", fullname);
		String str3=str2.replaceAll("xxxxxxxxxx", mobile);
		String str4=str3.replaceAll("Date", dateFormat.format(date));
		
		System.out.println(str4);
		
	}
}
