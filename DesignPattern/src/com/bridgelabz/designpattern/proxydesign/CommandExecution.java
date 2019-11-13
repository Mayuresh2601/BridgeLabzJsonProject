package com.bridgelabz.designpattern.proxydesign;

import java.io.IOException;
import java.util.Scanner;

public class CommandExecution implements CommandI{
		Scanner scanner = new Scanner(System.in);
	@Override
	public void writecommand(String input) throws IOException {
		//Some Heavy Implementation
		Runtime.getRuntime().exec(input);
		System.out.println("'" + input + "' command executed.");
	}

}
