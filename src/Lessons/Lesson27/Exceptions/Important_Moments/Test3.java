package Lessons.Lesson27.Exceptions.Important_Moments;

import java.io.*;

public class Test3 {
//* Исключение может быть перевыброшенно. Это обычно делают тогда, когда код вашего текущего метода обработал данное
// исключение не полностью и выбрасывает его вновь, чтобы метод, который будет вызывать текущий метод завершил обработку
// данного исключения.

    void abc() throws FileNotFoundException {
        try {
            File f = new File("text.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("Exceptions poyman i nemnogo obrabotan");
            throw e; //выбрасываем исключение
        } finally {
            System.out.println("Its block finally!");
        }

    }

    void method() {
        try {
            abc();
        } catch (FileNotFoundException e) {
            System.out.println("Exceptions poyman i polnostyu obrabotan");
        }
    }


    void def() {
        try {
            int[] array = {1, 2, 3};
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exceptions poyman i nemnogo obrabotan");
            throw e;
        } finally {
            System.out.println("Its block finally!");
        }

    }
}
