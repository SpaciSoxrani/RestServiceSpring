package org.example.models;

import java.io.Serializable;

public class Client implements Serializable {
    private int id;
    private String name;
    private Contacts contacts;

    public Contacts getContacts() {
        return contacts;
    }

    public void setContacts(Contacts contacts) {
        this.contacts = contacts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Client(int id, String name, Contacts contacts) {
        this.id = id;
        this.name = name;
        this.contacts = contacts;
    }

    public Client(Contacts contacts){
        this.contacts = contacts;
    }
    public Client(){
    }

    @Override
    public String toString() {
        return Integer.toString(getId()) + "," + getName() + "," + getContacts().getEmail() + "," + getContacts().getPhoneNumber();
    }
}
