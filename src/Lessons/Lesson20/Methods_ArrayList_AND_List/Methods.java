package Lessons.Lesson20.Methods_ArrayList_AND_List;

import java.util.ArrayList;
import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
//  add(Data type element) --> boolean;    В этом методе boolean всегда true!
//  add(int index, Data type element) --> boolean;
        ArrayList<String> list = new ArrayList<>();
        list.add("Buy");
        list.add("Hello");
        list.add("Ok");   //Этот метод добавляет элементы. Вывод на экран: Buy Hello Ok
        list.add(1, "How are you?"); //Теперь мы How are you? поместили на место 1-го индекса. Все индексы
        //после 1-го смещаются на +1. Ok был под индексом 2,но теперь под индексом 3.
        list.add(1, "Дубликат"); //Дубликат стал на первый индекс.
        list.add(1, "Дубликат");//ArrayList поддерживает дубликаты!

        for (String s : list) {
            System.out.print(s + " ");
        }

// get(int index) --> Data type;
        //Возвращает элемент ArrayList. По этому какого типа данных ArrayList,такой типа данных и вернет данный метод.
        System.out.println();
        System.out.println(list.get(4)); ////4-й элемент Hello
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

//  set(int index,Data type element) --> DataType;  //set работает как replace. Заменяет один элемент на другой.
        list.set(1, "!!!!");
        for (String s : list) {
            System.out.print(s + " ");
        }

//  remove(object element) --> boolean; //метод удаляет по значению объекта и тогда результат будет true/false
//    remove(int index) --> DataType;  //метод удаляет по индексу.
        System.out.println();
        list.remove(2);
        for (String s : list) {
            System.out.print(s + " ");
        }
        //Удаление по значению объекта
        System.out.println();
        ArrayList<StringBuilder> lis = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("fjkghgjrghj");
        StringBuilder sb2 = new StringBuilder("YYYTTTTRRRREEEE");
        lis.add(sb1);
        lis.add(sb2);
        for (StringBuilder s : lis) {
            System.out.print(s + " ");
        }
        System.out.println();

        lis.remove(sb1);  //если в параметрах указать ew StringBuilder("fjkghgjrghj") - удаление не произойдет!
        //Но со стрингом такое бы сработало.
        for (StringBuilder s : lis) {
            System.out.print(s + " "); //
        }

//  addAll(ArrayList aL) --> boolean; //добавляет значение в конец. Типы исп. данных должны совпадать.
//    addAll(int index,ArrayList aL) --> boolean; //добавляет значение на место указанного индекса
        System.out.println();

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Petrov");
        list2.add("Ivanov");

        list.addAll(list2);
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();

        list.addAll(1, list2);
        for (String s : list) {
            System.out.print(s + " ");
        }

//   clear() --> void; - позволяет быстро очистить наш ArrayList.
        list2.clear();
        System.out.println();

        for (String s : list2) {
            System.out.print(s + " ");
        }

//  indexOf(object element) --> int;
        list.add("Hello");
        System.out.println(list.indexOf("Hello")); //result: 5. Т.к. Первое значение Hello расположен под 5 индексом.
        //Находит самое первое совпадение.

//  lastIndexOF(Object element) --> int;
        System.out.println(list.lastIndexOf("Hello")); //result: 9. Т.к. второе значение Hello расположен под 9 индексом.
        //Находит самое последнее  совпадение.

        //Если объект будет не найден в оутпут выйдет "-1"

//  size()-->int;
        System.out.println(list.size()); //показывает кол-во элементов  lista

//  isEmpty() --> boolean; //Проверяет пустой ли ArreyList.
    //  Если size == 0 - считается пустым; size !=0 не считается пустым;
        System.out.println(list.isEmpty());

//  contains(Object element) --> boolean;
        //Принимает свой параметр и проверяет есть ли такой объект в нашем ArreyList
        System.out.println(list.contains("Hello"));
        //метод работает на основе сравнения quels. То есть с StringBuldier нужно быть внимательнее

//  toString() --> String;
        //Что бы не исп. каждый раз метод for or foreach существует метод toString который показывет нам как
          // выглядит объект ArreyList на экране в виде строки.
        System.out.println(list.toString());
        //Метод работает очень красиво))
        //Работает для любых объектов. Но если попытаться вывести референс тип как Student or Car, то выводит будет их ссылок
        //(вроде бы) ,как минимум не то,что бы хотелось.

//  compare
//  mismath
        //Оба эти метода сравнивют массивы одного типа. Могут и притивные сравнивать,так и реферс.
        //Более полезные при сравнениии примитивных типов данных
        //эти методы работают по принципу Лексикографического сравнения : сортировка как в словаре.

        //Префиксом считается общая часть состоящая в двух массивах.
        int [] array1 = {1,2,3,4,5}; //по "словарю" это запись идет первой ( из-за цифры 4), префикс "123"
        int [] array2 = {1,2,3,5};  //это второй
        int [] array5 = {1,2,3,5};

        char [] array3 = {'p','r','i','v','e','t'};  //это первой
        char [] array4 = {'p','r','i','v','i','v','k','a'}; // это второй

        System.out.println(Arrays.compare(array1,array2)); //result: -1.
        //Возвращает значение меньше нуля, когда первый массив меньше второго.
        System.out.println(Arrays.compare(array2,array1)); //result: 1.
        //Возвращает значение больше нуля, когда первый массив больше второго.
        System.out.println(Arrays.compare(array2,array5)); //result: 0.
        //Возвращает ноль,если массивы одинаковые
        System.out.println(Arrays.compare(array3,array4)); //result: -4.
        //array3 меньше массива array4

        //Если сравнивать какой-то массив,который ссылаетсч на null с другим массивом, то null refernse всегда меньше
        //not null referense. Output 1 or 1+

//  mismath
    // Метод находит индекс первого расхождения массивов или -1 - если они одинаковые.
        System.out.println(Arrays.mismatch(array2,array5)); //result -1;
        //массивы одинаковые

        System.out.println(Arrays.mismatch(array2,array1)); //result 3;
        //Возвращает индекс элемента первого расхождения.
        // Последовательность не важна.

        System.out.println(Arrays.mismatch(array3,array4)); //result 4;
        //Возвращает индекс элемента первого расхождения.
    }
}
