package com.bridgelabz.StockAccount.utility;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {

	
	private static ObjectMapper mapper = new ObjectMapper();
	private Scanner scanner = new Scanner(System.in);

	/**
	 * Purpose: reading the json file, parse and return the mapped object
	 * 
	 * @param path   path of json file
	 * @param object model class object where we can mapped objects
	 * @return returns the mapped object
	 * @throws JsonParseException   throws exception if parsing fails
	 * @throws JsonMappingException throws exception if mapping to model is fails
	 * @throws IOException          throws exception if input output operation fails
	 */
	
	public static Object readMapper(String Path,Object object) 
			throws  IOException {
		
		return mapper.readValue(new File(Path), object.getClass());
	}
	
	
	/**
	 * Purpose: writing the json file
	 * 
	 * @param path   path of json file
	 * @param object model class object where we can mapped objects
	 * @throws JsonParseException  throws exception if parsing fails
	 * @throws JsonMappingException throws exception if mapping to model is fails
	 * @throws IOException  throws exception if input output operation fails
	 */
	
	public static String writeMapper(String Path,Object object) 
			throws  IOException{
		
		mapper.writeValue(new File(Path), object);
		return "Successfully Write into File";
	}
	
	/**
	 * @return return String input
	 */
	
	public String readString()
	{
		return scanner.next();
	}
	
	/*********************************************************************/

	/**
	 * @return return Integer input
	 */
	
	public int readInteger()
	{
		return scanner.nextInt();
	}
	
   /***********************************************************************/

	/**
	 * @return return Double input
	 */
	public double readDouble()
	{
		return scanner.nextDouble();
	}
	
	/***********************************************************************/

	/**
	 * @return return Float input
	 */
	public float readFloat()
	{
		return scanner.nextFloat();
	}
	
	/***********************************************************************/

	/**
	 * @return return Long input
	 */
	public long readLong()
	{
		return scanner.nextLong();
	}
	
}
