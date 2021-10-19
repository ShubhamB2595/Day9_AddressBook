package com.addressbook;
/*
 * Class to edit the contact
 */

import java.util.Scanner;

public class EditContact {
	
	public static void editingContact() {
		
		System.out.println("Enter full name that want to edit");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		input.close();
		String fullName;
		
		for (int index = 0; index < AddressBookMain.contacts.length; index++) {
			fullName = AddressBookMain.contacts[index].getFirstName();
			if (name.equals(fullName)) {
				AddingContact.newContact();
			}
			else {
				System.out.println(name + " not Found");
			}
		}
		
		return;
	}
}

