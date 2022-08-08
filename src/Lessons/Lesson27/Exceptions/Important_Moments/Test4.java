package Lessons.Lesson27.Exceptions.Important_Moments;

import java.io.*;

public class Test4 {
//* При написании кода, вы можете использовать вложенные блоки try, catch и finally.
    FileInputStream fis1, fis2;

    public void abc() {
        try {
            fis1 = new FileInputStream("text.txt");
            try {
                fis2 = new FileInputStream("text10.txt");
            } catch (FileNotFoundException e) {
                System.out.println("File text10 doesn't found");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File text doesn't found");
        } finally {
            System.out.println("It's outer finally block");
            try {
                fis1.close();
                fis2.close();
            } catch (IOException e) {
                System.out.println("Found Exceptions in finally block");
            }
        }
    }

    public static void main(String[] args) {
        Test4 t = new Test4();
        t.abc();
    }
}
