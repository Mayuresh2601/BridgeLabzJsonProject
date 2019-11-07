package com.Bridgelabz.AddressBook.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import com.Bridgelabz.AddressBook.Utility.JsonUtility;
import com.Bridgelabz.AddressBook.model.*;


public class AddressBookMethod implements IAddressBook{

	private static JsonUtility utility = new JsonUtility();
	private static AddressModel model = new AddressModel();
	private static ArrayList<PersonInfo> persons = new ArrayList<PersonInfo>();
	
	int counter = 0;
	String statename = "";
	//Path of AddressBook File in json
	String Path = "/home/admin1/Desktop/BridgeLabz/AddressBook/src/com/Bridgelabz/AddressBook/JsonFile/AddressBook1.json";
	
	public void createNewAddressBook() {
		
		System.out.println("Enter the State Name:");
		statename = utility.readString();
		
		boolean isPresent = false;
		// Create Address Book of Same State Name
		for (int i = 0; i < persons.size(); i++) {
			
			if(persons.get(i).getAddressObj().getState().equals(statename)) {
				
				isPresent = true;
				break;
			}
		}
		
		if(!isPresent) {
			int choice =0;
			do 
			{
				System.out.println("Press 1 to Add Person Details\nPress 2 to Save Details\nPress 3 to Print Details\nPress 4 to Exit to Main Menu");
				System.out.println("Enter Your Choice");
				choice = utility.readInteger();
			
				switch (choice) {
				case 1:
					//Add Person Details
					addPersonInfo();
					break;

				case 2: 
					// Save Person Details
					save();
					break;
				
				case 3:
					// Print Details
					if(counter >= 1) {
						System.out.println("Address book Details...");
						printDetails(persons, statename);
					}
					
					else {
						System.out.println("There is No Record Present...");
					}
					break;
					
				case 4:
					//Exit
					break;
				
				default:
					System.out.println("Please Enter Valid Choice");
					break;
				}
			}while(choice !=4);
			
		}
		else {
			System.out.println(statename+" is Already Present");
		}
	}
	
	@Override
	public void addPersonInfo() {
		
		PersonInfo person = new PersonInfo(); //Creating PersonInfo Class to get data
		
		System.out.println("*********Add Person Details***********");   //Since Mobile Number is referred as Primary key
		System.out.println("Enter the Mobile Number");
		Long mobile = utility.readLong();
		
		boolean isMobileTaken = false;
		
		for (int i = 0; i < persons.size(); i++) {
			
			long getmobile = persons.get(i).getMobileNumber();
			if(mobile.equals(getmobile)) {
				
				isMobileTaken = true;
				break;
			}
		}
		if(isMobileTaken) {
			System.out.println("Mobile Number Already Taken..");
		}
		else {
			person.setMobileNumber(mobile);
			
			System.out.println("Enter Persons First Name");
			person.setFname(utility.readString());
			
			System.out.println("Enter Persons Last name: ");
			person.setLname(utility.readString().toLowerCase());
			
			System.out.println("Enter Address Details: ");
			
			Address address = new Address();  // Creating Address Class Object to get Data
			System.out.println("Enter Address: ");
			address.setAddress(utility.readString());
			
			address.setState(statename);
			
			System.out.println("Enter City: ");
			address.setCity(utility.readString());
			
			System.out.println("Enter Zip: ");
			address.setPinCode(utility.readInteger());
			
			person.setAddressObj(address);
			
			persons.add(person);
			System.out.println("Person Successfully Added....");
			System.out.println();
			counter++;
		}
	}
	

