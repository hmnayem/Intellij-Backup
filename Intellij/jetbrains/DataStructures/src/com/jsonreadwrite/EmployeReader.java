package com.jsonreadwrite;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import javax.json.Json;
import javax.json.JsonReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class EmployeReader {

    public static final String JSON_FILE = "/home/guru/Desktop/data.json";

    public static void main(String[] args) throws IOException {

        InputStream is = new FileInputStream(JSON_FILE);

        JsonReader jsonReader = Json.createReader(is);

        JSONObject jsonObject = (JSONObject) jsonReader.readObject();

        jsonReader.close();
        is.close();

        Employee employee = new Employee();
        employee.setId((Integer) jsonObject.get("id"));
        employee.setName((String) jsonObject.get("name"));
        employee.setPermanent((Boolean) jsonObject.get("permanent"));
        employee.setRole((String) jsonObject.get("role"));

        JSONArray phoneNos = (JSONArray) jsonObject.get("phoneNumbers");
        long[] numbers = new long[phoneNos.size()];
        int i = 0;
        for (Object value : phoneNos) {
            numbers[i++] = Long.parseLong((String) value);
        }

        employee.setPhoneNumbers(numbers);

        JSONObject object = (JSONObject) jsonObject.get("address");

        Address address = new Address();

        address.setStreet((String) object.get("street"));
        address.setCity((String) object.get("city"));
        address.setZipcode((Integer) object.get("zipcode"));

        System.out.println(employee);
    }
}
















