package Lessons.Lesson20.Methods_ArrayList_AND_List;

import java.util.*;

public class Method_ArrayList_with_ArreyList {
    //методы ArrayList и связанные с ArrayList
    public static void main(String[] args) {

//  clone() --> Object;
//Создает "клона", который ссылется на первоначальный объект.
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");

        ArrayList<StringBuilder> list1 = new ArrayList<>();
        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);

        ArrayList<StringBuilder> list2 = (ArrayList<StringBuilder>) list1.clone();
        //Мы создали list2 который равен list1. Все объекты list2 ссылаются на уже созданные объекты list1.
        System.out.println(list1 == list2); //falce. Они ссылаются на разные объекты,но
        System.out.println(list1.get(0) == list2.get(0)); //true, сами элемента ссылаются на одинаковые объекты

        list1.get(0).append("!!");
        System.out.println(list2.get(0)); //если поменять объект в list1,то эти изменения увидит и клон list2

        list1.set(0, new StringBuilder("D")); //если полностью изменить объект создав новый,то list2 уже не увидит изменений
        System.out.println(list2.get(0)); //и будет по прежнему выводить A!!

//  toArray() --> Object [];
//  toArray(DataType [] array) --> DataType [];
        //Первый вариант переводит ArrayList в объект массива (в Array)
        Object[] array = list1.toArray();
        for (Object c : array) {
            System.out.print(c + " "); //output object array
        }
        System.out.println();
        //Вариант второй переводим ArrayList в нужный нам тип
        StringBuilder[] array2 = list1.toArray(new StringBuilder[10]);
        for (StringBuilder o : array2) {
            System.out.print(o + " "); //output D,B,C 7x null
            //т.к. мы создали масив на 10 мест,3 места заполнились нашими первоначальными объектами ,оставшиеся 7 пустых
            //мест создались со значением null.
        }
        //Разница между методами: первый метод возвращает массив Object,а второй возвращает массив того типа данных,
        //который мы напишем в параметре
        //Данный метод создает новый массив,но его объекты ссылаются на уже существующие объекты,в данном примере,
        //на объекты list1

//  Array.asList(DataType []) --> List<DataType>
        System.out.println();
        StringBuilder [] masiv = {sb2,sb3,sb3,sb3};
        List<StringBuilder> list8 = Arrays.asList(masiv);
        System.out.println(list8);
        //List будет всегда такой длиной,как и массив. Его длина уже изменится не может.

        masiv[0].append("!!");
        System.out.println(list8);

        masiv[0] = new StringBuilder("!!!!");
        System.out.println(list8);
        //Этот List полностью связан с массивом, так что любое изменение в массиве отразятся на List

//  Collections.sort(ArrayList<DataType>) --> void;
        //Сортирует тот ArrayList,который указали.
        String s1 = "a";
        String s2 = "b";
        String s3 = "c";
        String s4 = "d";

        ArrayList<String> listik = new ArrayList<>();
        listik.add(s3);
        listik.add(s1);
        listik.add(s4);
        listik.add(s2);
        System.out.println(listik);//не отсортированный ArrayList

        Collections.sort(listik);
        System.out.println(listik); // отсортировали ArrayList

//  equals(ArrayList<DataType>) --> boolean;
        //Два объекта ArrayList равны или нет?
        ArrayList<String> listik2 = listik;
        System.out.println(listik.equals(listik2)); //true

        ArrayList<String> listik3 = new ArrayList<>();
        listik3.add(s3);
        listik3.add(s1);
        listik3.add(s4);
        listik3.add(s2);
        Collections.sort(listik3);

        System.out.println(listik.equals(listik3)); //true Они равны
        //Два ArrayList считаются одинаковыми, если они содержат одни и те же элементы.







    }
}

