package org.example.models;

import java.io.Serializable;

public class Contacts implements Serializable {
    private String phoneNumber;
    private String email;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Contacts(String phoneNumber, String email){
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Contacts(){

    }
}
