package Lessons.Lesson26.Wrapper_Classes;

import java.util.ArrayList;

public class Test1 {
//* Wrapper classes: конвертирует притивные типы данных в референс
//byte – Byte | short - Short | int - Integer | long - Long
//float – Float | double - Double | char - Char | boolean - Boolean

//* Autoboxing – это конвертирование примитивных типов данных в соответствующий wrapper класс.
//* Unboxing – это конвертирование объекта типа wrapper класс в соответствующий примитивный тип данных.

//*Метод valueOf позволяет нам создавать новый объект wrapper класса того типа, на котором данный метод был вызван.
    public static void main(String[] args) {
        ArrayList <Integer>list = new ArrayList <>();
        list.add(5);  //пример Autoboxing

        int a = list.get(0);               //пример Unboxing

//  У всех числовых  Wrapper Classes  родитель Number.

//  Метод parse n - позволяет нам конвертировать подходящее значение типа данных String в соответствующий примитивный
//  тип данных:
        String s = " 50";
        String s1 = "50";
        String s2 = "true";
        String s3 = "dgdsgtrue";
//        int i = Integer.parseInt(s); ||| exceptions - любой символ,даже пробел, помимо числа не может быть в int
        int i1 = Integer.parseInt(s1);
        boolean b1 = Boolean.parseBoolean(s2); //true
        boolean b2 = Boolean.parseBoolean(s3);  //false | все символы помимо true воспринимаются как ложь
        System.out.println(i1);
        System.out.println(b1);

//  Метод valueOf - позволяет нам создавать новый объект wrapper класса того типа, на котором данный метод был вызван:
        String s4 = "3.14";
        Integer i3 = Integer.valueOf(10);
        Double d3 = Double.valueOf(s4);
        Byte b = (byte)6; //без каста -6- воспринимается как инт и происходит ошибка. С valueOf аналогично
        Byte b3 = Byte.valueOf((byte)3);
        System.out.println(i3);
        System.out.println(d3);
    }
}
