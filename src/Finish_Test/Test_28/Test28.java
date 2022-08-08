package Finish_Test.Test_28;

//Что будет результатом компиляции и запуска данного кода?
class Test {
    static int a = 3;
    public static void main(String[] args) {
        int b = 1 + (a = 5);
        System.out.println(b);
    }
}

// Output:
//6