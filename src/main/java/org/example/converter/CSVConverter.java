package org.example.converter;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import org.example.models.Client;
import org.springframework.context.annotation.Scope;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

@Scope("singleton")
public class CSVConverter implements IConverter<Client>{

    @Override
    public String ConvertToString(Client obj) {
        return obj.toString();
    }

    public void AddNewClient(Client client) throws IOException {
        String csv = "PersonalContacts.csv";
        CSVWriter writer = new CSVWriter(new FileWriter(csv, true));
        String [] record = client.toString().split(",");
        writer.writeNext(record);
        writer.close();
    }

    public List<String[]> readLineByLine(Path filePath) throws Exception {
        List<String[]> list = new ArrayList<>();
        try (Reader reader = Files.newBufferedReader(filePath)) {
            try (CSVReader csvReader = new CSVReader(reader)) {
                String[] line;
                while ((line = csvReader.readNext()) != null) {
                    list.add(line);
                }
            }
        }
        return list;
    }

    public void writeLineByLine(Client client ) throws Exception {
        String csv = "PersonalContacts.csv";
        CSVWriter writer = new CSVWriter(new FileWriter(csv, true));
        writer.writeNext(client.toString().split(","));
        writer.close();
    }
}
