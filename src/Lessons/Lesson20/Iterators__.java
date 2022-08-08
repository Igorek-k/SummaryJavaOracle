package Lessons.Lesson20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators__ {
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "b";
        String s3 = "c";
        String s4 = "d";

        ArrayList<String> listik = new ArrayList<>();
        listik.add(s3);
        listik.add(s1);
        listik.add(s4);
        listik.add(s2);

        Iterator<String> it = listik.iterator();  //создание объекта it
        //Iterator - это повторитель. С помощью объекта it мы сможем пробежаться по элементам List
        while(it.hasNext()){ //метод hasNext смотрит есть слеущие элементы или нет
            System.out.println(it.next()); //метод next выдает этот элемент
            //если есть дальше элемент мы будем входить в тело while и выводить на экран

            ListIterator<String> it1 = listik.listIterator(); //бывает и такая разновидность
            while(it1.hasNext()) {
                System.out.println(it1.next());
            }
            //Отличие от foreach заключается в том, что с помощью Iterator мы можем удалить элемент ArrayList, а с
            //помощью foreach нельзя.
            while(it.hasNext()) {
                it.next();
                it.remove(); //удаление элемента

            }
        }


    }
}
