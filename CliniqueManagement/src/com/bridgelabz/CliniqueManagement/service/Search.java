package com.bridgelabz.CliniqueManagement.service;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.CliniqueManagement.model.*;

public class Search {
	Utility u = new Utility();

	ArrayList<DoctorInfo> doctors = new ArrayList<DoctorInfo>();
	ArrayList<PatientInfo> patients = new ArrayList<PatientInfo>();
	
	
	
	public void findByname(List<DoctorInfo> listOfDoctor) {
		System.out.println("Enter the doctor name");
		String name = u.readString();
		for(int i=0;i<listOfDoctor.size();i++) {
			if(listOfDoctor.get(i).getDocname().equals(name)) {
				doctors.add(listOfDoctor.get(i));
			}
		}
	}
	public void findByAvailability(List<DoctorInfo> listOfDoctor) {
		System.out.println("Enter the doctor Availability");
		String avail = u.readString();
		for(int i=0;i<listOfDoctor.size();i++) {
			if(listOfDoctor.get(i).getAvailability().equals(avail)) {
				doctors.add(listOfDoctor.get(i));
			}
		}
	}
	public void findByspeci(List<DoctorInfo> listOfDoctor) {
		System.out.println("Enter the doctor Speciality");
		String speci = u.readString();
		for(int i=0;i<listOfDoctor.size();i++) {
			if(listOfDoctor.get(i).getSpecilist().equals(speci)) {
				doctors.add(listOfDoctor.get(i));
			}
		}
	}
	public DoctorInfo findByDocId(int did) {
		DoctorInfo doc=null;
		for(int i=0;i<doctors.size();i++) {
			if(doctors.get(i).getDocid()==did) {
				doc = doctors.get(i);
			}
		}
		return doc;
	}
	
	public void findByPname() {
		System.out.println("Enter the Patient name");
		String name = u.readString();
		for(int i=0;i<patients.size();i++) {
			if(patients.get(i).getPatientname().equals(name)) {
				patients.add(patients.get(i));
			}
		}
		for(int i=0;i<patients.size();i++) {
			PatientInfo temp = patients.get(i);
			System.out.println(temp.getAge()+"  name  "+temp.getPatientname()+"  mobilenumber "+temp.getMobilenumber());
		}
	}
	
	public PatientInfo findByNumber() {
		PatientInfo pat=null;
		System.out.println("Enter the Patient number");
		long num = u.readLong();
		for(int i=0;i<patients.size();i++) {
			if(patients.get(i).getMobilenumber()==num) {
				pat = patients.get(i);
			}
		}
		return pat;
	}
	
	public void  findByAge() {
		System.out.println("Enter the Patient age");
		int age = u.readInt();
		for(int i=0;i<patients.size();i++) {
			if(patients.get(i).getAge()==age) {
				patients.add(patients.get(i));
			}
		}
		for(int i=0;i<patients.size();i++) {
			PatientInfo temp = patients.get(i);
			System.out.println(temp.getAge()+"  name  "+temp.getPatientname()+"  mobilenumber "+temp.getMobilenumber());
		}
		
	}
	
//	public PatientInfo findByPId() {
//		PatientInfo pat=null;
//		System.out.println("enter the Patient id");
//		int did = u.inputint();
//		for(int i=0;i<patients.size();i++) {
//			if(patients.get(i).getId()==did) {
//				pat = patients.get(i);
//			}
//		}
//		return pat;
//	}	
	
}
