package com.bridgelabz.CliniqueManagement.service;

import java.util.Date;

public class Appointment
{ 
	Integer Appointid;
	Date date;

	//getter and setter methods
	public int getDid() 
	{
		return Appointid;
	}
	public void setDid(int Appointid) 
	{
		this.Appointid = Appointid;
	}

	public Date getDate() 
	{
		return date;
	}
	public void setDate(Date date) 
	{
		this.date = date;
	}

	public String toString() 
	{
		return "Appointment [did=" + Appointid + ", date=" + date +  "]";
	}

	public int hashCode()
	{
    	return this.Appointid.hashCode()+this.date.hashCode();
	}
	//checking for equality
	public boolean equals(Object object)
	{
    	if (object == null) 
			return false;
    	if (object == this) 
			return true;
    	if (!(object instanceof Appointment))
			return false;
    	
    	Appointment dA = (Appointment) object;

		if((this.Appointid==dA.Appointid) && (this.date.equals(dA.date)))
			return true;
		else
			return false;
	}
	
}