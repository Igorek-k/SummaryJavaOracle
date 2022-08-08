package Lessons.Lesson25.Polimorphism;

public class Test1 {
//* Дословный перевод слова «полиморфизм» - множество форм.
//   Полиморфизм – это способность объекта принимать несколько форм.
//   Объект в Java считается полиморфным, если он имеет более 1 связи IS-A.
//* Полиморфизм – это способность метода вести себя по разному в зависимости
//    от того, объект какого класса вызывает этот метод.
//* Перезаписанные методы также часто называют полиморфными.

    public static void main(String[] args) {
        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();
        emp1.work();                    //это полиморфизм один и тот же метод работает по разному
        emp2.work();
        emp3.work();

        Employee [] array = {emp1,emp2,emp3};
        for(Employee emp : array){
            emp.work();                           //классический пример полиморфизма
        }
    }
}

abstract class Employee {
    void sleep() {
        System.out.println("Employee sleep");
    }

    abstract void work();
}

class Teacher extends Employee {
    public void work() {
        System.out.println("Teacher works");
    }
}

class Driver extends Employee {
    public void work() {
        System.out.println("Driver works");
    }
}

class Doctor extends Employee {
    public void work() {
        System.out.println("Doctor works");
    }
}
