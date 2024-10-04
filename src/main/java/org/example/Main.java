package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static boolean checkForPalindrome(String str) {
        String cleanedStr = str.replaceAll("[\\p{Punct}\\s]", "").toLowerCase(Locale.forLanguageTag("tr"));

        char[] chars = cleanedStr.toCharArray();
        String[] charsReverse = new String[cleanedStr.length()];

        int ind = chars.length - 1;

        for (char ch : chars) {
            charsReverse[ind] = Character.toString(ch);
            ind--;
        }

        StringBuilder reversedStr = new StringBuilder();
        for (String ch : charsReverse) {
            reversedStr.append(ch);
        }

        System.out.println(cleanedStr);
        System.out.println(reversedStr);

        return cleanedStr.equals(reversedStr.toString());
    }






    public static String convertDecimalToBinary(int num){
        if (num == 0) return "0";
        int number = num;
        ArrayList<Integer> digitValues = new ArrayList<>();
        String result = "";


        while(number > 0){
            digitValues.add(number%2);
            number = number/2;
        }

        for(int i = digitValues.size()-1 ; i >= 0 ; i--){
            result+=Integer.toString(digitValues.get(i));
        }

          return result;
    }




}