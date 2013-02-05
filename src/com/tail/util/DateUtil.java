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
	public static boolean isNotBlank(String date){
		return !isBlank(date);
	}
	public static void doBuy(){}
	public static void doSell(){}
}