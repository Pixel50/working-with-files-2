package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileWriter {
    public static void writeString(String fileName, String data) {
        try {
            Files.write(Paths.get(fileName), data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
