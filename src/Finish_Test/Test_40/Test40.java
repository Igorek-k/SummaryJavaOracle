package Finish_Test.Test_40;

//Что будет результатом компиляции и запуска данного кода?
class Test {
    public static void main(String[] args) {
        int a = 5;
        String s = (a > 3) ? "1" : (a > 0) ? "2" : "3";
        System.out.println(s);
    }
}

// Output:
//1