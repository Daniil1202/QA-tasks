package org.example;

import java.sql.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Lesson_3 lesson3 = new Lesson_3();

        lesson3.printThreeWords();

        lesson3.checkSumSign();

        lesson3.printColor();

        lesson3.compareNumbers();

        System.out.println(lesson3.sumTwoNumbers(10, 2));

        lesson3.isIntNum(-4);

        System.out.println(lesson3.checkIntNum(3));

        lesson3.strAndInt("Hello", 4);

        System.out.println(lesson3.checkYears(100));

        int[] array = {0, 1, 1, 1, 0, 0, 1, 0};
        lesson3.chekArray(array);
        System.out.println();
        for (int num : array) {
            System.out.print(num + " ");
        }


        int[] arr = lesson3.longArray();
        System.out.println();
        for (int num : arr) {
            System.out.print(num + " ");
        }

        int[] arrayChange = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        lesson3.changeArray(arrayChange);
        System.out.println();
        for (int num : arrayChange) {
            System.out.print(num + " ");
        }


        System.out.println();
        int[][] matrix = new int[3][3];
        lesson3.twoDimArray(matrix);
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }


        int len = 5;
        int initialValue =10;
        int [] resultArray = lesson3.lenAndValue(len,initialValue);
        System.out.println();
        for (int num : resultArray){
            System.out.print(num + " ");
        }

    }
}