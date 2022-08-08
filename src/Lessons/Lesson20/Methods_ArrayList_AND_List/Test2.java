package Lessons.Lesson20.Methods_ArrayList_AND_List;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList(); //Создаем ArrayList без параметров <>
        al.add("One");
        al.add("Two");
        al.add("Three");
        al.add("Four");
        al.add("Five");
        for(Object o : al){ //Что бы for работал создает "о" типа Object
            System.out.println("Number: " + o + " and length: " + ((String)o).length()); //кастим "о" и типа данных
        }
    }
}
