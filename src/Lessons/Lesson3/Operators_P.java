package Lessons.Lesson3;

public class Operators_P {
    public static void main(String[] args) {

        //Операторы присваивания: "+=", "-=", "*=", "/=".
    /* Можно использовать либо с одинаковыми типами переменных, либо от больше к меньшему. Прировнять long к int нельзя,
         но наоборот можно, т.к комплитор понимет,что значение из типа long может не вместиться в тип int. */

        long lg =100L;
        int it = 15;
        lg = 15L;
        System.out.print(lg);
        System.out.println();

        // Так же можно прировнять любой численный тип к любому дробному типу:

        long ln = 1000L;
        short sh = 8;

        double y = ln;
        float ft = sh;
        System.out.println(y);
        System.out.print(ft);
        System.out.println();


        // "=" оператор присваивания. а= 3, "=" присвоило значение "3" имени "а".

        int a= 3;
        a+=1; // тоже самое , что и  a = a + 1.
        // Как работает: сначала прибавь "+", потом присвой "=".
        System.out.println(a); // результат "4".

        int k1 = 15;
        int k2 = 5;
        int k3 = 30;
        k1-=5; // результат будет 10. 15 - 5 = 10. Можно записать иначе: k1 = k1-5.         /Вычитание/
        k2 *= 3; //результат будет 15. 5*3=15.                           k2 = k2*3;         /Умножение/
        k3 /= 10; //результат будет 3. 30/10=3.                          k3 = k3/10;        /Деление/

        System.out.println(k1);
        System.out.println(k2);
        System.out.println(k3);
        //Но если записать так:
        System.out.println(k1 + k2 + k3); //результат = 28. 10 + 15 + 3 = 28.


        int b = 2;
        int x =4 ;
        int c = 0;

        b=x=c=18; // в данном случае  "b", "x", "c" будут равняться 18. Компилятор начинает счёт с права, то есть
        //сначла "с" = 18, а "с" = "х", то есть и "х" = 18, "х" = "b", то есть "b" = 18.

        System.out.println(b);
        System.out.println(x);
        System.out.println(c);
    }
}
