package com.example.fisbankcustomer.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer_details")
public class CustomerDetails {
	
	@Id
	@Column(name = "customer_no")
	int customer_no;
	
	@Column(name = "firstname")
	String firstname;
	
	@Column(name = "middlename")
	String middlename;
	
	@Column(name = "lastname")
	String lastname;
	
	@Column(name = "customer_city")
	String customer_city;
	
	@Column(name = "customer_contactno")
	int customer_contactno;
	
	@Column(name = "occupation")
	String occupation;
	
	@Column(name = "date")
	Date date;
	
	
	public CustomerDetails() {
		
	}
	
	public CustomerDetails(int customer_number, String firstname, String middlename, String lastname,
			String customer_city, int customer_contactno, String occupation, Date date) {
		super();
		this.customer_no = customer_number;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.customer_city = customer_city;
		this.customer_contactno = customer_contactno;
		this.occupation = occupation;
		this.date = date;
	}
	public int getCustomer_number() {
		return customer_no;
	}
	public void setCustomer_number(int customer_number) {
		this.customer_no = customer_number;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCustomer_city() {
		return customer_city;
	}
	public void setCustomer_city(String customer_city) {
		this.customer_city = customer_city;
	}
	public long getCustomer_contactno() {
		return customer_contactno;
	}
	public void setCustomer_contactno(int customer_contactno) {
		this.customer_contactno = customer_contactno;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
