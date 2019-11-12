package com.bridgelabz.cliniquemanagement.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.bridgelabz.cliniquemanagement.model.*;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Search implements SearchI{
	Utility u = new Utility();
	Operations o = new Operations();
	ArrayList<DoctorInfo> doctors = new ArrayList<DoctorInfo>();
	ArrayList<PatientInfo> patients = new ArrayList<PatientInfo>();
	ArrayList<AppointmentInfo> appointments = new ArrayList<AppointmentInfo>();
	ObjectMapper mapper = new ObjectMapper();
	
	String docfile = "/home/admin1/Desktop/BridgeLabz/CliniqueManagement/src/com/bridgelabz/CliniqueManagement/files/Doctor.json";
	String patientfile = "/home/admin1/Desktop/BridgeLabz/CliniqueManagement/src/com/bridgelabz/CliniqueManagement/files/Patient.json";

	int id;
	String name;
	long phone;
	boolean isPresent = false;
	
	@Override
	public void docSearch() {
		try {
			o.readDoctorFile(docfile);
			int ch = 0;
			do {
				System.out.println("\nPress 1 to Search Doctor by id");
				System.out.println("Press 2 to Search Doctor by Name");
				System.out.println("Press 3 to  Search Doctor by Specialization");
				System.out.println("Press 4 to  Search Doctor by Availability");
				System.out.println("Press 5 to Exit to Main Menu");
				ch = u.readInt();
				switch (ch) {

				case 1:
					searchByDoctorId();
					break;
				
				case 2:
					searchByDoctorName();
					break;
					
				case 3:
					searchByDoctorSpecialization();
					break;
				
				case 4:
					searchByDoctorAvailability();
					break;
				
				case 5:
					break;
				default:
					System.out.println("Wrong option");
				}
			} while (ch != 5);

			}
			catch(Exception e)
			{
				System.out.println("Enter only Integer........");
			}
		
	}
	
	@Override
	public void patientSearch() {
		try {
			o.readPatientFile(patientfile);
			int ch = 0;
			do {
				System.out.println("\nPress 1 to Search Patient by id");
				System.out.println("Press 2 to Search Patient by Name");
				System.out.println("Press 3 to Search Patient by Mobile Number");
				System.out.println("Press 4 to Exit to Main Menu");
				ch = u.readInt();
				switch (ch) {

				case 1:
					searchByPatientid();
					break;
					
				case 2:
					searchByPatientName();
					break;
					
				case 3:
					searchByPatientphone();
					break;
					
				case 4:
					break;
					
				default:
					System.out.println("Wrong option");
					
				}
			} while (ch != 4);

			}
			catch(Exception e)
			{
				System.out.println("Enter only Integer........");
			}
		
	}
	
	@Override
	public void searchByPatientName() {
		o.readPatientFile(patientfile);
		System.out.println("Enter Patient name");
		name=u.readString();
		List<PatientInfo> list=patients.stream().filter(i->i.getPatientname().equals(name)) .collect(Collectors.toList());
        
		if(list.isEmpty())
		{
			System.out.println(name+ " : not found");
		}
		else
		{
			for(int i=0;i<list.size();i++)
			{
				System.out.println(list.get(i).toString());
			}
		}
	}
	
	@Override
	public void searchByPatientid() {
		o.readPatientFile(patientfile);
//		System.out.println("Enter Patient Id");
//	    id=u.readInt();
//	    
//	    List<PatientInfo> list=patients.stream().filter(i->i.getPid()==id).collect(Collectors.toList());
//	   
//	    if(list.isEmpty())
//        {
//      	  System.out.println(id +":  id not found");
//        }
//        else
//        {
//        	 System.out.println(list.get(0).toString());
//        }
		System.out.println("Enter the Patient Id");
		id = u.readInt();
		
		for (int i = 0; i < patients.size(); i++) {
			if(id == patients.get(i).getPid()) {
				isPresent = true;
				break;
			}
		}
		
		if(isPresent) {
			System.out.println("Patient Id Present");
		}
		else {
			System.out.println("Patient Id Not Present");
		}
		
	}
	@Override
	public void searchByPatientphone() {
		o.readPatientFile(patientfile);
		System.out.println("Enter patient phone number");
		phone=u.readLong();
		List<PatientInfo> list=patients.stream().filter(i->i.getMobilenumber() == phone).collect(Collectors.toList());
		 if(list.isEmpty())
         {
       	  System.out.println(phone+":  phone not found");
         }
         else
         {
        	 for(int i=0;i<list.size();i++)
             {
             	System.out.println(" Doctor "+list.get(i).toString());
             }
         }
		
	}
	@Override
	public void searchByDoctorName() {
		o.readDoctorFile(docfile);
		 System.out.println("Enter Doctor name");
		 name= u.readString();
		    
		    List<DoctorInfo> list=doctors.stream().filter(i->i.getDocname().equals(name)).collect(Collectors.toList());
		    if(list.isEmpty())
	        {
	      	  System.out.println(name+ " : not found");
	        }
	        else
	        {
	      	   System.out.println(list.toString());
	        }
		
	}
	@Override
	public void searchByDoctorId() {
		o.readDoctorFile(docfile);
		System.out.println("Enter Doctor Id");
	    id = u.readInt();
	    List<DoctorInfo> list=doctors.stream().filter(i->i.getDocid() == id).collect(Collectors.toList());
	    if(list.isEmpty())
        {
      	  System.out.println(id +":  id not found");
        }
        else
        {
        	 System.out.println(list);
        }
		
	}
	@Override
	public void searchByDoctorSpecialization() {
		o.readDoctorFile(docfile);
		System.out.println("Enter Specialzation");
	    name=u.readString();
	    List<DoctorInfo> list=doctors.stream().filter(i->i.getSpecilist().equals(name)).collect(Collectors.toList());
	    if(list.isEmpty())
        {
      	  System.out.println(name+ " : not found");
        }
        else
        {
      	  for(int i=0;i<list.size();i++)
            {
            	System.out.println(list.get(i).toString());
            }
        }
		
	}
	@Override
	public void searchByDoctorAvailability() {
		System.out.println("Enter Availability");
	    name=u.readString();
	    List<DoctorInfo> list=doctors.stream().filter(i->i.getAvailability().equals(name)).collect(Collectors.toList());
	    if(list.isEmpty())
        {
      	  System.out.println(name+ " : not found");
        }
        else
        {
      	  for(int i=0;i<list.size();i++)
            {
            	System.out.println(list.get(i).toString());
            }
        }
		
	}
}
