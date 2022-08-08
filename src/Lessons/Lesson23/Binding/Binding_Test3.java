package Lessons.Lesson23.Binding;

public class Binding_Test3 {
}


class Eda3 {
}

class Fruit3 extends Eda {
}


class Employee3 {
    static double salary3 = 100;
    String name3 = "Kolya";

     void eats3() {
        System.out.println("Kushaet Employee");

    }

     final void sleep3() {  //Если мы хотим,что бы метод в sub классе не могли перезаписать делаем его -final-
        System.out.println("Спит работник");
    }
}


class Teacher3 extends Employee3 {
    static String salary3 = "dvesti";
    int name3 = 5;

    @Override  //проверяет перезаписан ли метод
     void eats3() {
        System.out.println("Kushaet Teacher");
    }
//Компилятор если метод не перезаписан не позволяет вызывать annotation @Override

    int kolichesctvoUchenikov3;


//     final void sleep3() {                          * Из-за того, что в super классе данный метод final
//        System.out.println("Спит учитель ");        * Мы не можем его перезаписывать в sub классах
//    }                                               * Использовать метод можно, но не перезаписывать
}


//  ** private методы и переменные нельзя делать ни override, ни hide. **
//  ** final методы нельзя делать ни override, ни hide. **

//  * Вы можете использовать annotation @Override, когда перезаписываете метод. *

final class T{ }      //если мы хотим что бы класс не имел потомков добавляем  -final-
//class P extends T{ }

//Так же final class более производительный т.к. там только Compile time binding, а из-за отсутствия sub классов
// отсутствует и Run time binding. Ведь если нет потомков, то и методы перезаписаны быть не могут.

class R { }
final class D extends R { }
//class  F extends D{ }