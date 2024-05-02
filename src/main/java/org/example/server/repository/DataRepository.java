package org.example.server.repository;

import org.example.server.entity.Contact;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {
    public List<Contact> fetchData(){
        List<Contact> contacts = new ArrayList<Contact>();
        contacts.add(new Contact(1,"Jack","555-555 5555"));
        contacts.add(new Contact(2,"Jill","555-555 5556"));
        contacts.add(new Contact(3,"James","555-555 5557"));
        return contacts;
    }
}
