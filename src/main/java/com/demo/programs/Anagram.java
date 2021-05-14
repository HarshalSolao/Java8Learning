package com.demo.programs;

import java.util.Arrays;
import java.util.Locale;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "Bike to Bib";
        String str2 = "Bib B iket o";

        System.out.println("The both string are anagram :" + isInputsAreAnagrams(str1, str2));

    }

    private static boolean isInputsAreAnagrams(String str1, String str2) {
        boolean flag = false;
        String newStr1 = str1.replaceAll("\\s", "").toLowerCase();
        String newStr2 = str2.replaceAll("\\s", "").toLowerCase();
        if (newStr1.length() != newStr2.length()) {
            return flag;
        } else {
            char[] arr1 = newStr1.toCharArray();
            char[] arr2 = newStr2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
           /* newStr1 = new String(arr1);
            newStr2 = new String(arr2);
            if (newStr1.equals(newStr2)){
                flag = true;
            }*/

            if(Arrays.equals(arr1,arr2)){
                flag = true;
            }
        }
        return flag;
    }
}
