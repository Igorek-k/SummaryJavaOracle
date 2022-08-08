package Lessons.Lesson2;

public class Variables {
    public static void main(String[] args) { //ссылочные переменные
        String Myst = "Hello"; // String считаеться классом и пишется только с большой буквы. Вмещает в себе текст.
        //Значения ссылочных переменных ссылаеться на класс. Переменная "s" ссылаеться на объект класса String.
        // String - класс , hello - объект, s - переменная
        String d = " ";
        String g = "Ihor";
        String t = "!";
        // объединение переменных. Что бы их объединить нужно добавить оператор "+".
        System.out.println(Myst + d + g + t); //println - добавляет разрыв строки
        System.out.println("Hello" + " " + "Ihor" + "!"); //пишет на одной строке
        //резултат не будет отличаться. Можно объединять ссылочные и примитивные переменные:
        long x = +380994301802L;
        System.out.println("My number is " + x);
    }
}

