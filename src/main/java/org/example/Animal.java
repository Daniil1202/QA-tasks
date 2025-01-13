package org.example;

public abstract class Animal {
    private static int countAnimals = 0;

    public Animal() {
        countAnimals++;
    }

    public static int getCountAnimals() {
        return countAnimals;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);

}
