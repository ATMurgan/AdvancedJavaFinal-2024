package com.example.finaltestjava2024;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class JsonParse {

    public static ApiResponse Json(String Path) throws IOException {

        Gson gson = new Gson();
        FileReader reader = new FileReader(Path);
        JsonObject jsonObject = gson.fromJson(reader, JsonObject.class);

        String company = jsonObject.get("Company").getAsString();
        JsonArray customersArray = jsonObject.getAsJsonArray("Customers");
        Type customerListType = new TypeToken<ArrayList<Customer>>(){}.getType();
        List<Customer> customers = gson.fromJson(customersArray, customerListType);

        reader.close();

        return new ApiResponse(company, customers);

    }
}
