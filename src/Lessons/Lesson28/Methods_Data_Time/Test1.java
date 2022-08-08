package Lessons.Lesson28.Methods_Data_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Test1 {
//* Изменение объектов классов LocalDate, LocalTime и LocalDateTime: Объекты данных 3-х классов являются immutable *

    public static void main(String[] args) {
//    * Методы LocalDate *
        LocalDate ld = LocalDate.of(2022, 07, 16);

//plusDays(long количество_дней) --> LocalDate
        ld = ld.plusDays(45);                       //прибавляет дни
//minusDays(long количество_дней) --> LocalDate
        ld = ld.minusDays(1207);                 //убавляет дни

//plusWeeks(long количество_недель) --> LocalDate
        ld = ld.plusWeeks(23);                     // прибавляет недели
//minusWeeks(long количество_недель) --> LocalDate
        ld = ld.minusWeeks(3);                  // убавляет недели

//plusMonths(long количество_месяцев) --> LocalDate
        ld = ld.plusMonths(5);                     //прибавляет месяца
//minusMonths(long количество_месяцев) --> LocalDate
        ld = ld.minusMonths(12);                //убавляет месяца

//plusYears(long количество_лет) --> LocalDate
        ld = ld.plusYears(411);                      //прибавляет года
//minusYears(long количество_лет) --> LocalDate
        ld = ld.minusYears(1);                    //убавляет года

        //Method changing
        ld = ld.minusYears(34).plusDays(43).minusMonths(43).plusWeeks(2);


//    * Методы LocalTime *
        LocalTime lt = LocalTime.of(23, 05);

//plusHours(long количество_часов) --> LocalTime
        lt = lt.plusHours(5);                   //прибавляет часы
//minusHours(long количество_часов) --> LocalTime
        lt = lt.minusHours(34);             //убавляет часы

//plusMinutes(long количество_минут) --> LocalTime
        lt = lt.plusMinutes(52);                 //прибавляет минуты
//minusMinutes(long количество_минут) --> LocalTime
        lt = lt.minusMinutes(334);            //убавляет минуты

//plusSeconds(long количество_секунд) --> LocalTime
        lt = lt.plusSeconds(51);                 //прибавляет секунды
//minusSeconds(long количество_секунд) --> LocalTime
        lt = lt.minusSeconds(44);            //убавляет секунды

//plusNanos(long количество_наносекунд) --> LocalTime
        lt = lt.plusNanos(23);                 //прибавляет наносекунды
//minusNanos(long количество_наносекунд) --> LocalTime
        lt = lt.minusNanos(31);            //убавляет наносекунды

        //Method changing
        lt = lt.minusNanos(3331).plusSeconds(23).minusHours(43).plusMinutes(23);


//    * Методы LocalDateTime *
        LocalDateTime ldt = LocalDateTime.of(2020, Month.DECEMBER, 16, 10, 59);

//Методы LocalDateTime охватывают методы LocalDate и LocalTime и в оутпуте возвращают LocalDateTime.
        ldt = ldt.minusHours(4).plusYears(4).minusDays(4).minusNanos(43);


//        * Методы isAfter и isBefore *
//Методы isAfter и isBefore могут быть использованы для сравнения объектов классов LocalDate, LocalTime и LocalDateTime.
// Данные методы возвращают boolean. Компилятор разрешает сравнивать только объекты соответствующих классов.
        LocalDateTime ldt1 = LocalDateTime.of(2020, Month.DECEMBER, 16, 10, 59);
        LocalDateTime ldt2 = LocalDateTime.of(2032, Month.FEBRUARY, 11, 3, 32,34);
        System.out.println(ldt1.isAfter(ldt2));  //Объект ldt1 был после ldt2?
        System.out.println(ldt2.isBefore(ldt1)); //Объект ldt2 был раньше объекта ldt1?

        LocalTime lt1 = LocalTime.of(12, 59,232,4324354);
        LocalTime lt2 = LocalTime.of(23, 05);
        System.out.println(lt1.isAfter(lt2));   //Объект lt1 был после ldt2?
        System.out.println(lt2.isBefore(lt1));  //Объект lt2 был раньше объекта lt1?

        LocalDate ld1 = LocalDate.of(2021, 12, 24);
        LocalDate ld2 = LocalDate.of(2022, Month.DECEMBER, 16);
        System.out.println(ld1.isAfter(ld2));   //Объект ld1 был после ld2?
        System.out.println(ld2.isBefore(ld1));  //Объект ld2 был раньше объекта ld1?


    }
}
