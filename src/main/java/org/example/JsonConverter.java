package org.example;

import com.google.gson.Gson;

import java.util.List;

public class JsonConverter {

    public static String listToJson(List<Employee> employees) {
        Gson gson = new Gson();
        return gson.toJson(employees);
    }
}
