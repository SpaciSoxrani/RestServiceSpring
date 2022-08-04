package org.example.repository;

import org.example.models.Client;
import org.example.models.Contacts;

import java.util.HashMap;
import java.util.Map;

public class ContactsRepository implements RepositoryInterface{
    private Map<Integer, Contacts> repository;

    public ContactsRepository() {
        this.repository = new HashMap<>();
    }
    @Override
    public void store(Object o) {
    }

    @Override
    public Object retrieve(int id) {
        return null;
    }

    @Override
    public Object search(String name) {
        return null;
    }

    @Override
    public Object delete(int id) {
        return null;
    }
}
