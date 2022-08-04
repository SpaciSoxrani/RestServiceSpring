package org.example.repository;

import org.example.models.Client;

import java.util.*;

public class ClientRepository implements RepositoryInterface<Client>{
    private Map<Integer, Client> repository;

    public ClientRepository() {
        this.repository = new HashMap<>();
        //TODO: add logic
    }

    @Override
    public void store(Client client) {
        repository.put(client.getId(), client);
    }

    @Override
    public Client retrieve(int id) {
        return repository.get(id);
    }

    @Override
    public Client search(String name) {
        Collection<Client> clients = repository.values();
        for (Client client : clients) {
            if (client.getName().equalsIgnoreCase(name))
                return client;
        }
        return null;
    }

    @Override
    public Client delete(int id) {
        Client client = repository.get(id);
        this.repository.remove(id);
        return client;
    }

    public List<Client> getAll() {
        List<Client> clients = new ArrayList<>();

        clients.addAll(this.repository.values());

        return clients;
    }

}
