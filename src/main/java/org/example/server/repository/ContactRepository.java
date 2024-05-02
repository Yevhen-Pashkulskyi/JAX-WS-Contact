package org.example.server.repository;

import org.example.server.entity.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactRepository {
    public List<Contact> fetchContacts(){
        List<Contact> list = new ArrayList<Contact>();
        list.add(new Contact(1,"Jack","555-555 5555"));
        list.add(new Contact(2,"Jill","555-555 5556"));
        list.add(new Contact(3,"James","555-555 5557"));
        return list;
    }
}
