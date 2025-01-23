package org.example;


import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] wordArray = {
                "Apple", "Banana", "Orange", "Apple", "Banana",
                "Grape", "Kiwi", "Orange", "Watermelon", "Apple",
                "Kiwi", "Banana", "Grape", "Strawberry", "Kiwi", "Banana"
        };
        HashMap<String, Integer> words = new HashMap<>();
        for (String word : wordArray) {
            words.put(word, words.getOrDefault(word, 0) + 1);

        }
        for (String word : words.keySet()) {
            int tmp = words.get(word);
            System.out.println("Слово: " + word + " встречается " + tmp + " раз(а)");
        }
        System.out.println();


        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Petrov", "89158674432");
        phoneBook.add("Ivanov", "89158674454");
        phoneBook.add("Kuznetsov", "89158744432");
        phoneBook.add("Medvedev", "89156544732");
        phoneBook.add("Petrov", "89158674563");
        phoneBook.add("Medvedev", "89158674432");

        System.out.println(phoneBook.get("Petrov"));
        System.out.println(phoneBook.get("Medvedev"));


    }

}