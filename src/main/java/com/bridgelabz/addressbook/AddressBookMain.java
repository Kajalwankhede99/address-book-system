package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the AddressBook System");

        AddressBook addressBook = new AddressBook();

        boolean flag = true;

        while (flag) {

            System.out.println("1.Add Contact");
            System.out.println("2.Display Contact");
            System.out.println("3.Edit Contact");
            System.out.println("4.Delete Contact");
            System.out.println("5.Exit");
            System.out.println("Enter Choice: ");

            int option = sc.nextInt();

            switch (option) {
                case 1:
                    addressBook.addContact();
                    break;

                case  2:
                    addressBook.displayDetails();
                    break;

                case 3:
                    System.out.println("Enter the Person First name to edit details: ");
                    String first_name = sc.next();

                    boolean b = addressBook.editContact(first_name);
                    if (b == true) {
                        System.out.println("Details Updated");
                    } else {
                        System.out.println("Contact Not Found");
                    }
                    break;

                case 4:
                    System.out.println("Enter the Contact for Deleting: ");
                    String firstName = sc.next();
                    boolean deleteContact = addressBook.deleteContactDetails(firstName);
                    if (deleteContact) {
                        System.out.println("Details Deleted !!!");
                    } else {
                        System.out.println("Cannot be Deleted !!!");
                    }
                    break;

                default:
                    System.out.println("Invalid choice !!!");

            }
        }

    }
}