package Lessons.Lesson23.Binding;

public class Binding_Test2 {
    public static void main(String[] args) {
        Employee emp = new Employee();
//        emp.sleep();  метод не виден из-за его access-modifier private
        Teacher t = new Teacher();
        t.sleep(); // тут все в порядке, т.к. его access-modifier protected
        Employee empt = new Teacher();
//        empt.sleep();  //Из-за того что этот метод для класса Employee -private- он не наследуется классом Teacher

        emp.eats();  //Вызывается метод так, как записан в классе Employee
        t.eats();    //Вызывается метод так, как записан в классе Teacher
        empt.eats(); //Вызывается метод так, как записан в классе Employee из-за того, что объект Teacher ссылается
        //на тип данных Employee, где этот метод static

        System.out.println(emp.salary);
        System.out.println(t.salary); //Variable hiding
        System.out.println(empt.salary); //То же правило, что и со статическим методом
    }
}

class Eda {
}

class Fruit extends Eda {
}


class Employee {
    static double salary = 100;
    String name = "Kolya";

    static void eats() {
        System.out.println("Kushaet Employee");

    }

    private void sleep() {
        System.out.println("Спит работник");
    }
}


class Teacher extends Employee {
    static String salary = "dvesti"; //Variable hiding – объявление в sub классе переменной с таким же
    //именем (не обязательно типом), что и в parent классе.
    int name = 5;   //Variable hiding
    static void eats() {                         //static метод наследуется без проблем, но при вызове этого метода
        System.out.println("Kushaet Teacher"); //когда объект Teacher будет ссылаться на тип данных Employee
    }  //не будет никакого Run time binding и выводиться будет метод ровно так как записан в классе Employee

    //  ***В данном примере реализован метод hiding - этот метод перекрыт по определённым правилам другим методом***


    int kolichesctvoUchenikov;


    protected void sleep() {   //Этот метод не перезаписан, т.к sleep в Employee - private - и он не виден в классе
        System.out.println("Спит учитель ");                //Teacher. Это просто созданый метод в классе Teacher.
    }
}
// Method hiding - это перекрытие static методов из parent класса в sub классе.
//                     Методы считаются hidden, если:
// *Имя в sub классе такое же, что и в parent классе;
// *Список аргументов в sub классе такой же, что и в parent классе;
// *Return type в sub классе такой же, что и в parent классе или же
//   return type в sub классе - это sub класс return type из parent класса (covariant return types);
// *Access modifier в sub классе такой же или менее строгий, чем в parent классе;
// *Если в parent классе метод является static, то и в sub классе он должен быть static.

//Variable hiding – объявление в sub классе переменной с таким же именем (не обязательно типом), что и в parent классе.


//                         Что можно делать override:
// Все методы, которые не являются static, final или private.

//                           Что можно делать hide:
//               static методы          и         Non-private variables


