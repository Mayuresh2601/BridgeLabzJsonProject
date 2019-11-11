package com.bridgelabz.AddressBook.controller;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.bridgelabz.AddressBook.service.AddressBookMethod;
import com.bridgelabz.AddressBook.utility.JsonUtility;

public class AddressBookMain {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException {

		JsonUtility utility = new JsonUtility();
		AddressBookMethod method = new AddressBookMethod();
		method.readJson();
		int count = 0;
		do {
			System.out.println("*******************Select From Menu*********************");
			System.out.println("Press 1 to Create AddressBook\nPress 2 to Open AddressBook\nPress 3 to Save AddressBook"
					+ "\nPress 4 to SaveAs AddressBook\nPress 5 to Exit");
			System.out.println("Enter Your Choice");
			count = utility.readInteger();
			switch (count) {
			case 1:
				method.createNewAddressBook();
				break;

			case 2:
				method.openAddressBook();
				break;

			case 3:
				method.save();
				break;

			case 4:
				method.saveAs();
				break;

			case 5:
				System.out.println("Thank you for using address book!!!!");
				System.exit(0);
				break;

			default:
				System.out.println("Please Enter Valid option....");
				break;
			}
		} while (count != 5);

	}

}
