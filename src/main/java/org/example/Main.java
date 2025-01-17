package org.example;

import static org.example.ExceptionForArrays.matrixArray;

public class Main {
    public static void main(String[] args) {

        //пример корректного массива
        String[][] validMatrix = {
                {"1 ", "2 ", "3 ", "4 "},
                {"5 ", "6 ", "7 ", "8 "},
                {"9", " 10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        //пример некорректного массива
        String[][] notValidMatrix = {
                {"1", "2 ", "3 "},
                {"5 ", "6 ", "7 "},
                {"9", " 10", "11"},
                {"13", "14", "15"}
        };

        String[][] invalidDataArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "ten", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            System.out.println("Сумма элементов: " + matrixArray(validMatrix));
        } catch (MyArraySizeExeption | MyArrayDataExeption e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Сумма элементов: " + matrixArray(notValidMatrix));
        } catch (MyArraySizeExeption | MyArrayDataExeption e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Сумма элементов: " + matrixArray(invalidDataArray));
        } catch (MyArraySizeExeption | MyArrayDataExeption e) {
            System.out.println(e.getMessage());
        }


    }


}