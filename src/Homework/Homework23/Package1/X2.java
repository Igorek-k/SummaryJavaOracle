package Homework.Homework23.Package1;

public class X2 {
    public X2() {
        System.out.println("X");
    }

    public X2(int i) {
        System.out.println("X" + i);
    }

    private boolean abc() {
        return false;
    }

    public static void main(String[] args) {
        X2 x2  = new Y2(18);
        System.out.println(x2.abc());
    }
}

class Y2 extends X2 {
    public Y2(int i) {
        System.out.println("Y");
    }
    public boolean abc(){
        return true;
    }
}

//Result: X, Y, false