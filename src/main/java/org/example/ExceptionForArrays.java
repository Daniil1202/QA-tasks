package org.example;

public class ExceptionForArrays {
    public static int matrixArray(String[][] matrix) throws MyArraySizeExeption, MyArrayDataExeption {
        if (matrix.length != 4 || matrix[0].length != 4) {
            throw new MyArraySizeExeption("Размер массива должен быть 4 на 4 (4х4)");
        }

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                try {
                    sum += Integer.parseInt(matrix[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataExeption("Неверные данные в ячейке [" + i + "][" + j + "]");
                }

            }


        }
        return sum;

    }


}


