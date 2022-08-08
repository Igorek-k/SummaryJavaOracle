package Lessons.Lesson26.Equals;

public class Test1 {
//* Если вы перезаписываете метод equals, всегда используйте в его параметре тип данных Object.

//** Правильно и логично перезаписанный метод equals должен обладать следующими свойствами:
//1. Симметричность – для non-null ссылочных переменных a и b, a.equals(b) возвращает true
//тогда и только тогда, когда b.equals(a) возвращает true;
//2. Рефлексивность – для non-null ссылочной переменной a, a.equals(a) всегда должно возвращать true;
//3. Транзитивность – для non-null ссылочных переменных a, b и c, если a.equals(b) и
//b.equals(c) возвращает true, то a.equals(c) тоже должно возвращать true;
//4. Постоянство – для non-null ссылочных переменных a и b, неоднократный вызов
//a.equals(b) должен возвращать или только true, или только false;
//5. Для non-null ссылочной переменной a, a.equals(null) всегда должно возвращать false;


    public static void main(String[] args) {
        Car c1 = new Car("Red","V6");
        Car c2 = new Car("Red","V6");
        Car c3 = new Car("Black","V8");
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
    }
}

class Car{
    String color;
    String engine;
    Car(String color, String engine){
        this.color = color;
        this.engine = engine;
    }

//    Так выглядит метод equals:
//    public boolean equals(Object obj){
//       return (this == obj);
//    }

//    Но мы его перезапишем под наши нужды:Object
    public boolean equals(Object obj){   //всегда в параметре при перезаписи метода использовать Object!
        if(obj instanceof  Car){
            Car c = (Car)obj;
            return (color.equals(c.color) && engine.equals(c.engine));
        }else{
            return  false;
        }
    }
}
