package org.example;

public class BowlForCat {
    private int foodAmount;

    public BowlForCat(int initialFood) {
        this.foodAmount = Math.max(initialFood, 0);
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void addFood(int amount) {  //добавление еды
        if (amount > 0) {
            foodAmount = foodAmount + amount;
        }
    }

    public boolean eating(int amount) {     //уменьшение еды
        if (amount <= foodAmount && amount > 0) {
            foodAmount = foodAmount - amount;
            return true;    // успешно покушал
        }
        return false;
    }
}
