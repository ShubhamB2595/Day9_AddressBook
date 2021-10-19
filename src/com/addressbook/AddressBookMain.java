package com.addressbook;
/*
 * Welcome to address book program
 */
public class AddressBookMain {

	public static void main(String[] args) {
	
		System.out.println("Welcome to Address Book Program");
		
		AddingContact.newContact(0);
		System.out.println(AddingContact.contacts[0]);

	}

}
