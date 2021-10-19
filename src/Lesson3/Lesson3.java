package Lesson3;

import java.util.Arrays;

import static java.lang.System.*;

public class Lesson3 {
    public static void main(String[] args) {

        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            {
                if (array[i] == 1) {
                    array[i] = 0;
                    out.print(array[i] + " ");
                } else if (array[i] == 0) {
                    array[i] = 1;
                    out.print(array[i] + " ");
                }
            }
        }

        out.println("-");

        int[] emptyArray = new int[100];
        for (int i = 0; i < 100; i++) {
            emptyArray[i] = i + 1;
            out.print(emptyArray[i] + " ");
        }

        out.println("----");

        int[] arrayDouble = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrayDouble.length; i++) {
            if (arrayDouble[i] < 6) {
                arrayDouble[i] = arrayDouble[i] * 2;
            }
            out.print(arrayDouble[i] + " ");
        }

        out.println("----");


        int[][] diagonal = new int[3][3];
        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal[i].length; j++) {
                int a = i - j;
                int b = j - i;
                if ((i == j) || (a == 2) || (b == 2)) {
                    diagonal[i][j] = 1;
                } else {
                    diagonal[i][j] = 0;
                }
                out.print(diagonal[i][j] + " ");
            }
        }

        out.println("----");

        int[] arrayMaxAndMin = {-80, 15, 56, -70, 5, 3};
        int min = arrayMaxAndMin[0];
        for (int i = 0; i < arrayMaxAndMin.length; i++) {
            if (arrayMaxAndMin[i] < min) {
                min = arrayMaxAndMin[i];
            }
        }
        out.println(min);
        int max = arrayMaxAndMin[0];
        for (int i = 0; i < arrayMaxAndMin.length; i++) {
            if (arrayMaxAndMin[i] > max) {
                max = arrayMaxAndMin[i];
            }
        }
        out.println(max);

        arrayWithValue(10, 15);

    }

    private static int[] arrayWithValue(int len, int initialValue) {
        int[] newArray = new int[len];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = initialValue;
        }
//        System.out.println(Arrays.toString(newArray)); ПРОВЕРКА
        return newArray;
    }
}

