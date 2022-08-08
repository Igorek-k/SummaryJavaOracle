package Lessons.Lesson19;

public class Enhanced_for {
    //Enhanced for = foreach - используют в основном для работы с массивами,коллекциями
    public static void main(String[] args) {
        int[] array = {4, 3, 6, 7, 4};
        for (int a : array) { //переменная "а" по очереди принимает все значения массива
            System.out.print(a + " ");
        } //так же после компиляции джава наш foreach loop преобразует в classical loop

        //что бы посчитать сумму массива:
        int summa = 0;
        for (int b : array) {
            summa += b;
        }
        System.out.println();
        System.out.println(summa); //переменная "а" по очереди принимает все значения массива и суммирует их.
    }

    //С помощью foreach мы не можем поменять примитивные типы данных !
    //С помощью методов внутри foreach мы можем менять значения объектов ( если объект позволяет это) , но не сам объект!!
}

class To_be_contined {
    public static void main(String[] args) {
        String[] students = {"Ivanov", "Petrov", "Sidorov"};
        String[] exams = {"mat.Analiz", "Filossofia"};
        for (String s1 : students) {
            for (String s2 : exams) {
                System.out.println(s1 + " " + s2);
            }
        }
    }
}

class To_be_contined2 {
    public static void main(String[] args) {
        int[][] array = {{3, 6, 5}, {4, -5}, {3, 5, 7, 3, 8, 1, 4}};
        for (int[] array2 : array) {
            for (int a : array2) {
                System.out.print(a + " ");
            }
        }

        System.out.println();

        int[][][] test = {{{3, 4, 1}, {2, 0, -9, 4}, {3, 2, 4, 3, 2, 9}}, {{3, 4, 6, 22, -99, 54}, {45, 4}},
                {{3, 2}, {1, 2, 7, 5}, {3, -12, 45}, {45, 43, 0,}}};
        for (int [][] test2 : test) {
            for (int [] test3 : test2) {
                for (int a : test3) {
                    System.out.print(a + " ");
                }
            }
        }

    }
}
