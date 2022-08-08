package Lessons.Lesson29.Part_2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test2 {
    public static void main(String[] args) {
        List<String> list = List.of("Hello", "Bye", "How are you?", "I am good");
//        for(var s : list){
//            System.out.println(s);
//        }
//     Тоже самое, но гораздо проще вариант
        list.forEach(s -> System.out.println(s));

        ArrayList<Integer> al = new ArrayList<>();
        al.add(4);
        al.add(3);
        al.add(2);
        al.add(1);
        al.add(7);
        al.add(6);
        al.add(5);
//  Удалить объекты, которые делятся на цело на 3
        //al.removeIf(element -> element % 3 == 0);

//        Второй способ сделать то же самое
        //Predicate<Integer> p = element -> element % 3 == 0;
        //al.removeIf(p);

        System.out.println(al);

//  Сортировка ArrayList
        al.sort((x,y) -> x.compareTo(y));
        al.sort((x,y) -> -x.compareTo(y)); //если добавить минус перед x сортировка будет в обратном порядке

        System.out.println(al);
    }
}
