package Lessons.Lesson28.Methods_Data_Time;

import  java.time.format.*;
import java.time.*;

public class Test3 {
    //* С помощью метода ofPattern вы можете создавать свой формат.
    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.of(2014, Month.MARCH, 10, 15, 20, 30, 5555);

//* Создаем свой формат
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, YYYY, hh:mm");
        System.out.println(ldt.format(f));

//  Маркировка (значения относятся к ldt):
//* Год:
//  "Y" = 2014  |  "YY" = 14  |  "YYYY" = 2014
//* Месяц:
//  "M" = 3  |  "MM" = 03  |  "MMM" = мар  |  "MMMM" = марта
//* Неделя:
//  "w" = 11  |  "ww" = 11
//* День:
//  "d" = 10  |  "dd" = 10 (если число меньше 10 будет ставиться ноль)
//* Часы:
//  "h" = 3  |  "hh" = 03
//* Минуты:
//  "m" = 20  |  "mm" = 20
//* Секунды:
//  "s" = 30  |  "ss" = 30
//* Наносекунды:
//  "n" = 5555  |  "nnnnn" = 05555

//* У объектов классов LocalDate, LocalTime, LocalDateTime нужно пытаться брать ту информацию, которую они могут
// содержать. В противном случае будет выбрасываться исключение.


//Метод parse
//Метод parse переводит String в объект классов LocalDate, LocalTime и LocalDateTime.
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date = LocalDate.parse("01 02 2015", format); //если не использовать в дефолтном виде, то нужно
        // в параметр добавлять наш формат
        System.out.println(date);
        LocalDate date1 = LocalDate.parse("2015-01-02");
        System.out.println(date1); //если мы знаем дефолт реализацию даты, можно в параметре писать без формата

//* Если ваш String объект соответствует формату даты или времени по умолчанию, то вы можете не использовать
//  2-ой параметр метода parse – шаблон. Если не соответствует или если вы не знаете форматов по умолчанию, \
//  то используйте шаблон.


    }
}
