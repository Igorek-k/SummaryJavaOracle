package Finish_Test.Test_5;

public class Test5 {
}


//    Что будет результатом компиляции и запуска данного кода?
class Test {
    static int j = 5;
    static void abc(int i) {
        System.out.println(i);
    }
    public static void main(String[] args) {
        abc(j++);
        System.out.println(j);
    }
}

// Output:
//5
//6