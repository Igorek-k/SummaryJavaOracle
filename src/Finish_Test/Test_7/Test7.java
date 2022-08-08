package Finish_Test.Test_7;

public class Test7 {
}


//    Что будет результатом компиляции и запуска данного кода?
class Test {
    public static void main(String[] args) {
        int a = 8;
        do {
            while (a++ < 12) {
                a += 4;
            }
        } while (a < 4);
        System.out.println(a);
    }
}

// Output:
//14