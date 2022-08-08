package Lessons.Lesson25.Casting.Casting_Primitive;

public class Test {
    //В примитивных типах upcasting and downcasting заменяется на widening:
//*          19 forms of widening:
//byte: to short, int, long, float, or double     | byte заменяется на short, или int, или long, или float, or double
//short: to int, long, float, or double
//char: to int, long, float, or double
//int: to long, float, or double
//long: to float or double
//float: to double

    public static void main(String[] args) {
        byte b = 5;
        int a = b; //Расширение: теперь b -byte- будет сидеть в более широком интервале a -int-

        //Сужение:
//*Narrowing without casting происходит, если выполняются 3 условия:
//1. Если int cast-ится в byte, short или char;
//2. Если значение int – это константа;
//3. Если значение int помещается в соответствующий тип данных.
        byte b2 = 3; //-3- это int      | Цифра это константа. 3 - константа
        short s2 = -6; //- -6 - это int | -6 - константа
        char c2 = 100; //-100- это int  | 100 - константа
        int i2 = 3;
//        short s3 = i2;  i2 уже не константа. Без кастинга компилятор не пропускает.

//*    22 forms of narrowing:   Сужение, но уже с кастингом
//  short: to byte or char
//  char: to byte or short
//  int: to byte, short, or char
//  long: to byte, short, char, or int
//  float: to byte, short, char, int, or long
//  double: to byte, short, char, int, long, or float
         int i3 = 5;
         short s3 = (short) i3;

         long l3 = 1;
         int i4 = (int) l3;


//* Numeric promotion - Это конвертация меньшего численного типа данных в больший.
//  Numeric promotion происходит в следующих случаях:
//* Если имеются 2 значения разных типов данных, Java автоматически конвертирует меньший числовой тип данных в больший:
        int i10 = 5;
        long l10 = 10;
        i10 = (int)(i10*l10);  // инт конвертируется в лонг
        i10*=l10;  //можно и таким способом
        System.out.println(i10+l10); //инт конвертируется в лонг и после прибавляется

//* Если одно из значений - это целое число, а другое дробное, Java автоматически конвертирует целочисленный тип данных
//  в дробный:
        float f = 3.14f;
        int i = 10;
        System.out.println(i + f); //инт конверт. во флоат

//* Если значения типов данных byte, short, и char участвуют в арифметических операциях, то они перед этим конвертируются
//  в тип данных int, даже если в данных арифметических операциях значение типа данных int не участвует.
//  Исключение: Унарные операторы. Использование ++ к типу данных byte не конвертирует результат оператора в int:
        byte b1 = 3;
        short s = 4;
        char c = 5;
        System.out.println(b1 + s + c); //все типы конвертируются в инт, а после происходит сложение
        System.out.println(b1++); //исключение: b1 конвертироваться в инт не будет.

//* После применения вышеуказанных 3-х правил, когда все операнды стали одного типа данных, результирующее значение,
//  которое получается после срабатывания всех операторов будет такого же типа данных, что и тип данных операнд:
        byte bb = 3;
        float ff = 7f;
        double dd = 4.5;
        System.out.println(bb + ff - dd);
        //bb переводится в int, после конвертируется в float и происходит сложение : (bb + ff), после результат этого
        //сложения конвертируется в тип double и происходит следующие действие (результат (bb + ff) - dd) , в итоге
        // результат данного вывода будет число типа double.
    }
}
