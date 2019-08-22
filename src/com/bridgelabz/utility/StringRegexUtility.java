package com.bridgelabz.utility;

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
}
