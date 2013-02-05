package com.tail.util;

public class DateUtil
{
	public static boolean isBlank(String date){
		return date == null || date.trim().length() <= 0;
	}
	public static boolean isNotBlank(String date){
		return !isBlank(date);
	}
}