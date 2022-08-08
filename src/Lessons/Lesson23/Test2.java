package Lessons.Lesson23;

public class Test2 {
    public Object obc() {
        return new String("trbdfh");   //По скольку Object прародитель всех классов
    }                                     //то в его return можно указывать абсолютно любой референс объект

    public Object obc1() {         //Любой Object это Doctor, но не любой Doctor это Object
        return new Doctor();
    }

    public Object obc2() {
        return new int[]{1, 2, 5, 8, 5}; //массив тоже объект, а любой объект является child классом класса Object
    }

    //Doctor, Teacher, Driver являются так же Employee из-за наследования.
    public static void main(String[] args) {
        Doctor d = new Doctor();         //И мы можем спокойно создавать их объекты
        Teacher t = new Teacher();
        Driver dr = new Driver();
        Employee e = new Employee();

        Employee emp1 = new Doctor(); //переменная Employee может ссылаться на объект subclass - a
        //То есть: референс переменная emp1 типа Employee может ссылаться на объект типа Doctor.
        System.out.println(emp1.salary);
        System.out.println(emp1.name);
        System.out.println(emp1.age);
        System.out.println(emp1.experience);
        emp1.eat();
        emp1.sleep();
//      emp1.lechit();  //Компилятор не может найти метод lechit у Employee emp1. Компилятор всегда смотрит на тип данных
            //переменной.
        //Если переменная типа данных super класса ссылается на объект sub класса, то с
        //помощью этой переменной можно вызывать только унаследованные от super класса элементы.

        Employee emp2 = new Teacher();  //учитель это работник
        Employee emp3 = new Driver(); //driver это тоже Employee

        //Но наоборот писать нельзя:`
//        Driver dr = new Employee();

//  ***     Переменная super класса может ссылаться на любой объект sub - класса!!!                                  ***

        Hirurg h = new Hirurg();
        Doctor d2 = new Hirurg();   //Hirurg саб-класс Doctor, который в свою очередь саб-класс Employee
        Employee emp4 = new Hirurg();  //То есть Hirurg тоже саб-класс Employee
    }
}

class Employee {
    double salary = 100;
    String name;
    int age;
    int experience;

    void eat() {
        System.out.println("Kushat");
    }

    void sleep() {
        System.out.println("Spat");
    }
}


class Doctor extends Employee {
    String specializacia;

    void lechit() {
        System.out.println("lechit");
    }
}

class Hirurg extends Doctor {  //У саб-классов могут быть свои саб-классы
    String skalpel;

    void operacia() {
        System.out.println("Operacia");
    }
}


class Teacher extends Employee {
    int kolichesctvoUchenikov;

    void teach() {
        System.out.println("uchit");
    }

}


class Driver extends Employee {
    String CarName;

    void drive() {
        System.out.println("Vodit");
    }
}

