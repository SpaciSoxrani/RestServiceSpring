package org.example.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.io.Serializable;

@NoArgsConstructor
@Getter @Setter
public class Contacts implements Serializable {
    private String phoneNumber;
    private String email;

    public Contacts(String phoneNumber, String email){
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
