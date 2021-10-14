package Lesson2;

public class Lesson2 {

    public static void main(String[] args) {

        checkSum(10, 3);
        posOrNegWithPrint(-9);
        posOrNegReturn(9);
        printString("Privet", 8);
        leapYearOrNot(2021);
//      leapYearOrNottest(400);
    }

    public static boolean checkSum(int a, int b) {
        if (10 >= (a + b) && (a + b) <= 20) {
            return true;
        }
        return false;
    }

    public static void posOrNegWithPrint(int a) {
        if (a >= 0) {
            System.out.println("Положительное число");
        } else
            System.out.println("Отрицательное число");
    }

    public static boolean posOrNegReturn(int a) {
       return a < 0;
    }

    public static void printString(String a, int b) {
        for (int i = 1; i <= b; i++) {
            System.out.println(a);
        }
    }

    public static boolean leapYearOrNot(int c) {
        if (c % 400 == 0) {
            return true;
        } else if ((c % 100 == 0)) {
            return false;
        } else if ((c % 4 == 0) || (c % 400 == 0))  {
            return true;
        } else
            return false;
    }

// Проверка 5 задания
//  public static void leapYearOrNottest(int c) {
//     if (c % 400 == 0) {
//          System.out.println("Високосный");
//     } else if ((c % 100 == 0)) {
//          System.out.println("Невисокосный");
//     } else if ((c % 4 == 0) || (c % 400 == 0))  {
//          System.out.println("Високосный");
//     } else
//          System.out.println("Невисокосный");
//     }
}

