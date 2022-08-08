package Finish_Test.Test_41;

public class Test41 {
}

// Что будет результатом компиляции и запуска данного кода, если программу запускать с помощью
// следующей строки: java Test ok privet poka

class Test {
    public static void main(String[] args) {
        String[] array = new String[7];
        for (int i = 0; i < array.length; i++) {
            if (i < args.length)
                array[i] = args[i];
            System.out.println(array[i].toUpperCase());
        }
    }
}

// Output:
//ok
//privet
//poka
//NullPointerEception

