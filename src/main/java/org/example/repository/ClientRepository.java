package org.example.repository;

import org.example.services.CSVConverter;
import org.example.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.nio.file.Path;
import java.util.*;
import java.util.stream.Stream;

@Repository
public class ClientRepository implements IRepository<Client> {
    private Map<Integer, Client> repository;
    @Autowired
    private CSVConverter csvConverter;
    private final String NAME_CSV_FILE = "PersonalContacts.csv";
    public ClientRepository() {
        this.repository = new HashMap<>();
        //TODO: add logic
    }

    @Override
    public void store(Client client) throws Exception {
        repository.put(client.getId(), client);
        csvConverter.writeLineByLine(client, NAME_CSV_FILE);
    }

    //TODO: add logic
    @Override
    public Client retrieve(int id) {
        return repository.get(id);
    }

    //TODO: add logic
    @Override
    public Client search(String name) {
        Collection<Client> clients = repository.values();
        return repository.values().stream().filter(x->x.getName() == name).findFirst().get();
    }

    //TODO: add logic
    @Override
    public Client delete(int id) {
        Client client = repository.get(id);
        this.repository.remove(id);
        return client;
    }

    public List<List<String>> getAll() throws Exception {

        return csvConverter.readLineByLine(NAME_CSV_FILE);
    }

}
