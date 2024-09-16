package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to the AddressBook System");

        AddressBook addressBook = new AddressBook();

        System.out.println("Enter the contact details.............");
        System.out.println("Enter the first name:");
        String firstName = sc.next();
        System.out.println("Enter the last name:");
        String lastName = sc.next();
        System.out.println("Enter the address:");
        String address = sc.next();
        System.out.println("Enter the city:");
        String city = sc.next();
        System.out.println("Enter the state:");
        String state = sc.next();
        System.out.println("Enter the zip code:");
        String zip = sc.next();
        System.out.println("Enter the phone no:");
        String phoneNumber = sc.next();
        System.out.println("Enter the email:");
        String email = sc.next();
        Contacts contactDetails = new Contacts(firstName,lastName,address,city,state,zip,phoneNumber,email);

        ArrayList<Contacts> contactList = addressBook.contactList(contactDetails);
        for(Contacts contact:contactList){
            System.out.println("First name: "+contact.getFirstname()+"\n"+
                    "Last name: "+contact.getLastName()+"\n"+
                    "Address: "+contact.getAddress()+"\n"+
                    "City: "+contact.getCity()+ "\n"+
                    "State: "+contact.getState()+"\n"+
                    "Email: "+contact.getEmail()+"\n"+
                    "Contact no: "+contact.getPhoneNumber()+"\n"+
                    "Zip: "+contact.getZip());
        }

    }
}
