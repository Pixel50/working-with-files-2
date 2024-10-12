package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {


            List<Employee> employees = XMLParser.parseXML("data.xml");


            String json = JsonConverter.listToJson(employees);


            FileWriter.writeString("data2.json", json);

            System.out.println("JSON файл успешно создан!");

    }
}