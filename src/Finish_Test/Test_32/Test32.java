package Finish_Test.Test_32;

public class Test32 {
}

//    Что будет результатом компиляции и запуска данного кода?
class Test {
    static int x = abc(1);

    {
        x = abc(2);
    }

    static {
        x = abc(3);
    }

    public static void main(String args[]) {
        Test t = new Test();
    }

    static int abc(int i) {
        System.out.println(i);
        return i;
    }
}


// Output:
//   1
//   3
//   2