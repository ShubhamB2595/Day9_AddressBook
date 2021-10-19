package com.addressbook;
/*
 * Welcome to address book program
 */
public class AddressBookMain {

	static AddingContact contacts[] = new AddingContact[2];
	
	public static void main(String[] args) {
	
		System.out.println("Welcome to Address Book Program");
		
		contacts[0] = new AddingContact("Shubham", "Bhele", "Pusad MH", 445205, 7276948191L, "Shubham@gmail.com");
		contacts[1] = new AddingContact("Ravi", "Thote", "Pusad MH", 445205, 7276948191L, "Ravi@gmail.com");

		EditContact.editingContact();

	}

}
