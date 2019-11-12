package com.bridgelabz.addressbook.service;
//interface for declaration of Method

//Encapsulation
import java.io.FileNotFoundException;

public interface IAddressBook {
	
	void createNewAddressBook();
	
	void openAddressBook();

	void addPersonInfo();
	
	void deletePersonInfo();

	void editPersonInfo();
	
	void sortByLastName();
    
	void sortByPinCode();
	
	void readJson();

	void save();

	void saveAs() throws FileNotFoundException;

}
