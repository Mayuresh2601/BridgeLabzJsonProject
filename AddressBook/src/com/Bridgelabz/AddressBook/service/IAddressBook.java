package com.Bridgelabz.AddressBook.service;
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
    
	void sortByZipCode();
	
	void readJson();

	void save();

	void saveAs() throws FileNotFoundException;

}
