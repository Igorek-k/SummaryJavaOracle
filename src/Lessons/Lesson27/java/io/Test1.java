package Lessons.Lesson27.java.io;

import java.io.*;

public class Test1 {
    //* java.io – это пакет, в котором собранны классы и интерфейсы, которые
//предназначенны, если обобщить, для чтения и записи информации из/в какой-
//либо источник, например файл
    public static void main(String[] args) throws Exception { // объявили исключение типа Exception
//* Класс File - абстрактная репрезентация пути к файлу или папке.
        File f = new File("test1.txt"); //"test1.txt" - путь к файлу.
        //У нас есть файл "test1.txt" - допустим его путь к файлу будет находить через переменную -f-
        // -f- это абстрактная репрезентация файла "test1.txt"

//* Класс FileInputStream предназначен для создания потока, с помощью которого можно читать информацию из источника.
        //Класс для чтения нужного нам файла
//        FileInputStream fis = new FileInputStream(f);
//        fis.read(); //метод для чтения файла

//* Класс FileOutputStream предназначен для создания потока, с помощью которого можно писать информацию в источник.
        //Класс для добавления информации в нужный нам файл
//        FileOutputStream fos = new FileOutputStream(f);
//        fos.write(5); //метод для добавления информации в файл

//* Конструкторы классов FileInputStream и FileOutputStream могут выбрасывать
//исключение FileNotFoundException.

//* Методы read и write классов FileInputStream и FileOutputStream могут
//выбрасывать исключение IOException.

//  IOException является супер классом FileNotFoundException.
    }


}
