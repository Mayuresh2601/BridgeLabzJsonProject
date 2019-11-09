package com.bridgelabz.CliniqueManagement.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Utility {
	
	Scanner sc = new Scanner(System.in);
	
	public String readString() {
		String str = sc.next();
		return str;
	}
	public boolean readBoolean() {
		boolean flag = sc.nextBoolean();
		return flag;
	}
	public int readInt() {
		int num = sc.nextInt();
		return num;
	}
	
	public long readLong() {
		long num = sc.nextLong();
		return num;
	}
	public Date printDate(String date){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		try{
			return sdf.parse(date);
		}
		catch(ParseException pe){
			return null;
		}
	}
}