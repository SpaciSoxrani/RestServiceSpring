package org.example.services;

import org.example.models.Client;
import org.springframework.stereotype.Service;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CSVConverter implements IConverter<Client>{
    public final String NAME_CSV_FILE = "PersonalContacts.csv";

    @Override
    public String ConvertToString(Client obj) {
        return obj.toString();
    }

    public List<List<String>> readLineByLine(Path filePath) throws Exception {
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(NAME_CSV_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                records.add(Arrays.asList(values));
            }
        }
        return records;
    }

    public void writeLineByLine(Client client, Path path) throws Exception {
        PrintWriter out = null;
        try {
            out = new PrintWriter(new BufferedWriter(new FileWriter(NAME_CSV_FILE, true)));
            out.println(client.toString());
        } catch (IOException e) {
            System.err.println(e);
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }
}
