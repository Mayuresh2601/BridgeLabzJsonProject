package com.bridgelabz.cliniquemanagement.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Utility {
	
	Scanner sc = new Scanner(System.in);
	
	public String readString() {
		
		return sc.next();
	}
	
	public int readInt() {
		
		return  sc.nextInt();
	}
	
	public long readLong() {
		
		return  sc.nextLong();
		
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