package org.example.models;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

public class Client implements Serializable {
    @Getter
    @Setter
    private int id;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private Contacts contacts;

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
        return getId() + "," + getName() + "," + getContacts().getEmail() + "," + getContacts().getPhoneNumber();
    }
}
