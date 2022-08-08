package Lessons.Lesson16;

import java.util.Locale;

public class Array {
    //Массив (Array) - это объект, имеющий коллекцию каких-то значений.

    //Методы String. Методы String не изменяют массив String.
    public static void main(String[] args) {
        String s1 = new String("Hello");

//  *      1 Method:
        // length() --> int;
        System.out.println("Start method: length");
        int a = s1.length(); //данный метод выдает длину объекта s1.
        System.out.println(a);  //или можно было сделать так:
        System.out.println(s1.length()); //никакой разницы нет.

        System.out.println();

//  *      2 Method:
        //charAt(int index) --> char;
        System.out.println("Start method: charAt");
        char c1 = s1.charAt(3); //данный метод,показывает какой char на нужном нам индексе. Отчёт индексов начинается
        //с 0! H =0,e =1 ,l=2,l=3,o=4.
        System.out.println(c1); //char под третьем индексем в этом случае "l"

        System.out.println();

//  *      3 Method:
        //indexOf(char c/String s) --> int;
        System.out.println("Start method: indexOf(char/String)");
        int i1 = s1.indexOf('e'); //суть как в предыдущем методе, только с точностью наоборот. Показывает на каком индексе
        //запрашиваемый нами char.
        System.out.println(i1);


        int i2 = s1.indexOf("Hel"); // можно писать и стрингом по 1 символу,а можно несколько сразу. Тогда джава ищет
        //совпадение. Результат вывода : с какого индекса начинается запрашиваемый нами String,то и будет результатом.
        System.out.println(i2); //Hel - H -начинается с 0. Результат "0".

        //Если указать в этом методе символ или строку ,которая не сущесвтует результат вывода будет "-1",а такого
        //индекса не существует:
        int i3 = s1.indexOf("zx");
        System.out.println(i3);

        System.out.println();

//  *      4 Method:
        //indexOf(char c/String s, int fromindex) --> int;
        System.out.println("Start method: IndexOf(char/String,Index)");
        String s2 = new String("adngftratwes");
        int i4 = s2.indexOf("a", 5); // Показать на каком индексе символ 'a', после индекса 5.
        //Таким образом,если много одинаковых символов мы можем это регулировать этим методом.
        System.out.println(i4); //"a", после индекса 5 на 7-мом месте.
        //Тоже самое можно делать и с char ( 'a' ),и так же ,если указать символ,которого нет результат : "-1":
        int i5 = s2.indexOf('y', 6);
        System.out.println(i5);

        System.out.println();

//  *      5 Method:
        //startsWith(String prefix) --> boolean;
        System.out.println("Start method: startsWith(String)");
        boolean b1 = s2.startsWith("adn"); //В этом методе можно использовать только String. Возвращает значение
        //  true/false.Метод спрашивает: объект s2 начинается с "adn"? Если да -true, нет - false.
        System.out.println(b1);

        System.out.println();

//  *      6 Method:
        //startsWith(String prefix, int from) --> boolean;
        System.out.println("Start method: startsWith(String,int)");
        boolean b2 = s2.startsWith("ftra", 4); //объект s2 начинается с "ftra" с 4-го символа?
                                                                     //возвращает true/false.
        System.out.println(b2);

        System.out.println();

//  *      7 Method:
        //endsWith(String suffix) --> boolean;
        System.out.println("Start method: endsWith");
        boolean b3 = s2.endsWith("wes"); //Все тоже самое, как в методе 5, только "заканчивается на wes?",а не
                                                                                          //начинается.
        System.out.println(b3);

        System.out.println();

//  *      8 Method:
        //substring(int beginIndex) -->String;
        System.out.println("Start method: substring(Index)");
        String s3 = s2.substring(3); //присвой String-у s3 кусочек стринга с s2,который начинается с 3-го
        System.out.println(s3);                                                                  // индекса.

        System.out.println(s2); // сам s2 ни как не изменился.

        System.out.println();

                      //НИ 1 МЕТОД ВЫЗВАННЫЙ НА String ЕГО НЕ МЕНЯЕТ! Ведь String являеться неизменяемым объектом!

//  *      9 Method:
        //substring(int beginIndex, int endIndex) -->String;
        System.out.println("Start method: substring(Index,Index)");
        String s4 = s2.substring(3, 7); //все так же как в 8 методе, только  "присвой кусок с 3 по 7".
        System.out.println(s4); //То есть начало и конец. Но сам конечный индекс включен не будет. Присвоиться с 3 по 6
                                                                                                     //включительно.
        System.out.println();

//  *     10 Method:
        //trim() --> String;
        System.out.println("Start method: trim");
        String s5 = new String("   fodfjw  eojfwkfw      ");
        String s6 = s5.trim(); //Метод без параметров. Убирает все БОКОВЫЕ пробелы,но те,что в середине не трогает.
        System.out.println(s6);  //Метод trim тоже создает новый String. Как и 9,8 методы.

        System.out.println();

//  *     11 Method:
        //replace(char oldChar, char newChar) --> String;
        //replace(String oldString, String newString) --> String;
        System.out.println("Start method: replace");
        String s7 = s1.replace('e','r'); //Метод меняет один символ на другой.
        System.out.println(s7); //Меняет 'e', на : 'r'.
        String s8 = s1.replace('i','r'); //если попытаться поменять символ ,которого не существует,
        //то на экран выйдет в данном случае ни как не изменный s1. Т.к. символ не существует,значит и менять нечего.
        System.out.println(s8);

        String s9 = s1.replace("Hel","Tty"); //Тоже самое,только можно писать не char, a String.
        System.out.println(s9); //Меняет Hel, на Tty.
        //ПАРАМЕТРЫ методов должны быть одинаковые по типам. Либо два int, либо два char.

        System.out.println();

//  *      12 Method:
        //concat(String str) --> String;
        System.out.println("Start method: concat");
        String s10 = "privet,";
        String s11 = "drug";
        System.out.println(s10.concat(s11));
        //тоже самое что и:
        System.out.println(s10 + s11);

        System.out.println();

//  *      13 Method:
        //toLowerCase() --> String;
        System.out.println("Start method: toLowerCase");
        String s12 = "PriVeT : 2!";
        String s13 = s12.toLowerCase(); // Метод делает все буквы маленькими. На другие символы (2,!,:) не распространяется.
        System.out.println(s13);

        System.out.println();

//  *      14 Method:
        //toUpperCase() --> String;
        System.out.println("Start method: toUpperCase");
        String s14 = "heLlo MY frIEnDs";
        String s15 = s14.toUpperCase();
        System.out.println(s15); //Метод делающий все буквы большими.

        System.out.println();

//  *      //15 Method:
        //contains(String str) --> boolean;
        System.out.println("Start method: contains");
        boolean b10 = s12.contains(": 2!"); //метод проверяет на содержание нужных нам символом,букв.
       // System.out.println(b10); //Содержит s12 P,:,2? Если да true, if no - false. Компилятор сдурел😅

        System.out.println();

//  *      16 Цикличный метод chaining:
        System.out.println("Start method: chaining");
        //При этом методе все методы выполняються с лева направо!
        String s16 = "Hello World";
        String s17 = "Uraaaaaaaaa";
        String s18 = s16.concat(s17).trim().replace("Uraaaaaaaaa","УРА").substring(6,10); //При
        //вызове каждого метода создаеться отдельный объект. Если бы мы вызывали каждый метод отдельно мы бы создали
        //ровно столько же объектов.
        System.out.println(s18); //result: worl
        System.out.println(s1.substring(s1.indexOf('W')));//result: World. Что бы substring сработал нам нужно узнать
        //параметры  indexOf. Иногда что бы выполнить какой-то метод нам нужно сначала узнать его параметры с помощью
        //другого метода.

        System.out.println();

        System.out.println("Start method: equals && equalsIgnoreCase");
        //Разница методов equals and equalsIgnoreCase:
        //equals сравнивает объекты : по длине строки,какие символы,большие или маленькие,знаки припенания,пробелы.
        //equalsIgnoreCase: все тоже самое,но игнорирует величену символов. Ему без разницы большая буква А или маленькая а.
        String ss = "Kak Dela?";
        String ss2 = "kak dela?";
        System.out.println(ss.equals(ss2)); //false. Буква K большая не тоже самое,что и k маленькая. Так же и D /d.
        System.out.println(ss.equalsIgnoreCase(ss2)); //true. Ему безразницы большие или прописные буквы, главное это все
        //та же буква k и d.
    }
}
class MethodsDopolnitelno{
    public static void main(String[] args) {

//  *      isBlank - выводит try/false.
        System.out.println("Start method: isBlank");
        String s1 = "privet";
        System.out.println(s1.isBlank()); //result: false.
        String s2 = "           ";
        System.out.println(s2.isBlank()); //result: true.
        /*
         * Возвращает true,когда: String состоит из симоволов: пробел,таб и подобные им символы.
         *
         * Возвращает false,когда: String состоит из кроме пдобных пробелу и таб символов есть еще какие-то другие
         * символы.
         */

        System.out.println();

//  *      isEmpty
        System.out.println("Start method: isEmpty");
        String s3 = "";
        String s4 = " ";
        System.out.println(s3); //result: true.
        System.out.println(s4); //result: false.

        System.out.println();

        /*
         * Возвращает true, когда: String полностью пустой.
         *
         * Возвращает false, когда: String состоит из абсолютно любых символов (пробелы, буквы) и не не пустой.
         */

//  *      strip метод - такой же как и trim,только лучше,а точнее распознает больше символов типа пробела и таб.
        //удаляет боковые пробелы и табы.
        System.out.println("Start method: strip");

        String s5 = "        Hi                          ";
        System.out.println(s5.trim());
        System.out.println(s5.strip());

        System.out.println();

//  *      stripLeading - удаляет только пробелы в начале,а в конце и середине не трогает.
        System.out.println("Start method: stripLeading");

        System.out.println(s5.stripLeading());

        System.out.println();

//  *      stripTrailing - удаляет пробелы в конце,а в начале и середине оставляет.
        System.out.println("Start method: stripTrailing");
        System.out.println(s5.stripTrailing());
    }
}

