package com.company;

import com.google.gson.Gson;

public class SerializeToJSON implements GenericSerialize {
    @Override
    public void serializeData(StudentInfo studentInfo) {
        Gson gson = new Gson();
        String json = gson.toJson(studentInfo);
        System.out.println(json);
        System.out.println("\n");
    }
}
