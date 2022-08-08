package Lessons.Lesson20.Methods_ArrayList_AND_List;

import java.util.*;

public class Dopolnitelmno_methods_Les_20_1 {
    public static void main(String[] args) {
//  removeAll(Collections<?>c)--> boolean;
    //  Метод работает так же как и remove,но в параметре мы можем писать коллекцию. К примеру если мы в параметр
    // пишем ArrayList, то из нашего первого ArrayList будут удалены все элементы которые находятся во втором ArrayList
    //    (второй - это тот,который в параметре)
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("One");
        al1.add("Two");
        al1.add("Three");
        al1.add("Four");
        al1.add("Five");
        System.out.println("al1: " + al1);

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("One");
        al2.add("Three");
        al2.add("Four");
        al2.add("Ten");

        al1.removeAll(al2);
        System.out.println("al1: " + al1);
        // Все элементы что были в al2, удалились из al1.

//  retainAll(Collections<?>c) --> boolean;
        //Метод работает наоборот от предыдущего метода. Все,что во втором параметре будет сохранено, а все остальное
        //удалено:

        ArrayList<String> al3 = new ArrayList<>();
        al3.add("One");
        al3.add("Two");
        al3.add("Three");
        al3.add("Four");
        al3.add("Five");
        System.out.println("al3: " + al3);

        ArrayList<String> al4 = new ArrayList<>();
        al4.add("One");
        al4.add("Three");
        al4.add("Four");
        al4.add("Ten");

        al3.retainAll(al4);
        System.out.println("al3: " + al3);

//  containsAll(Collections <?> c) --> boolean;
        ArrayList<String> al10 = new ArrayList<>();
        al10.add("One");
        al10.add("Two");
        al10.add("Three");
        al10.add("Four");
        al10.add("Five");
        System.out.println("al10: " + al10);

        ArrayList<String> al11 = new ArrayList<>();
        al11.add("One");
        al11.add("Three");
        al11.add("Four");
        al11.add("Ten");
        System.out.println("al10: " + al10);

        boolean result = al10.containsAll(al11);
        //Содержит ли ArrayList al10 все элементы ArrayList al11??
        //Да - true/ false - нет
        System.out.println("result: " + result); //false (т.к. есть лишний элемент Ten)

//  subList(int fromIndex, int tolIndex) --> List<E>;
        List<String> sublist = al10.subList(1,4); //копирую в List кусочек с 1 по 4 индекс не включительно
        System.out.println("sublist: " + sublist);
        //subList не является отдельной сущностью, а лишь представление al10:
        sublist.add("TEEEN");
        System.out.println("al10: " + al10);
        System.out.println("sublist: " + sublist);
        //TEEEN добавился как и в sublist, так и в al10.

//  toArray() --> Object [];
        //Что бы из ArrayList получить Array используем данный метод
        Object [] arrayyy = al10.toArray();
        //Теперь все эллементы из ArrayList будут в массиве arrayyy

//  toArray(T [] a) --> T[] ;
        //Что бы создать массив определнного типа данных используем этот метод
        String [] array2 = al10.toArray(new String[15]);
        //Из ArrayList в массив типа String
        for (String s : array2){
            System.out.print(s + " ");
        }
        System.out.println();

//  List.of(E...elements) --> List<E> ;
        //Создает по быстрому лист, который будет полностью не изменяемым. Метод статический.
        List<String> list1 = List.of("One", "Two","Three");
        System.out.println("list1 = " + list1);
        //Метод не может содержать элементы null

//  List.copyOf(Collections <E> c) --> List <E> ;
        //Метод статический, принимает в параметр коллекцию и оутпут неизменяемый List
        ArrayList<String> al17 = new ArrayList<>();
        al17.add("One");
        al17.add("Two");
        al17.add("Three");
        al17.add("Four");
        al17.add("Five");

        List <String> list2 = List.copyOf(al17);
        System.out.println("list2 = " + list2); //Создали копию массива al17, но List
        //Метод не может содержать элементы null








    }
}
