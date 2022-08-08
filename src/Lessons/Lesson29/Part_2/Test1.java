package Lessons.Lesson29.Part_2;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class Test1 {
// Consumer (потребитель) & Supplier (поставщик)

    public static ArrayList<Car> CreateThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> al = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            al.add(carSupplier.get());
        }
        return al;
    } //этот метод создает три объекта типа Car

    public static void ChangeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }


    public static void main(String[] args) {
        ArrayList<Car> ourCars = CreateThreeCars(() -> new Car("BMW", "white -black", 2.1));
        System.out.println("Our cars: " + ourCars);
//   Первый способ
        ChangeCar(ourCars.get(0), car -> {
            car.color = "red";
            car.engine = 2.6;
            System.out.println("update Car: " + car);
        });

//   Второй способ  - функциональность одна и та же
        Consumer<Car> consumer = car -> {
            car.color = "Yellow";
            car.engine = 3.1;
            System.out.println("update Car: " + car);
        };
        consumer.accept(ourCars.get(2));

        System.out.println("Our cars: " + ourCars);
    }
}


class Car {
    String model;
    String color;
    double engine;

    Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    public String toString() {
        return "Our car is: " + model + ", color is: " + color + ", engine is: " + engine;
    }


}
