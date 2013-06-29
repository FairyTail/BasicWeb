package com.tail.util;

public class StringUtil
{
	public static boolean isBlank(String s){
		return s == null || s.trim().length() <= 0;
	}

	public static boolean isNotBlank(String s){
		return !isBlank(s);
	}

	public static String defaultIfBlank(String s, String def){
		return isBlank(s) ? def : s;
	}
}