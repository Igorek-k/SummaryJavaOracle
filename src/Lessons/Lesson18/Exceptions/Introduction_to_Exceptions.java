package Lessons.Lesson18.Exceptions;

public class Introduction_to_Exceptions {
    //введение в исключения
    static String s;
    public static void main(String[] args) {
//  *   Array Index Out Of Bounds Exceptions:
       int array [] = new int [3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4; //компилятор не знает,что у нашего массива только 3 должно быть элемента,но при запуске программы
        //мы увидим Exceptions: ArrayIndexOutOfBoundsExceptions
        //Так как мы вышли за границу массива по его индексу.

//  * Null Pointer Exceptions
        int [][] array2  = new int[2][];
        System.out.println(array2[0][1]);
        //При попытке вывести на экран еще не определнный массив мы увидим: NullPointerExceptions

        System.out.println(s.length()); //второй пример
        // мы пытаемся ,что бы метод нам вывел на экран длину s, но она еще не определна, она сейчас null.


    }
}
