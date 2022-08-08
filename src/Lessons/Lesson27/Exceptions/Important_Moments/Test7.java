package Lessons.Lesson27.Exceptions.Important_Moments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test7 {
    static FileInputStream fis1, fis2;

    public static void main(String[] args) {
        try {
            fis1 = new FileInputStream("text.txt");
            System.out.println("File found and file in the system");
            try {
                fis2.close();
            } catch (IOException e) {
                System.out.println("Problems with file fis2");
            }
        }catch(FileNotFoundException e){
            System.out.println("File text9 doesn't found");
        }catch(NullPointerException e){
            System.out.println("Worked NullPointerException");
        }
    }
}
