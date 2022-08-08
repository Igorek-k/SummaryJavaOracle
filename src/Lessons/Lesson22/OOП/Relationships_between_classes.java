package Lessons.Lesson22.OOП;

public class Relationships_between_classes {
    //Отношения между классами:

// *   “Is-a” relationship
//
//    class Animal {  }
//    class Mouse extends Animal {  }
//        Mouse is Animal
//

// *    “Has-a” relationship
//
//    class Window {   }
//    class House {
//        Window w = new Window(); }
//    House has Window


//    Класс Object является прародителем всех классов в
//    Java. Это единственный класс, у которого нет
//    родителя.
}

class Human {
    protected String name = "Kolya";
    protected static int salary = 150;

    protected void work() {
        System.out.println("Rabotat");
    }

    protected static void rest() {
        System.out.println("Otdihat");
    }
//protected - Элементы с access modifier protected видны там же,
//   где и элементы с access modifier default + в subclass-ах parent класса.
//   Таким образом, элементы с access modifier protected наследуются вне
//   зависимости от того, где находится child класс.
}

class Student extends Human {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(s.salary);

        s.work();
        s.rest();

    }
}
