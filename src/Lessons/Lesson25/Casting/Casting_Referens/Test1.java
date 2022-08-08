package Lessons.Lesson25.Casting.Casting_Referens;

public class Test1 {
//*                      Reference data types casting
//* Casting – это процесс когда вы заставляете переменную одного типа данных
//вести себя как переменная другого типа данных. Casting возможен только тогда, когда между классами/интерфейсами
//существует IS-A взаимоотношение. Делая casting, вы не меняете тип данных объекта, а заставляете его чувствовать
//себя как объект другого типа.
//* Casting из sub класса в super класс происходит автоматически - Upcasting
//* Casting из super класса в sub класс НЕ происходит автоматически - Downcasting
//* Если между классами/интерфейсами нет IS-A взаимоотношения, компилятор не допустит casting.
//* Даже если компилятор допустил casting, выскочит runtime exception, если объект, который мы делаем cast
// на самом деле не принадлежит классу, на который мы его делаем cast.

    public static void main(String[] args) {
        Help_Able h = new Doctor();
        Employee emp1 = new Doctor();  //Upcasting
        Employee emp2 = new Teacher();
        Employee emp3 = new Driver();
        Employee emp4 = new Employee();

        h.help();
        System.out.println(((Doctor) h).specializacia);   //Downcasting

        Doctor d1 = (Doctor) emp1; //Кастим что бы d1 ссылался на emp1
        //Мы замаркировали переменную emp1 под переменную типа Doctor
        System.out.println(d1.specializacia);
        d1.lechit();

        System.out.println(((Doctor) emp1).specializacia);
        ((Doctor) emp1).lechit();

//        System.out.println(((Doctor)emp2).specializacia);    Если обмануть компилятор и сказать,что emp2 ссылаеться на
//        ((Doctor)emp2).lechit();   Doctor, а не на Teacher выйдет exceptions

        Employee [] array = {emp1,emp2,emp3,emp4};
        for(Employee e : array){
            if(e instanceof Driver){  //проверяет все эллементы и останавливаеться на нужном нам Driver
                System.out.println(((Driver) e).nazvanieMashini);  //кастим ,что бы могли вывести название машины
            }     //ведь е = Employee
        }
    }

}

class Employee extends java.lang.Object {
    double salary = 100;
    String name = "Kolya";
    int age;
    int experience;

    void eat() {
        System.out.println("Kushat");
    }

    void sleep() {
        System.out.println("Spat");
    }

}

class Doctor extends Employee implements Help_Able {
    String specializacia = "Hirurg";

    public void help() {
        System.out.println("Doctor okazivaet pomosh");
    }

    void lechit() {
        System.out.println("Doctor lechit");
    }

}

class Teacher extends Employee {
    int kolichestvoUchenikov;

    void uchit() {
        System.out.println("Uchitel uchit");
    }
}

class Driver extends Employee {
    String nazvanieMashini = "Merz";

    void vodit() {
        System.out.println("Voditel vodet");
    }
}

interface Help_Able {
    void help();
}



