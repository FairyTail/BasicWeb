package com.basicweb.util;

public class StringUtil
{
	public static boolean isBlank(String s){
		return s == null || s.trim().length() <= 0;
	}

	public static boolean isNotBlank(String s){
		return !isBlank(s);
	}
	
	public void chillJill(){}
}