package org.example;

public class Lesson_3 {

    // задаине № 1
    public void printThreeWords() {
        System.out.println("Orange\n" + "Banana\n" + "Apple ");
    }

    //  задаине № 2
    public void checkSumSign() {
        int a = 2;
        int b = 1;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Cумма положительная");
        } else {
            System.out.println("Сумма отрицательная ");
        }
    }

    // задаине № 3
    public void printColor() {
        int value = 50;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    // задаине № 4
    public void compareNumbers() {
        int a = 1;
        int b = 2;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }

    }

    // задаине № 5
    public boolean sumTwoNumbers(int a, int b) {
        int sum = a + b;
        return (sum >= 10 && sum <= 20);
    }

    // задаине № 6
    public void isIntNum(int b) {
        if (b >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    // задаине № 7
    public boolean checkIntNum(int number) {
        return number <= 0;

    }

    // задаине № 8
    public void strAndInt(String text, int a) {
        for (int i = 1; i <= a; i++) {
            System.out.println(text);
        }
    }

    // задаине № 9
    public boolean checkYears(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        return false;
    }

    // задаине № 10
    public void chekArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }

        }

    }

    // задаине № 11
    public int[] longArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;

    }

    // задаине № 12

    public void changeArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }

        }
    }

    // задаине № 13
    public void twoDimArray(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                } else if (array.length-1-i ==j){
                    array[i][j] =1;
                } else {
                    array[i][j] = 0;

                }

            }

        }

    }


    // задаине № 14
    public int[] lenAndValue(int len, int initialValue){
        int [] array = new int [len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }



}