package Finish_Test.Test_1;


public class Test1 {
}

//    Что будет результатом компиляции и запуска данного кода?
class B extends A {
    public int a = 20;
    public void abc() {
        System.out.println("child non-static"); }
    public static void abc2() {
        System.out.println("child static");
    }

    public static void main(String[] args) {

            B b = new B();
            System.out.println(b.a);
            System.out.println(((A) b).a);
            b.abc();
            ((A) b).abc();
            b.abc2();
            ((A) b).abc2();
        }
    }

    class A {
        public int a = 10;
        public void abc() {
            System.out.println("base non-static"); }
        public static void abc2() {
            System.out.println("base static");
        }
    }


//    Output:
//            20
//            10
//    child non-static
//    child non-static
//    child static
//    base static

