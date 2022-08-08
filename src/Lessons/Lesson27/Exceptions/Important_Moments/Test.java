package Lessons.Lesson27.Exceptions.Important_Moments;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {

//* Очерёдность catch блоков очень важна. Компилятор не пропустит код, если исключение «super class» будет стоять перед
// исключением «sub class».

    public static void main(String[] args) {
        File f = new File("text.txt");
        try {
            FileInputStream fis = new FileInputStream(f);
        } catch (NullPointerException e) {
            System.out.println("Poyman Exception: 1" + e.getMessage());
        } catch (IOException e) {
            System.out.println("Poyman Exception: 3" + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Poyman Exception: 4" + e.getMessage());
        } catch (Throwable e) {
            System.out.println("Poyman Exception: 5" + e.getMessage());
//        } catch (FileNotFoundException e) {
//            System.out.println("Poyman Exception: 1" + e.getMessage());
        }
    }  //Здесь порядок имеет значение. Если уже написан блок с Exception super класса, то снизу уже нельзя писать блок
    // с его sub- классом. Но наоборот, сначала саб-класс, а потом родительский класс - можно!

//    catch (Exception e) {
//System.out.println(e);     -   выводит на экран тип исключения и сообщение(мессаж)
//System.out.println(e.getMessage());   -  выводит на экран сообщение(мессаж)
//e.printStackTrace(); }  -  выводит на экран стэк трейс
}


