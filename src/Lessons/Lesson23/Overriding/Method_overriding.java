package Lessons.Lesson23.Overriding;

public class Method_overriding {
//Method overriding (метод перезаписанный) - это изменение non-static, non-final метода в sub
    //классе, который он унаследовал от parent класса.

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.eat(); //вызывается перезаписанный метод, был перезаписан в классе Teacher
        Employee emp11 = new Employee();
        emp11.eat(); //вызывается стоковый метод, написанный в Employee

        Employee emp12 = new Teacher();
        emp12.eats(); //вызывается перезаписанный метод, был перезаписан в классе Teacher1 т.к. этот метод принадлежит
        //объекту Teacher.
    }

//Методы считаются overridden, если:
//  *Имя в sub классе такое же, что и в parent классе;

//  *Список аргументов в sub классе такой же, что и в parent классе;

//  *Return type в sub классе такой же, что и в parent классе или же
//     return type в sub классе - это sub класс return type из parent класса (covariant return types);

//  *Access modifier в sub классе такой же или менее строгий, чем в parent классе;

//  *Метод в sub классе тоже должен быть non-static;

//  ***Понятия variable overriding не существует***
}

class Eda {
}

class Fruit extends Eda {
}

class Employee {
    double salary = 100;
    String name;
    int age;
    int experience;

    Eda eats() {
        System.out.println("Kushaet Employee");
        Eda e = new Eda();
        return e;
    }

    void eat() {
        System.out.println("Kushaet rabotnik");
    }

    void sleep() {
        System.out.println("Spat");
    }
}

class Teacher extends Employee {

    Fruit eats() {
        System.out.println("Kushaet Teacher");
        Fruit f = new Fruit();
        return f;  //у overriding методов return должен быть либо такой же как и return метода из super класса или же
         // быть его саб-классом
    }
//Но для притивных типов данных в таких же случаях можно использовать только одинаковые типы данных.
    void eat() {
        System.out.println("Kushaet uchitel");  //Мы можем перезаписывать метод, который уже унаследован от super класса
    } //И вызывая его через объект, в котором он был создан, мы вызываем уже перезаписанный метод

    int kolichesctvoUchenikov;

    void teach() {
        System.out.println("uchit");
    }

}
