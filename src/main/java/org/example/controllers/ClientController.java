package org.example.controllers;

import org.example.models.Client;
import org.example.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    private ClientRepository repository;

    @GetMapping("/rest/client/get/{id}")
    public Client getClientByID(@PathVariable("id") int id) {
        return repository.retrieve(id);
    }

    @GetMapping("/rest/client/getAll")
    public List<Client> getAllClients() {
        return repository.getAll();
    }

    @PostMapping("/rest/client/create")
    public Client createClient(@RequestBody Client client) {
        repository.store(client);
        return client;
    }

    @GetMapping("/rest/client/search/{name}")
    public Client getClientByName(@PathVariable("name") String name) {
        return repository.search(name);
    }

    @DeleteMapping("/rest/client/delete/{id}")
    public Client deleteClientByID(@PathVariable("id") int id) {
        return repository.delete(id);
    }
}
