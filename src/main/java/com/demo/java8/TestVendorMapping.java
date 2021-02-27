package com.demo.java8;

import org.json.JSONArray;
import org.json.JSONObject;
public class TestVendorMapping {
    public static void main(String args[]){
        String data = "[\n" +
                "{\n" +
                "\"product\": \"BROADBAND\",\n" +
                "\"vendorId\": \"ATT\",\n" +
                "\"vendorName\": \"att\",\n" +
                "\"transportTYpe\": \"Fiber\",\n" +
                "\"vendorType\": \"dedicated\",\n" +
                "\"additionalAttributes\": [\n" +
                "{\n" +
                "\"key\": \"String\",\n" +
                "\"value\": \"string\"\n" +
                "}\n" +
                "]\n" +
                "},\n" +
                "{\n" +
                "\"product\": \"BROADBAND\",\n" +
                "\"vendorId\": \"ATT\",\n" +
                "\"vendorName\": \"att\",\n" +
                "\"transportTYpe\": \"COAX\",\n" +
                "\"vendorType\": \"dedicated\",\n" +
                "\"additionalAttributes\": [\n" +
                "{\n" +
                "\"key\": \"String\",\n" +
                "\"value\": \"string\"\n" +
                "}\n" +
                "]\n" +
                "},\n" +
                "{\n" +
                "\"product\": \"BROADBAND\",\n" +
                "\"vendorId\": \"Spectrum\",\n" +
                "\"vendorName\": \"Spectrum\",\n" +
                "\"transportTYpe\": \"Fiber\",\n" +
                "\"vendorType\": \"nondedicated\",\n" +
                "\"additionalAttributes\": [\n" +
                "{\n" +
                "\"key\": \"String\",\n" +
                "\"value\": \"string\"\n" +
                "}\n" +
                "]\n" +
                "},\n" +
                "{\n" +
                "\"product\": \"BROADBAND\",\n" +
                "\"vendorId\": \"Century Link\",\n" +
                "\"vendorName\": \"Century Link\",\n" +
                "\"transportTYpe\": \"COAX\",\n" +
                "\"vendorType\": \"nondedicated\",\n" +
                "\"additionalAttributes\": [\n" +
                "{\n" +
                "\"key\": \"String\",\n" +
                "\"value\": \"string\"\n" +
                "}\n" +
                "]\n" +
                "},\n" +
                "{\n" +
                "\"product\": \"BVE\",\n" +
                "\"vendorId\": \"Level3\",\n" +
                "\"vendorName\": \"Level3\",\n" +
                "\"transportTYpe\": \"\",\n" +
                "\"additionalAttributes\": [\n" +
                "{\n" +
                "\"key\": \"String\",\n" +
                "\"value\": \"string\"\n" +
                "}\n" +
                "]";
        JSONArray jsonArr = new JSONArray(data);
        for (int i = 0; i < jsonArr.length(); i++)
        {
            JSONObject jsonObj = jsonArr.getJSONObject(i);

            System.out.println(jsonObj);
        }
    }

}