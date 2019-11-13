package com.bridgelabz.designpattern.proxydesign;

import java.util.Scanner;

public class CommandExecutionProxy implements CommandI{
	Scanner scanner = new Scanner(System.in);
	private boolean isAdmin;
	private CommandExecution executor;
	
	public CommandExecutionProxy(String user, String pwd){
		System.out.println("Enter Username and Password");
		user = scanner.next();
		pwd = scanner.next();
		if("Mayuresh".equals(user) && "123456".equals(pwd)) {
			isAdmin=true;
		}
		executor = new CommandExecution();
		
	}
	
	@Override
	public void writecommand(String input) throws Exception {
		if(isAdmin){
			executor.writecommand(input);
		}else{
			if(input.trim().startsWith("rm")){
				throw new Exception("rm command is not allowed for non-admin users.");
			}else{
				executor.writecommand(input);
			}
		}
		
	}

}
