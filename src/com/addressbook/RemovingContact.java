package com.addressbook;
/*
 * class to removing the contact from main address book
 */
import java.util.Scanner;

public class RemovingContact {

public static void removeContact() {
		
		System.out.println("Enter full name that want to remove");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		String fullName;
		
		for (int index = 0; index < AddressBookMain.contacts.length; index++) {
			fullName = AddressBookMain.contacts[index].getFirstName();
			if (name.equals(fullName)) {
				AddressBookMain.contacts[index]=null;
				System.out.println(AddressBookMain.contacts[index]);
			}
			else {
				System.out.println(name + " not Found");
			}
		}
		
		return;
	}
}
