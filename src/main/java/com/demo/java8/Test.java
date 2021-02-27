package com.demo.java8;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args){
        Map<String, String> parameters = new LinkedHashMap<>();
        String gtName = "Customer Communication";
        parameters.put("module","comm");
        parameters.put("sourceModule","ODO"+"-"+gtName);
        parameters.put("requesterUserId","A87567HYY");
        parameters.put("requesterRole",""); //GT WorkQueue
        parameters.put("customerId","C1234");
        parameters.put("agreementId","ASD1234");
        System.out.println(getParamStringFromMap(parameters));

    }

    private static String getParamStringFromMap(Map<String,String> parameters){
        StringBuilder text = new StringBuilder();
        for (Map.Entry<String,String> entry :parameters.entrySet()) {
            text.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
        }
        return text.substring(0, text.length() - 1);
    }
}
