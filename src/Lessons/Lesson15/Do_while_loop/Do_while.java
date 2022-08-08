package Lessons.Lesson15.Do_while_loop;

public class Do_while {
    //практически не отличается от while, в переводе грубо говоря "делай,пока выполняеться условие"
    /*Его синтаксис:
    do {
    Statement 1;
    Statement 2;
    .................
    Statement 3;
    }
    while ( condition);
     */
    public static void main(String[] args) {
        int i =1;
        do {
            System.out.println(i);
            i++;
        }
        while(i==10); //в do while мы сначала делаем что-то,а потом проходим проверку. Не смотря на то,что в условии
        //false, из тела метода все равно вывелось на экран  System.out.println(i);
        System.out.println(i);//то есть если вывести i она будет не 1,а 2.
    }
    //Если циклы выполняються бесконечное кол-во раз,то всё,что после этого цикла не будет работать. Так как программа,
    //будет бесконечно выполнять цикл,пока не закончится память.
}

