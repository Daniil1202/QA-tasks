package org.example;

import java.util.ArrayList;
import java.util.List;

public class Park {
    private List<Attraction> attractions;


    public Park() {
        this.attractions = new ArrayList<>();
    }

    public void addAttraction(String name, String workHours, double price) {
        Attraction attraction = new Attraction(name, workHours, price);
        attractions.add(attraction);
    }

    public void infoByAttraction() {
        System.out.println("Аттракционы: ");
        for (Attraction attraction : attractions) {
            attraction.infoDisplay();
            System.out.println();
        }
    }

    private class Attraction {
        private String name;
        private String workHours;
        private double price;

        public Attraction(String name, String workHours, double price) {
            this.name = name;
            this.workHours = workHours;
            this.price = price;
        }

        public void infoDisplay() {
            System.out.println("Название акктрациона: " + name);
            System.out.println("Время работы: " + workHours);
            System.out.println("Стоимость: " + price + " за 30 минут");
        }
    }
}