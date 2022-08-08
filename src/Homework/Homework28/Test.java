package Homework.Homework28;

import java.time.*;
import java.time.format.*;


public class Test {

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("Y, MMMM-dd !! hh:mm");
    DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/YY");

    public void smena(LocalDateTime ldt, LocalDateTime ldt1, Period p, Duration d) {
        while (ldt.isBefore(ldt1)) {
            int i = 1;
            while (ldt.isBefore(ldt1)) {
                System.out.println(i + " - повторение цикла: ");
                System.out.print("Работаем с: " + ldt.format(dtf));
                ldt = ldt.plus(p);
                System.out.print("    До: " + ldt.format(dtf));
                System.out.println();

                System.out.print("Отдыхаем с: " + ldt.format(dtf2));
                ldt.plus(d);
                System.out.print("    До: " + ldt.format(dtf2));
                System.out.println();
                System.out.println("-------------------------------------------------------");
                i++;
            }
        }
    }

    public static void main(String[] args) {
        LocalDateTime lt = LocalDateTime.of(2022, Month.AUGUST, 1, 7, 0);
        LocalDateTime lt2 = LocalDateTime.of(2022, Month.AUGUST, 31, 22, 0);
        Period p = Period.ofWeeks(1);
        Duration d = Duration.ofHours(10);

        Test t = new Test();
        t.smena(lt, lt2, p, d);
    }

}
