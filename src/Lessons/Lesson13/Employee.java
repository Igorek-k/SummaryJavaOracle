package Lessons.Lesson13;

public class Employee {
    public static void main(String[] args) {
        switch ("Wednesday") {
            case "Monday":                   // * что бы не писать одно и тоже,можно просто убрать повторяющиеся строки
                                             // * из-за свойства switch выполнять все до конца тела или до ключевого
            case "Tuesday":                  // * слова break,мы достигнем желаемого результата.

            case "Wednesday":

            case "Thursday":
                System.out.println("Work from 8:00 AM to 18:00 PM.");
                break;
            case "Friday":
                System.out.println("Work from 9:00 AM to 17:00 PM.");
                break;
            case "Saturday":
                System.out.println("Work from 10:00 AM to 15:00 PM.");
                break;
            case "Sunday":
                System.out.println("Day off.");
                break;
            default:
                System.out.println("Chek if the day of  the week is correct. ");
        }
        /* switch в своих скобках (где условие) принимает не любое значение,а именно принимает:
         * int
         * char
         * short
         * String
         * byte
         * Исключение типы данных,которые связаны с выше перечислинными типами данных.
         *
         * В выражении switch можно использовать (3*2) или (abc * 3) самое главное,что бы результат был допустимым типом
         *
         * case можно дать значение Compile time constanta ( константа созданная во время компиляции):
         * case 1; case -3.14; case -5; case "privet"; case 5*10;       --> YES <--
         * a=1; b =2; case a*b;               ------> No <------   А исправить это можно так:
         * final a =1; final b =2; case a*b;         ---> YES <--- Сделать из значений константу,ибо компилятор в другом
         * случае не будет уверен,что эти значения не поменяются.
         * final a; final b; a = 10; b = 15; case a*b;        -----> NO <-----
         * Значение приняты не в своем объявлении (final a; final b;), а позже: не считаются Compile time constanta!
         */
    }
}
