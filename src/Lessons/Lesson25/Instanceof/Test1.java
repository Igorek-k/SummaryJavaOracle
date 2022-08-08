package Lessons.Lesson25.Instanceof;

public class Test1 {
//*                 Оператор instanceof

//     Car c = new Car();
//     System.out.print(c instanceof Object);

    //* Оператор instanceof проверяет, есть ли между объектом и классом/интерфейсом связь IS-A. Если связь IS-A невозможна,
// то компилятор выдаёт ошибку.
    public static void main(String[] args) {
        Employee emp1 = new Teacher();
        Employee emp2 = new Doctor();
        Employee emp3 = new Driver();

        System.out.println(emp1 instanceof Teacher); //Объект на который ссылается emp1 это Teacher? TRUE
        System.out.println(emp1 instanceof Driver); //Объект на который ссылается emp1 это Driver? FALSE

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



