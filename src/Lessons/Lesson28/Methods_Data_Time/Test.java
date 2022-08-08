package Lessons.Lesson28.Methods_Data_Time;

import java.time.*;

public class Test {
//* Дни и время *
//* LocalDate класс содержит информацию о дне: год, месяц, день.
//* LocalTime класс содержит информацию о времени: час, минуты, секунда, наносекунда.
//* LocalDateTime класс содержит информацию о дне и времени: год, месяц, день, час, минуты, секунда, наносекунда.

//Данные классы содержатся в пакете java.time
//* Данные 3 класса имеют статический метод now(), который возвращает соответствующие объекты с текущими значениями.

    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

//* У этих 3-х классов конструктор имеет access modifier private. Поэтому, мы не можем создавать объекты этих классов
//  используя конструкторы. Методы of возвращают объект соответствующего типа.

//                  * Методы "of" for LocalDate*
//public static LocalDate of(int год, int месяц, int день_месяца)
//public static LocalDate of(int год, Month месяц, int день_месяца)
        LocalDate ld = LocalDate.of(2022, 07, 16);
        LocalDate ld1 = LocalDate.of(2022, Month.JULY, 16);

//                   * Методы "of" for LocalTime*
//public static LocalTime of(int час, int минута)
        LocalTime lt = LocalTime.of(23, 05);
//public static LocalTime of(int час, int минута, int секунда)
        LocalTime lt1 = LocalTime.of(22, 32, 34);
//public static LocalTime of(int час, int минута, int секунда, int наносекунда)
        LocalTime lt2 = LocalTime.of(22, 32, 34, 676); //nano of second: до 9 символов

//                    * Методы "of" for LocalDateTime*
//public static LocalDateTime of(int год, int месяц, int день_месяца, int час, int минута)
//public static LocalDateTime of(int год, Month месяц, int день_месяца, int час, int минута)
        LocalDateTime ldt3 = LocalDateTime.of(2020, Month.DECEMBER, 16, 10, 59);
        LocalDateTime ldt = LocalDateTime.of(2020, 5, 16, 10, 59);

//public static LocalDateTime of(int год, int месяц, int день_месяца, int час, int минута, int секунда)
//public static LocalDateTime of(int год, Month месяц, int день_месяца, int час, int минута, int секунда)
        LocalDateTime ldt4 = LocalDateTime.of(2020, Month.DECEMBER, 16, 10, 59, 12);
        LocalDateTime ldt1 = LocalDateTime.of(2020, 5, 16, 10, 59, 32);

//public static LocalDateTime of(int год, int месяц, int день_месяца, int час, int минута, int секунда, int наносекунда)
//public static LocalDateTime of(int год, Month месяц, int день_месяца int час, int минута, int секунда, int наносекунда)
        LocalDateTime ldt5 = LocalDateTime.of(2020, Month.DECEMBER, 16, 10, 59, 12, 999123367);
        LocalDateTime ldt2 = LocalDateTime.of(2020, 5, 16, 10, 59, 32, 99999);

//public static LocalDateTime of(LocalDate день, LocalTime время)
        LocalDateTime ldt6 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        LocalDateTime ldt7 = LocalDateTime.of(ld,lt);

//* При некорректном указании параметров метода of выбрасывается соответствующий exception
    }
}
