package Lessons.Lesson28.Classes;

import java.time.*;

public class Test1 {
//Duration тоже-самое, что и класс Period только с меньшими значениями.

    public static void main(String[] args) {
//* Класс Duration имеет конструктор с access modifier private. Методы of возвращают объект типа Duration.

//public static Duration ofDays(long колич_дней)
        Duration d = Duration.ofDays(2);
//public static Duration ofHours (long колич_часов)
        Duration d1 = Duration.ofHours(48);
//public static Duration ofMinutes(long колич_минут)
        Duration d2 = Duration.ofMinutes(1232);
//public static Duration ofSeconds(long колич_секунд)
        Duration d3 = Duration.ofSeconds(64);
//public static Duration ofMillis(long колич_миллисекунд)
        Duration d4 = Duration.ofMillis(32); //одна тысячная секунды
//public static Duration ofNanos(long колич_наносекунд)
        Duration d5 = Duration.ofNanos(232322); //одна миллиардная секунды

//* Методы plus и minus могут быть использованны для прибавления и отнимания объекта класса Duration к/от объектов
// класса LocalTime и LocalDateTime. При попытке использования методов plus или minus для сложения или отнимания
// объекта класса Duration к/от объекта класса LocalDate будет выброшен exception.
        LocalTime lt  = LocalTime.of(10,43,32,21);
        Duration dd = Duration.ofHours(3);
        System.out.println(lt.plus(dd));

        Period pp = Period.ofWeeks(1);
        LocalDateTime ldt = LocalDateTime.of(2023,12,19,10,10);
        System.out.println(ldt.plus(pp).plus(dd));

//* При создании объекта класса Duration не работает method chaining метода of. При попытке method chaining только
// последний метод of имеет значение.

    }
}
