package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    public static Scanner sc = new Scanner(System.in);

    public ArrayList<Contacts> contactList = new ArrayList<Contacts>();

    public void addContact() {
        System.out.println("Enter the contact details: ");
        System.out.println("Enter the first name:");
        String firstName = sc.next();
        if (isUniqueName(firstName)) {
            System.out.println("Name already exists.");
            return;
        }
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

        contactList.add(new Contacts(firstName, lastName, address, city, state, zip, email, phoneNumber));
        System.out.println("Contact Details added successfully !!!!");

        for (Contacts contact : contactList) {
            System.out.println("First name: " + contact.getFirstname() + "\n" +
                    "Last name: " + contact.getLastName() + "\n" +
                    "Address: " + contact.getAddress() + "\n" +
                    "City: " + contact.getCity() + "\n" +
                    "State: " + contact.getState() + "\n" +
                    "Email: " + contact.getEmail() + "\n" +
                    "Contact no: " + contact.getPhoneNumber() + "\n" +
                    "Zip: " + contact.getZip());
        }

    }

    public boolean isUniqueName(String firstName) {
        for (Contacts contact : contactList) {
            if (contact.getFirstname().equalsIgnoreCase(firstName)) {
                return true;
            }
        }
        return false;
    }

    public void displayDetails()
    {
        if (contactList.isEmpty())
        {
            System.out.println("Details not Found !!!");
        }
        else {
            for (Contacts contact : contactList) {
                System.out.println(contact);
                System.out.println("Details Display Successfully !!!!!");

            }
        }

    }

    public boolean editContact(String Name) {
        int flag = 0;
        for (Contacts contact : contactList) {
            if (contact.getFirstname().equals(Name)) {
                System.out.println("Enter the choice to update Details:");

                int ch = sc.nextInt();
                switch (ch) {
                    case 1: {
                        System.out.println("Enter First Name: ");
                        String firstName = sc.next();
                        contact.setFirstname(firstName);
                        break;
                    }
                    case 2: {
                        System.out.println("Enter last name: ");
                        String lastName = sc.next();
                        contact.setLastName(lastName);
                        break;
                    }
                    case 3: {
                        System.out.println("Enter Address: ");
                        String address = sc.next();
                        contact.setAddress(address);
                        break;
                    }
                    case 4: {
                        System.out.println("Enter City: ");
                        String city = sc.next();
                        contact.setCity(city);
                        break;
                    }
                    case 5: {
                        System.out.println("Enter State: ");
                        String state = sc.next();
                        contact.setState(state);
                        break;
                    }
                    case 6: {
                        System.out.println("Enter Zip Code: ");
                        String zip = sc.next();
                        contact.setZip(zip);
                        break;
                    }
                    case 7: {
                        System.out.println("Enter Phone Number:");
                        String phoneNumber = sc.next();
                        contact.setPhoneNumber(phoneNumber);
                        break;
                    }
                    case 8: {
                        System.out.println("Enter Email: ");
                        String email = sc.next();
                        contact.setEmail(email);
                        break;
                    }

                }
                System.out.println("Details Updated Successfully !!!!!");
                System.out.println("First name: " + contact.getFirstname() + "\n" +
                        "Last name: " + contact.getLastName() + "\n" +
                        "Address: " + contact.getAddress() + "\n" +
                        "City: " + contact.getCity() + "\n" +
                        "State: " + contact.getState() + "\n" +
                        "Email: " + contact.getEmail() + "\n" +
                        "Contact no: " + contact.getPhoneNumber() + "\n" +
                        "Zip: " + contact.getZip());

                flag = 1;
                break;
            }
        }
        return flag == 1;
    }

    public boolean deleteContactDetails(String name) {
        int flag = 0;
        for(Contacts contact: contactList)
        {
            if(contact.getFirstname().equals(name))
            {
                contactList.remove(contact);
                flag = 1;
                break;
            }
        }
        return flag == 1;
    }
}