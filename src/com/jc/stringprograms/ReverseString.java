package com.jc.stringprograms;

public class ReverseString {
	public static String reverseWord(String s) {
		String str = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			str += s.charAt(i);
		}
		return str;
	}

}
