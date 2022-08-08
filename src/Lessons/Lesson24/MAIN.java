package Lessons.Lesson24;

import java.sql.SQLOutput;

public class MAIN {
    public final static void main(String[] args) {
        //Если сделать метод main -final- его функциональность не измениться, просто в саб-классе MAIN мы не сможем
        //overriding или hide-дить мейн.
        System.out.println("Hello");
    }
}

class A{
    String s = "privet";
    public void abc(){
        System.out.println("???");
    }
}

class B extends A{
    String s = "Poka";
    public void abc(){
        System.out.println("!!!");
    }
}

class C extends B{
    public static void main(String[] args) {
        C c = new C();
        c.abc();     // Будет уже перезаписанный метод из класса В. Так как он унаследовал сразу перезаписанный метод
        System.out.println(c.s); //То же самое и с переменной
    }
}
