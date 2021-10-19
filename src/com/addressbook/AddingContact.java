package com.addressbook;

import java.util.Scanner;

public class AddingContact {

static AddingContact contacts[] = new AddingContact[2];
	
	static String firstName;
	static String lastName;	
	static String fullAddress;
	static long zip;
	static long phoneNumber;
	static String email;
	
	public AddingContact() {
		 /* this.firstName = firstName;
		  this.lastName = lastName;
		  this.fullAddress = fullAddress;
		  this.zip = zip;
		  this.phoneNumber = phoneNumber;
		  this.email = email;	*/
		Scanner input = new Scanner(System.in);
		//Taking input from user and saving to particular variable
		//Read full Name
		System.out.println("Enter first Name:"); 
		firstName = input.nextLine();
		
		System.out.println("Enter last Name:"); 
		lastName = input.nextLine();
		
		//Read full Address
		System.out.println("Enter full Address with city & state:"); 
		fullAddress = input.nextLine();
		
		//Read Email
		System.out.println("Enter Email:"); 
		email = input.nextLine();	
		
		//Read Zip Code
		System.out.println("Enter Zip Code:"); 
		zip = input.nextLong();	
		
		//Read Phone Number
		System.out.println("Enter Phone Number:"); 
		phoneNumber = input.nextLong();
		input.close();	  
		}
	
	//method to create new contact
	public static void newContact(int index) {
		if(index < contacts.length) {
		contacts[index] = new AddingContact();
		}
		else {
			System.out.println("Contact List is Full");
		}
		return ;
	}
	
		@Override
	public String toString() {
		return "AddingContact [getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getFullAddress()=" + getFullAddress() + ", getZip()=" + getZip() + ", getPhoneNumber()="
				+ getPhoneNumber() + ", getEmail()=" + getEmail() + "]";
	}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getFullAddress() {
			return fullAddress;
		}

		public void setFullAddress(String fullAddress) {
			this.fullAddress = fullAddress;
		}

		public long getZip() {
			return zip;
		}

		public void setZip(long zip) {
			this.zip = zip;
		}

		public long getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(long phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

	
}
