package Finish_Test.Test_39;

//Что будет результатом компиляции и запуска данного кода?
class Test {
    static int a = 3;

    static void abc() {
        int a = 5;
        def();
    }

    static void def() {
        a += 2;
        ghi(a);
        System.out.println(a);
    }

    static void ghi(int a) {
        a -= 1;
    }

    public static void main(String[] args) {
        abc();
    }
}

// Output:
//5