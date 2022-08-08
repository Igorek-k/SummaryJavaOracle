package Lessons.Lesson16;

import java.sql.SQLOutput;

public class Car {
    String color;
    String engine;
    Car(String color, String engine){
        this.color = color;
        this.engine = engine;
    }
    public Car abc(String cvet){
        Car c10 = new Car(cvet,"v6");
        return c10;
    }

    public static void main(String[] args) {
        Car cc = new Car("red","v8");
        Car cc2 = cc.abc("white");
        System.out.println(cc.color); //он так и остался red. Все изменение,которые произошли они остались внутри cc2.
        //А с самим объектом cc никаких изменений не было.
    }
}

class Tes{
    final static Car c = new Car("red","v6"); // при создании final referense переменной, мы не можем уже
  //изменить адресс,на который переменная ссылаеться.
    public static void main(String[] args) {
//        C = new Car("yellow","v6"); //попытка изменить адрес созданием нового объекта - ошибка!
        c.color = "black"; //а вот изменить параметр внутри уже созданого объекта мы можем и final ни как не влият.
    }
}
