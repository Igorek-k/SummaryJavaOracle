package Lessons.Lesson28.Classes;

import java.time.*;

public class Test {
    static void smenaDejurnoog(LocalDate nachalo, LocalDate konec, Period p) {
        LocalDate data = nachalo;
        while (data.isBefore(konec)) {
            System.out.println("Nastupila data " + data + ". Pora menyat dejurnogo!");
            data = data.plus(p);
        }
    }
//    Если мы захотим поменять параметр "на какой период увеличивать время, дату", что бы не переписывать каждый раз
//    метод, если нужно что-то изменить - можно использовать класс Period

    public static void main(String[] args) {
//* Класс Period имеет конструктор с access modifier private. Методы of возвращают объект типа Period

        LocalDate nachalo = LocalDate.of(2023, Month.SEPTEMBER, 1);
        LocalDate konec = LocalDate.of(2024, Month.MAY, 31);
        Period p = Period.ofWeeks(2); //каждые две недели будет менять дежурный в методе smenaDejurnoog
        smenaDejurnoog(nachalo, konec, p);

//* Класс Period имеет следующие методы:
//public static Period ofDays(int колич_дней)
        p = p.ofDays(31);
//public static Period ofWeeks (int колич_недель)
        p = p.ofWeeks(4);
//public static Period ofMonths(int колич_месяцев)
        p = p.ofMonths(12);
//public static Period ofYears(int колич_лет)
        p = p.ofYears(10);
//public static Period of(int колич_лет, int колич_месяцев, int колич_дней)
        p = p.of(1,12,21);

//* Методы plus и minus могут быть использованны для прибавления и отнимания периодов к/от объектов класса LocalDate и
//  LocalDateTime. При попытке использования методов plus или minus для сложения или отнимания периода к/от объекта
//  класса LocalTime будет выброшен exception.
        LocalDate ld = LocalDate.of(2023,Month.AUGUST,3);
        Period pp = Period.ofWeeks(1);
        System.out.println(ld.plus(pp));
        Duration dd = Duration.ofHours(3);

        LocalDateTime ldt = LocalDateTime.of(2023,12,19,10,10);
        System.out.println(ldt.plus(pp).plus(dd));

//* При создании объекта класса Period не работает method chaining метода of. При попытке method chaining только
//  последний метод of имеет значение
    }
}
