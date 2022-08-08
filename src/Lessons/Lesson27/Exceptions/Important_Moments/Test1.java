package Lessons.Lesson27.Exceptions.Important_Moments;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test1 {
//* Если в части кода, которая не находится в блоке try или в блоке try выбрасывается исключение,
// то соответствующая оставшаяся часть кода уже не обрабатывается.
//* После выброса исключения мы можем увидеть стэк трейс для всех методов, задействованных в выбросе этого исключения.

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder("");
        try {
            File f = new File("text.txt");
            System.out.println("Object File sozdalsya");
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Stream sozdalsya");
            int counter = 0;
            while (true) {
                counter++;
                result.append(fis.read());
                System.out.println("Informacia chitaetsya");
                if (counter == 3) {
                    fis.close();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Exceptions 1");
        } catch (IOException e) {
            System.out.println("Exceptions 2");
        } finally {
            System.out.println("It's finally");
        }
    }


}
