package Lessons.Lesson20.Methods_ArrayList_AND_List;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_ {
    //List - структура данных, которая содержит в себе не упорядоченные элементы, допускает в себе содержания
    //дублированных элементов и элементы этой структуры пронумерованы.

    //ArrayList - нужна нам тогда, когда нам нужна структура похожая на массивы,но мы могли бы удалять или добавлять
    //элементы, изменять их и тд.
    //Грубо говоря ArrayList это массив, который можем изменять свою длину

    //Класс object  прородитель всех классов. Если мы имеем массив типа object, то элементами массива могу быть
    // любые типа данных,кроме примитивных(примитивные типы не являются классом)

    //В основе ArrayList лежит массив. ArrayList создается:
//    ArrayList<Data type> list1 = new ArrayList<Data type>();

//ArrayList нахдится в пакете java.util , поэтому что бы использовать его короткое имя,мы должны импортировать этот класс!

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Hello");
        Car c = new Car();
        list.add(c);
        Student st = new Student();
        list.add(st);
        list.add(new StringBuilder("Okay"));
        //Мы смогли в один ArrayList поместить 4 разных типа данных,потому что массив,который лежит в основе
        //ArrayList- а object! Хотя ArrayList привыкли использовать только для 1 типа данных:

        ArrayList<String> list2 = new ArrayList<String>(); //мы указали ,что данный ArrayList будет содержать только
        //данные типа String, поэтому другие типы мы не сможем использовать.

        ArrayList<String> list3 = new ArrayList(); //упрощенный вид записи. By defolt capacity 10 symbols
        ArrayList<String> lis = new ArrayList<>();//Упрощенный и более правильнвй вариант.
        List<StringBuilder> list4 = new ArrayList(); //такая запись так же корректа,хоть и придется импортировать отдельно
        //класс List: import java.util.List;

        ArrayList<String> list5 = new ArrayList<>(list); //В данном случае list ссылается на подобный объект list5,но
        System.out.println(list == list5);  //не на тот же. Результатом сравнение false.


    }
}


class Student {
}

class Car {
}
