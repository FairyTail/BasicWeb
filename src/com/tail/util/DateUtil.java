package com.tail.util;

/**
 * @author Antonio
 * This class offers utility date methods
 */
public class DateUtil
{
	public static boolean isBlank(String date){
		return date == null || date.trim().length() <= 0;
	}
}