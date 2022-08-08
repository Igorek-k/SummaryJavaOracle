package Lessons.Lesson27.Exceptions.Subclasses.Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception {
//* Саб-классы Exception так же называются -  checked exceptions(обязательны к проверке)

//* Checked исключения указывают на часть кода, который находится за пределами непосредственного контроля программой,
// и который может являться причиной выброса исключений. Они как правило возникают при взаимодействии вашей
//программы с внешними источниками (работа с файлами, с БД, с сетью), из за которых и могут возникать проблемы.
// Компилятор всегда проверяет возможность выброса checked исключений.

//* Checked исключения всегда должны быть или объявленны и/или обработанны.

    void abc() {                   // обработали Exceptions
        File f = new File("text8.txt");
        try {
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Vsem good day");
        } catch (FileNotFoundException e) {
            System.out.println("Lovim Exceptions: " + e);
        }
    }

    void abc1() throws FileNotFoundException {    //объявили об Exceptions
        File f = new File("text8.txt");

        FileInputStream fis = new FileInputStream(f);
        System.out.println("Vsem good day");

    }

    void def() {
        System.out.println("privet");
        abc();
    }

    //Если мы используем метод в методе, где объявили обязательное исключение, то данный метод нужно так же обработать
    // или объявить
    void def1() throws FileNotFoundException {
        System.out.println("privet");
        abc1();
    }

    void def2() {
        System.out.println("privet");
        try {
            abc1();
        } catch (FileNotFoundException e) {
            System.out.println("Lovim Exceptions: " + e);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Exception ex = new Exception();

//  Опять-таки при вызове метода, где Exception просто объявлен, нужно объявить его в текущем методе или обработать
        ex.def1();
        ex.def2();

        try {
            ex.def1();
        } catch (FileNotFoundException e) {
            System.out.println("Poimali Exception ");
            System.out.println(e);
            System.out.println(e.getMessage()); //метод, позволяющий вывести само послание Exception
            e.printStackTrace(); //выводит на экран Stack Trace - порядок выполнения Exception.
        }
    }
//*                Checked exceptions
//* Если метод -a- использует внутри себя метод -b-, который может выбросить checked исключение, то метод -a- должен:
//1. Или заключить вызов метода b в try/catch блоки;
//2. Или/и объявить, что он тоже может выбросить это checked исключение или его super класс.

}
