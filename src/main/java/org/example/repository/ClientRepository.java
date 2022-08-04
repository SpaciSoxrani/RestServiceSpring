package org.example.repository;

import org.example.converter.CSVConverter;
import org.example.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Converter;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

@Repository
public class ClientRepository implements IRepository<Client> {
    private Map<Integer, Client> repository;
    @Autowired
    private CSVConverter csvConverter;

    private final Path CSV_PATH = Path.of("C:\\Users\\I553132\\IdeaProjects\\RestServiceSpring\\src\\main\\resources\\PersonalContacts.csv");

    public ClientRepository() {
        this.repository = new HashMap<>();
        //TODO: add logic
    }

    @Override
    public void store(Client client) throws Exception {
        repository.put(client.getId(), client);
        csvConverter.writeLineByLine(client);
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
        for (Client client : clients) {
            if (client.getName().equalsIgnoreCase(name))
                return client;
        }
        return null;
    }

    //TODO: add logic
    @Override
    public Client delete(int id) {
        Client client = repository.get(id);
        this.repository.remove(id);
        return client;
    }

    public List<String[]> getAll() throws Exception {

        return csvConverter.readLineByLine(CSV_PATH);
    }

}
