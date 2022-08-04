package org.example.models;

import org.springframework.beans.factory.annotation.Autowired;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Client {
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

    public Client(Contacts contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return id + "," + name;
    }
}
