package org.example;

public class Dog extends Animal {
    private static int countDog = 0;

    public Dog() {
        super();
        countDog++;
    }

    public static int getCountDog() {
        return countDog;
    }

    @Override
    public void run(int distance) {
        if (distance < 0) {
            System.out.println("Дистанция не может быть отрицательной ");
            return;
        }
        int runDistance = 500;
        if (distance <= runDistance) {
            System.out.println("Собака пробежала " + distance + " метров. ");
        } else {
            System.out.println("Собака не может пробежать больше " + runDistance + " метров.");
        }

    }

    @Override
    public void swim(int distance) {
        if (distance < 0) {
            System.out.println("Дистанция не может быть отрицательной ");
            return;
        }
        int swimDistance = 10;
        if (distance <= swimDistance) {
            System.out.println("Собака проплыла " + distance + " метров. ");
        } else {
            System.out.println("Собака не может проплыть больше " + swimDistance + " метров.");
        }

    }
}