	@Override
	public void save() {
		
		System.out.println("Saving Addres Book into JSON File");
		
		model.setPersoninfo(persons);
		
		try {
			
			utility.writeMapper(Path, model);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println();
	}

	public static void printDetails(ArrayList<PersonInfo> persons, String statename) {
		
		persons.forEach(i -> {
			
				System.out.println("FirstName: "+ i.getFname() + "\nLastName: " + i.getLname() + "\nAddress: " + i.getAddressObj().getAddress()
						+ "\nCity: " + i.getAddressObj().getCity() + "\nState: " + i.getAddressObj().getState() + "\nPinCode: "
						+ i.getAddressObj().getPinCode() + "\nMobileNumber: " + i.getMobileNumber());
				
				System.out.println();
		});
		
	}

	@Override
	public void openAddressBook() {
		
		System.out.println("Opening Address Book...");
		
		HashMap<String, String> map = new HashMap<>();
		
		for (int i = 0; i < persons.size(); i++) 
		{
			map.put(persons.get(i).getAddressObj().getState(), persons.get(i).getAddressObj().getState());
		}
		System.out.println("states available in Address Book " + map.keySet());
		
		System.out.println("Enter the State Name to Search in the Address Book");
		String statename = utility.readString();
		System.out.println("Searching Address Book with reference of State Name");
		
		boolean isPresent = false;
		// To check State in address book if it exist
		for (int i = 0; i < persons.size(); i++) {
			
			if(persons.get(i).getAddressObj().getState().equals(statename)) {
				
				isPresent = true;
				break;
			}
		}
		
		if(!isPresent) {
			System.out.println("State is Not found in AddressBook");
				int choice=0;
			  	do
			  	{
			  		System.out.println("\nPress 1 to Add Record\nPress 2 to Edit Record\nPress 3 Delete Record"
			  				+ "\nPress 4 SortBy LastName\nPress 5 SortBy PinCode\nPress 6 to Print AddressBook"
			  				+ "\nPress 7 Save Record\nPress 8 to Exit to Main Menu");
			  		System.out.println("Enter your choice:");
			  		choice = utility.readInteger(); 
			  		switch (choice) 
			  		{
			  		
				   	case 1:
				   		//add person
				   		addPersonInfo();
				   		break;
				   		
				   	case 2:
				        //Edit Person 
				   		editPersonInfo();
				   		break;
				   		
				   	case 3:
				   		//Delete Person
				   		deletePersonInfo();
				   		break;
				   		
				   	case 4:
				   		//Sort By LastName
				   		sortByLastName();
				   		break;
				   		
				   	case 5:
				   		//Sort By LastName
						sortByPinCode();
						break;
						
				   	case 6: 
				   		// Printing the Details
						if (counter > 0) 
						{
							System.out.println("----------------ADDRESS BOOK------------");
							AddressBookMethod.printDetails(persons, statename);
						} 
						else {
							System.out.println("There is no record to print...");
						}
						break;
				   	
				   	case 7 :
				   		//Save Details in Json
				   		save(); 
				        break;
				   	
				   	case 8:
						//Exit
						break;
						
					default:
						System.out.println("Please Enter Valid option....");
			  		}
			  	}while(choice !=8);
		}
		else {
			System.out.println("State Already Exist");
			
			persons.forEach(i -> {
				if(!statename.isEmpty() && statename.equals(i.getAddressObj().getState())) {
					System.out.println("FirstName: "+ i.getFname() + "\nLastName: " + i.getLname() + "\nAddress: " + i.getAddressObj().getAddress()
							+ "\nCity: " + i.getAddressObj().getCity() + "\nState: " + i.getAddressObj().getState() + "\nPinCode: "
							+ i.getAddressObj().getPinCode() + "\nMobileNumber: " + i.getMobileNumber());
				}
					System.out.println();
			});
		}
		
	}

	@Override
	public void deletePersonInfo() {
		

		if (counter > 1) 
		{
			System.out.println("Enter Persons Mobile number you want to delete from Address Book:");
			Long Mobilesearch = utility.readLong();
			 
			for (int i = 0; i < persons.size();i++) 
			{
				long mobile=persons.get(i).getMobileNumber();

				if (Mobilesearch.equals(mobile))
				{ 
					persons.remove(i);
					counter--;
					System.out.println();
					System.out.println("Data Deleted Sucessfully!!");
				}						
				
			}
		 
		} 
		else {
			System.out.println("No records to delete");
		}
	}

	@Override
	public void editPersonInfo() {
		
		if (counter > 0) {
			
			System.out.println("Enter the Mobile Number To Edit the Person Entity");
			Long mobile = utility.readLong();
			
			for (int i = 0; i < persons.size(); i++) {
				
				if(mobile.equals(persons.get(i).getMobileNumber())) {
					
					System.out.println("Enter new Address to Edit");
					persons.get(i).getAddressObj().setAddress(utility.readString());
					
					System.out.println("Enter new City to Edit");
					persons.get(i).getAddressObj().setCity(utility.readString());
					
					System.out.println("Enter new ZipCode to Edit");
					persons.get(i).getAddressObj().setPinCode(utility.readInteger());
                    
					persons.get(i).setMobileNumber(mobile);
					System.out.println();
				}
				
			}
			System.out.println("Person Details Successfully Updated...");
		}
		else {
			System.out.println("No Record In Address Book");
		}
	}

	@Override
	public void sortByLastName() {
		
		if (counter > 1) 
		{
			System.out.println("Sorting by Last name in Json File.....");

			persons.sort( (e1, e2) -> e1.getLname().compareTo(e2.getLname()));
			
			/*printing after sorting the data*/
			printDetails(persons, statename);
			 
		} else
			System.out.println("Less records to sort");
		
	}

	@Override
	public void sortByPinCode() {
		
		if (counter > 1) {
			System.out.println("Sorting by zipcode");
			
			persons.sort((e1, e2) -> String.valueOf(e1.getAddressObj().getPinCode())
					.compareTo(String.valueOf(e2.getAddressObj().getPinCode())));
			
			printDetails(persons, statename);
			 
		 
		} else
			System.out.println("Less records to sort");
		
	}

	@Override
	public void readJson() {
		File file = new File(Path);
		
		if (file.exists() && file.length() != 0) 
		{
			try 
			{
				model = (AddressModel) utility.readMapper(Path, model);
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		
			persons.addAll(model.getPersoninfo());
		    counter = persons.size();   //getting size of counter

		}
		
	}

	@Override
	public void saveAs() throws FileNotFoundException {
		
		System.out.println("*****Save as*****");
		String Inputpath = "/home/admin1/Desktop/BridgeLabz/AddressBook/src/com/Bridgelabz/AddressBook/JsonFile/";
		System.out.println("Enter filename u want to save");
		Inputpath += utility.readString();
	    Inputpath += ".json";
		
		if (new File(Inputpath).exists()) 
		{
			throw new FileNotFoundException("You cannot rewrite existing file");
		} 
		else 
		{
			// writing into file
			System.out.println("Saving address book into file....");
			model.setPersoninfo(persons);
			
			try {
				
				utility.writeMapper(Inputpath, model);
				
			} catch (IOException e) {

				e.printStackTrace();
			}
			 
		}
	}

}
