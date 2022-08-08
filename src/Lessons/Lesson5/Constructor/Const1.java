package Lessons.Lesson5.Constructor;

public class Const1 {
    Const1(String cvet, String motor){
        color1=cvet;
        engine1=motor;
        System.out.println("Цвет машины: "+color1+"Мотор машины: "+engine1); //из-за этой строки на экран будет выводиться
        //то ,что мы задали, когда создадим конструктор!
    }

    String color1;
    String engine1;
}

class test2{
    public static void main(String[] args) {
        Const1 gfg = new Const1("white ","V5"); //при написании этого конструктора компилятор смотрит есть ли
        // параметры (в данном случае white,v5) и что делает тело: в нашем случае выводит на экран наши аргументы.
        System.out.println(gfg.color1 + gfg.engine1);

    }
}

/* Различия метода и конструктора:
метод: всегда имеет return type( если это не void) , можно придумать неограниченное кол-во имен.
Конструктор: никогда не имеет return type, его имя ограниченно именем класса.
 */
