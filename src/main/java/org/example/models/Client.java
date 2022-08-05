package org.example.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.io.Serializable;

@NoArgsConstructor
@Getter @Setter
public class Client implements Serializable {
    private int id;
    private String name;
    private Contacts contacts;

    public Client(int id, String name, Contacts contacts) {
        this.id = id;
        this.name = name;
        this.contacts = contacts;
    }

    public Client(Contacts contacts){
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return getId() + "," + getName() + "," + getContacts().getEmail() + "," + getContacts().getPhoneNumber();
    }
}
