package Lessons.Lesson17;

public class Test {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder(123);
        StringBuilder sb2 = sb1.append("45");
         sb2 = sb2.append("6").append("7");
        System.out.println(sb1);
        System.out.println(sb2);
        //Поскольку sb1 и sb2 ссылаються на один и тот же объект,каждое изменение sb1 или sb2 будет менять друг-друга.
        //Это один и тот же объект,соответственно на экран выйдет одинаковый результат : 1234567.

    }
}

class  Test1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder(123);
        StringBuilder sb2 = new StringBuilder(123);
        StringBuilder sb3 = sb2;
        System.out.println(sb1 == sb2);  //false
        System.out.println(sb1.equals(sb2)); //false
        //Method equals in class StringBuilder works the same how and "=="
        //Метод equals в классе StringBuilder работает ровно так же ,как и "==".
        System.out.println(sb1.equals(sb2)); //только в этом случае будет true.
    }
}
