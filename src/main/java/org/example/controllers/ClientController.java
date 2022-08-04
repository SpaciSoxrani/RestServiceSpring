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


    //read all lines from csv file
    @RequestMapping(value = "/rest/client/getAll", method = RequestMethod.GET,produces = "application/json")
    public @ResponseBody List<List<String>> getAllClients() throws Exception {
       return repository.getAll();
    }

    //add new line into csv file
    @RequestMapping(value = "/rest/client/create", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public Client createClient(@RequestBody Client client) throws Exception {
        repository.store(client);

        return client;
    }


}
