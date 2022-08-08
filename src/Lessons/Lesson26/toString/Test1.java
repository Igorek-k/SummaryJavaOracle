package Lessons.Lesson26.toString;

public class Test1 {
//* Метод toString принадлежит классу Object, возвращает строковое
//представление объекта. Дефолтная реализация данного метода возвращает имя
//класса, @, число (результат метода hashcode данного объекта).
//  То есть не перезаписанным оно выводит адрес объекта, к примеру для с1 это "Lessons.Lesson26.toString.Car@4517d9a3"

    public static void main(String[] args) {
      Car c1 = new Car("Red","V6");
        Car c2 = new Car("Red","V6");
        Car c3 = new Car("Black","V8");
        System.out.println(c1);  //по дефолту в скобочках этого метода сразу добавляется метод toString
        System.out.println(c3.toString());
        //Для ArrayList метод toString уже перезаписан.
    }
}

class Car{
    String color;
    String engine;
    Car(String color, String engine){
        this.color = color;
        this.engine = engine;
    }

    public String toString(){
        return "Color this car: " + color + "; Engine this car: " + engine;
    }


}
