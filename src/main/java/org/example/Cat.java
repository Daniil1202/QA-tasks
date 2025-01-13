package org.example;

public class Cat extends Animal {
    private final int distanceRun = 200;
    private static int countCat = 0;
    private boolean isFull;  //сытость

    public Cat() {
        super();
        countCat++;
        this.isFull = false;
    }

    public static int getCountCat() {
        return countCat;
    }

    @Override
    public void run(int distance) {
        if (distance < 0) {
            System.out.println("Дистанция не может быть отрицательной ");
            return;
        }
        if (distance <= distanceRun) {
            System.out.println("Кот пробежал " + distance + " метров.");
        } else {
            System.out.println("Кот не может пробежать больше " + distanceRun + " метров");
        }

    }

    @Override
    public void swim(int distance) {
        System.out.println("Коты не умеют плавать");
    }

    public void eat(BowlForCat bowlForCat) {
        if (!isFull && bowlForCat.getFoodAmount() > 0) {
            bowlForCat.eating(1);             //кот сьедает одну еденицу еды
            isFull = true;                      // становится сытым
        }
    }

    public boolean isFull() {
        return isFull;                              //проверяем сыт ли наш кот
    }

}
