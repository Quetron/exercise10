package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        collectionOfContacts myContacts = new collectionOfContacts();

        for(Contact a : myContacts){
            System.out.println(a);
        }
    }
}
class Contact{
    private String name;
    private String emailAdress;

    public Contact(String name, String emailAdress) {
        this.name = name;
        this.emailAdress = emailAdress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", emailAdress='" + emailAdress + '\'' +
                '}';
    }
}

class collectionOfContacts implements Iterable<Contact>{
    private ArrayList<Contact> listOfContacts = new ArrayList<>();

    @Override
    public String toString() {
        return "collectionOfContacts{" +
                "listOfContacts=" + listOfContacts +
                '}';
    }

    public collectionOfContacts() {
        listOfContacts.add(new Contact("Tom", "Tom@gmail.com"));
        listOfContacts.add(new Contact("Tim", "Tim@gmail.com"));
        listOfContacts.add(new Contact("Tiff", "Tiff@gmail.com"));
        listOfContacts.add(new Contact("Timmy", "Timmy@gmail.com"));
    }

    @Override
    public Iterator<Contact> iterator() {
        return listOfContacts.iterator();
    }
}
