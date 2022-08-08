package Lessons.Lesson20;
import java.util.*;


public class Collections_1 {
    //Collections имеет несколько детей:
//    * List список
//    * интерфейс Set  - множество
//    *интерфейс Queue - очередь
//    И особнячком стоит:
//    *интерфейс Map

    //Коллекция List запоминает порядок элементов,которые мы добавляем. List имеет индексацию и позволяет дублировать
    //элементы

    //Коллекция Set не содержит дубликатов, не запоминает куда мы добавили эллементы
    //Set имеет два важных класса: HashSet and TreeSet

    //Коллекция Queue исполуем правило Fifo - first inp first out - кто первый зашел,тот первым и выйдет
    //Queue имеет наследника: DeQueue - двухстороння очередь, благодаря этому помимо правила Fifo мы можем
    //реализововать правило Lifo - last inp first out - последний зашел,вышел первым


    //Map не отсносят к коллекциям. Его элементы это пары. Пара ключа  и значения Key/value
    //Map реализует два самых распространенных класса: HashMap (самый распр) и TreeMap
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>(); //<> - защита типоданых (дженерик). В Map указываем оба типа данных
        map.put(777,"Ivanov Misha");
        map.put(778,"Remig Zaur");
        map.put(779,"Sidorova Masha");
        map.put(780,"Petrov  Petr");
        //Цифры - ключ. Имена - данные
        System.out.println("Map: " + map);
        //Если добавить еще одну пару,с уже используемым ключем
        map.put(779,"Katya Novik");
        System.out.println("Map: " + map);
        //"Sidorova Masha" исчезнет, её перезапишет "Katya Novik".

        //Но если добавить еще одну "Katya Novik", но уже с другим ключем,проблем не будет
        map.put(781,"Katya Novik");
        System.out.println("Map: " + map);

        //Что бы удалить элемент из списка мы должны использовать ключ:
        map.remove(779);
        System.out.println("Map: " + map);
    }





}
