package Finish_Test.Test_12;

// Что будет результатом компиляции и запуска данного кода?
class Test {
    void abc() {
        try {
            def();
            return;
        } finally {
            System.out.println("finally");
        }
    }
    void def() {
        System.out.println("def");
        throw new StackOverflowError();
    }
    public static void main(String args[]) {
        Test t = new Test();
        t.abc();
    }
}

// Output:
//def
//finally
//StackOverflowError