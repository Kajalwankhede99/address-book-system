package com.bridgelabz.addressbook;

import java.util.ArrayList;

public class AddressBook {

    public ArrayList<Contacts> contactList = new ArrayList<>();
    public  ArrayList<Contacts> addContactList(Contacts contactDetails){
        contactList.add(contactDetails);
        return contactList;
    }
}
