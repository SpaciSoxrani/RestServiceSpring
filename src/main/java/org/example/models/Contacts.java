package org.example.models;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

public class Contacts implements Serializable {
    @Getter
    @Setter
    private String phoneNumber;
    @Getter
    @Setter
    private String email;

    public Contacts(String phoneNumber, String email){
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Contacts(){

    }
}
