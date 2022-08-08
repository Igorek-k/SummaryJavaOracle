package Homework.Homework11;

public class Car {
    String color;
    String engine;
   static int howDoor;
    Car(String color, String engine){
        this.color = color;
        this.engine = engine;
    }
}
class CarTest{
   static int How(int howDoor){
        Car.howDoor = howDoor;
        return Car.howDoor;
    }
/* вот такой метод написал Заур:
    void ChangeDoorCount(Car c, int howDoor){
    c.howDoor = howDoor;
    }
 */
    static void swap(Car c, Car c2) {
     Car c3 = new Car("yellow","V5");
     c3.color = c.color;
     c.color = c2.color;
     c2.color = c3.color;
    }

    public static void main(String[] args) {
//   CarTest ct = new CarTest();        он вызвал конструктор этого класса
       Car c = new Car("red","v6");
        Car c2 = new Car("black","v12");
        How(4);
        System.out.println(c.howDoor);

        swap(c,c2);
        System.out.println(c.color + c.engine);
        System.out.println(c2.color+ c2.engine);
 /*  И вот так он его вызвал:
      ct.ChangeDoorCount(c,3);
  */

    }
}
