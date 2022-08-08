package Lessons.Lesson28.Classes;

import java.time.*;
import java.time.format.*;

public class Test2 {
//* Класс DateTimeFormatter
//Данный класс находится в пакете java.time.format

    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2020, Month.SEPTEMBER, 1);
        LocalDateTime ldt = LocalDateTime.of(2020, Month.SEPTEMBER, 1, 16, 40, 23, 32);
        LocalTime lt = LocalTime.of(16, 40, 32, 12);

//* С помощью метода format вы можете изменять вывод вашей даты или вашего времени на экран.
        DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_DATE;
        DateTimeFormatter dtf1 = DateTimeFormatter.ISO_LOCAL_TIME;
        DateTimeFormatter dtf2 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

        System.out.println(ld.format(dtf));
        System.out.println(lt.format(dtf1));
        System.out.println(ldt.format(dtf2));


        LocalDate ld1 = LocalDate.of(2020, Month.SEPTEMBER, 1);
        LocalDateTime ldt1 = LocalDateTime.of(2020, Month.SEPTEMBER, 1, 16, 40, 23, 32);
        LocalTime lt1 = LocalTime.of(16, 40, 32, 12);
//  SHORT
        DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        //с помощью статического метода ofLocalizedDate() создаем объект DateTimeFormatter
        //с помощью FormatStyle вызываем его константу SHORT
        DateTimeFormatter shortFormat1 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        DateTimeFormatter shortFormat2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

        System.out.println(ld1.format(shortFormat));  //Output: 9/1/20
        System.out.println(lt1.format(shortFormat1));  //Output: 4:40 PM
        System.out.println(ldt1.format(shortFormat2)); //Output: 9/1/20, 4:40 PM
//MEDIUM
        DateTimeFormatter MediumFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        //с помощью статического метода ofLocalizedDate() создаем объект DateTimeFormatter
        //с помощью FormatStyle вызываем его константу MEDIUM
        DateTimeFormatter MediumFormat1 = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
        DateTimeFormatter MediumFormat2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

        System.out.println(ld1.format(MediumFormat));  //Output: Sep 1, 2020
        System.out.println(lt1.format(MediumFormat1));  //Output: 4:40:32 PM
        System.out.println(ldt1.format(MediumFormat2)); //Output: Sep 1, 2020, 4:40:23 PM
//LONG
        LocalDate ldL = LocalDate.of(2020, Month.SEPTEMBER, 1);
        LocalDateTime ldtL = LocalDateTime.of(2020, Month.SEPTEMBER, 1, 16, 40);
        LocalTime ltL = LocalTime.of(10, 40);

        DateTimeFormatter longFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        //с помощью статического метода ofLocalizedDate() создаем объект DateTimeFormatter
        //с помощью FormatStyle вызываем его константу LONG
        DateTimeFormatter longFormat1 = DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG);
        DateTimeFormatter longFormat2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);

        System.out.println(ldL.format(longFormat));
        System.out.println(ltL.format(longFormat1));
        System.out.println(ldtL.format(longFormat2));
//FUll
        LocalDate ldF = LocalDate.of(2020, Month.SEPTEMBER, 1);
        LocalDateTime ldtF = LocalDateTime.of(2020, Month.SEPTEMBER, 1, 16, 40);
        LocalTime ltF = LocalTime.of(16, 40);

        DateTimeFormatter fullFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        //с помощью статического метода ofLocalizedDate() создаем объект DateTimeFormatter
        //с помощью FormatStyle вызываем его константу FULL
        DateTimeFormatter fullFormat1 = DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL);
        DateTimeFormatter fullFormat2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);

        System.out.println(ldF.format(fullFormat));
        System.out.println(ltF.format(fullFormat1));
        System.out.println(ldtF.format(fullFormat2));

//* Методы класса DateTimeFormatter ofLocalizedDate, ofLocalizedTime и ofLocalizedDateTime должны создавать формат,
//  который будет применяться для соответствующих классов.

//* Метод format имеется не только у объектов классов LocalDate, LocalTime LocalDateTime, но и у класса
// DateTimeFormatter, что делает возможным написание последнего выражения в следующем виде:

//DateTimeFormatter f2 =DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
//System.out.println(f2.format(ldt));
        // или
//DateTimeFormatter f2 =DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
//System.out.println(ldt.format(f2));

//И эти 2 выражения имеют один и тот же результат.


    }
}
