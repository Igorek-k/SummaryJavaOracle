package Lessons.Lesson28.Methods_Data_Time;

import java.time.*;

public class Test2 {
//* Методы для получения информации из классов:

    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2023, Month.SEPTEMBER, 1);
        LocalDateTime ldt = LocalDateTime.of(2023, Month.SEPTEMBER, 1, 16, 40,23,32);
        LocalTime lt = LocalTime.of(16, 40,32,12);
//* Получение информации из класса LocalDate

//  getDayOfWeek() --> DayOfWeek
        System.out.println(ld.getDayOfWeek());   //Output: FRIDAY
//  getDayOfMonth() --> int
        System.out.println(ld.getDayOfMonth());  //Output: 1
//getDayOfYear() --> int
        System.out.println(ld.getDayOfYear());   //Output: 244 | 244 - день года
//getMonth() --> Month
        System.out.println(ld.getMonth());   //Output: SEPTEMBER
//getMonthValue() --> int
        System.out.println(ld.getMonthValue());   //Output: 9
//getYear() --> int
        System.out.println(ld.getYear());   //Output: 2023

//Получение информации из класса LocalTime
//getNano() --> int
        System.out.println(lt.getNano());  //Output: 12
//getSecond() --> int
        System.out.println(lt.getSecond()); //Output: 32
//getMinute() --> int
        System.out.println(lt.getMinute()); //Output: 40
//getHour() --> int
        System.out.println(lt.getHour());  //Output: 16

//* Получение информации из класса LocalDateTime.
// Данный класс включает в себя все методы из классов LocalDate и LocalTime

        System.out.println(ldt.getDayOfWeek());   //Output: FRIDAY
        System.out.println(ldt.getDayOfMonth());  //Output: 1
        System.out.println(ldt.getDayOfYear());   //Output: 244 | 244 - день года
        System.out.println(ldt.getMonth());   //Output: SEPTEMBER
        System.out.println(ldt.getMonthValue());   //Output: 9
        System.out.println(ldt.getYear());   //Output: 2023

        System.out.println(lt.getNano());  //Output: 12
        System.out.println(lt.getSecond()); //Output: 32
        System.out.println(lt.getMinute()); //Output: 40
        System.out.println(lt.getHour());  //Output: 16
    }
}
