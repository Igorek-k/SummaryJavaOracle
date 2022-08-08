package Lessons.Lesson27.Error.SubClasses;

public class Test {
    //* ExceptionInInitializerError - его супер класс LinkageError - выбрасывается если в static init выбрасывается
//    RuntimeException. Это касается всего, что связано со static.
    int a = Integer.parseInt("12e");
    static String s = null;
    static int i = s.length();

    static String s1 = abc();

    static String abc() {
        String[] array = {"1", "2", "3"};
        return array[100];
    }

//* StackOverflowError - является наследником VirtualMachineError - рассмотрен в примере рекурсии Lessons.Lesson27.Error;

//* OutOfMemoryError - - является наследником VirtualMachineError - выбрасывает, когда заканчивается память

//* NoClassDefFoundError - его super класс LinkageError - выбрасывает, когда джава не может найти класс by Runtime

}
