package Homework.Homework9;

public class Test3 {

    int a =1;
    static int b =2 ;
    void abc(final int a){
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(Test2.b);
    }

    public static void main(String[] args) {
        Test3 t = new Test3();
        t.abc(4);
    }
}


