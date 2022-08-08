package Homework.Homework10.p4;
import Homework.Homework10.p1.*;
import Homework.Homework10.p1.p2.p3.C;
import static Homework.Homework10.p1.p2.B.*;
import Homework.Homework10.p4.p5.E;

public class D {
    public static void main(String[] args) {
        //class A
        A classA = new A();
        System.out.println(classA.goh);
        classA.second(10,5,7);

        //class B static
        System.out.println(kor);
        first(143.5,23.7);

        //class C
        C classC = new C("first parametr","second parametr");

        //class E
        E classE = new E();
        System.out.println(classE.e + classE.el);
    }
}
