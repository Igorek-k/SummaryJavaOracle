package Lessons.Lesson17;
class car{

}

public class StringBuilderrr {


    //String Builder используем тогда, когда наша программа нуждается в объекте похожим на String, но который будет
    //постоянно менять свое значение.
    //Массив String final,его нельзя изменить. А массив StringBuilder менять можно.
    public static void main(String[] args) {

        //Способы создать String Builder
        StringBuilder sb1 = new StringBuilder(); //by defolt первоначальная вместимость составляет 16 символов.
        //То есть sb1 может использовать массив,где есть 16 мест для символов. Но если нужно больше мест,то массив будет
        //растягивается.

        StringBuilder sb2 = new StringBuilder("Good Day!!!"); // для этого массива дали изначальную длину 8+16,
        // то есть 24 символа. Good day состоит из 8 символов + 16 символов by defolt. Мы подсчитали Good day с пробелом,
        // но без восклицательных знаков.


        StringBuilder sb3 = new StringBuilder(50); // capa city this object (вместимость этого объекта) 50 символов
        // Для начала. Если в процессе нужно будет больше, то создастся другой массив, но с большим объемом, в него
        //перезапишется информация из старого массива.

        StringBuilder sb4 = new StringBuilder(sb2); //Мы можем создавать StringBuilder, используя в конструкторе какой-то
        //другой StringBuilder. При этом sb4 будет ссылатьсяа не на объект sb2, а на совершенно другой объект,
        // хоть и с таким же значением, как и у sb2.

        // У  StringBuilder с классом String несколько методов абсолютно одинаково себя ведут:
//  *     length () --> int;
        System.out.println("Start method: length");

        System.out.println(sb2.length());

        System.out.println();

//  *     charAt(int index) --> char;
        System.out.println("Start method: charAt");

        System.out.println(sb2.charAt(5));

        System.out.println();

//  *     indexOf(String s) --> int;
//  *     indexOf(String s, int fromIndex) --> int;
        //В отличие от таких же методов,но у класса String в параметрах уже нельзя использовать char.
        System.out.println("Start method: indexOf");

        System.out.println(sb2.indexOf(" "));
        System.out.println(sb2.indexOf("o",2));

        System.out.println();

 // *       substring(int beginIndex) --> String;
 // *       substring(int beginIndex, int endIndex) --> String;
        System.out.println("Start method: substring");

        System.out.println(sb2.substring(4));
        String s2 = sb2.substring(5,9);
        System.out.println(s2);

        System.out.println();

        //NEW METHOD:

//  *      subsequence(int start, int end) --> CharSequence;
        System.out.println("Start method: subsequence");

        System.out.println(sb2.subSequence(5,8));
        // Работает так же как и substring,только в output у него CharSequence.
        System.out.println();

//  *  append(dataType dt) --> StringBuilder;
        System.out.println("Start method: append");
        // Этот метод меняет сам StringBuilder; Практически все методы StringBuilder меняют его.
       sb2.append(22);
        System.out.println(sb2); //данный метод изменил StringBuilder,а не просто создал копию как класс String
        sb2.append(true);
        System.out.println(sb2);
        sb2.append(sb2);
        System.out.println(sb2);
        sb2.append("Hello");
        System.out.println(sb2);
        sb2.append(new car());
        System.out.println(sb2);
        //Метод добавляет к текущему объекту то,что в параметра.
        //В параметр этого метода мы можем добавлять любой примитивный тип данных, любой объект.
        System.out.println();

//  * insert(int toIndex, dataType dt) --> StringBuilder;
        System.out.println("Start method: insert");
        StringBuilder sb5 = new StringBuilder("Hello my friend!!!");
        System.out.println(sb5.insert(5,55));
        System.out.println(sb5.insert(sb5.length(),"Hello"));
        //insert метод это более расширенный по функционалу метод append.
        System.out.println();

//  * delete(int start, int end) --> StringBuilder
        System.out.println("Start method: delete");
        //Удаляет символы начиная с определенного индекса по определенный индекс.
        StringBuilder sb6 = new StringBuilder("Hello World!!!");
        sb6.delete(3,6);
        System.out.println(sb6);

        System.out.println();

//  * deleteCharAt(int index) --> StringBuilder;
        System.out.println("Start method: deleCharAt");
        StringBuilder sb7 = new StringBuilder("Hello World!!!");
        System.out.println(sb7.deleteCharAt(6));

        System.out.println();

//  * reverse() --> StringBuilder;
        System.out.println("Start method: reverse");
        //переварачивает StringBuilder в обратную сторону
        sb7.reverse();
        System.out.println(sb7);

        System.out.println();

//  * replace(int start,int end, String s) --> StringBuilder;
        System.out.println("Start method: replace");
        //Меняет отрезок начиная с индекса - заканчивая индексом( не включительно) на String, который мы укажем
        StringBuilder sb8 = new StringBuilder("Всем привет!");
        sb8.replace(0,5,"Pete");
        System.out.println(sb8);

        System.out.println();

//  * capacity() --> int;
        System.out.println("Start method: capacity");
        //Выводит кол-во мест массива.
        System.out.println(sb8.capacity());

        System.out.println();


//  *** Существует класс StringBuffer - он очень схож с StringBuilder. Единственное отличие:
        //StringBuffer используется для многопоточных программ.
        //StringBuilder используется для не многопоточных программ.




    }
}