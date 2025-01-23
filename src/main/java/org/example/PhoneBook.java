package org.example;

import javax.swing.text.html.parser.Entity;
import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> phoneBook = new HashMap<>();


    public void add(String lastName, String phoneNumber) {
        for (List<String> numbers : phoneBook.values()) {
            if (numbers.contains(phoneNumber)) {
                System.out.println("Номер: " + phoneNumber + " уже существует");
                return;
            }

        }
        phoneBook.computeIfAbsent(lastName, k -> new ArrayList<>()).add(phoneNumber);
        System.out.println("Запись добавлена " + lastName + "-" + phoneNumber);

    }

    public List<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, new ArrayList<>());
    }


}


