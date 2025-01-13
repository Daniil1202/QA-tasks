package org.example;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat1 = new Cat();
        cat.run(201);
        cat.swim(0);

        Dog dog = new Dog();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog.run(500);
        dog.swim(11);


        System.out.println("Общее количесвто животных равно : " + Animal.getCountAnimals());
        System.out.println("Общее количесвто котов равно : " + Cat.getCountCat());
        System.out.println("Общее количесвто cобак равно : " + Dog.getCountDog());

        BowlForCat bowlForCat = new BowlForCat(6);

        Cat[] cats = new Cat[7];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat();
        }
        for (Cat cat3 : cats) {
            cat3.eat(bowlForCat);
        }
        for (int i = 0; i < cats.length; i++) {
            System.out.println("Кот " + (i + 1) + " -" + " сытость :" + (cats[i].isFull() ? " сыт" : " голоден "));
        }

        bowlForCat.addFood(5);
        System.out.println("Количество еды в миске: " + bowlForCat.getFoodAmount());


    }
}