package Finish_Test.Test_8;

//Что будет результатом компиляции и запуска данного кода?

import java.io.*;

class Test {
    public static void main(String args[]) {
        int a = abc();
        System.out.println(a);
    }

    static int abc() {
        try {
            FileInputStream fis = new FileInputStream("file_kotorogo_net.txt");
        } catch (FileNotFoundException e) {
            System.out.println("file ne nayden");
        } finally {
            System.out.println("eto finally block");
        }
        System.out.println("Programma prodoljaetsya");
        return 18;
    }
}

// Output:
//file ne nayden
//eto finally block
//Programma prodoljaetsya
//18