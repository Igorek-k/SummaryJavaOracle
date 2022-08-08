package Lessons.Lesson6;

public class OverloadingConstructor_This {
    OverloadingConstructor_This(int id2, String surname2, int age2) {

        id = id2;
        surname = surname2;
        age = age2;
    }
    OverloadingConstructor_This(String surname2, int age2){
        surname = surname2;
        age = age2;
    }
    OverloadingConstructor_This(int id2, String surname2, int age2, double salary2,String depatment2) {

        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department=depatment2;
    }

    int id;
    String surname;
    int age;
    double salary;
    String department;
}


class OverloadingConstructorTest {
    public static void main(String[] args) {
        OverloadingConstructor_This oc = new OverloadingConstructor_This(1, "Inak", 28);
        System.out.println(oc.surname); // Inak

        OverloadingConstructor_This oc1 = new OverloadingConstructor_This("Ivanov",31);
        System.out.println(oc1.department); //null

        OverloadingConstructor_This oc2 = new OverloadingConstructor_This(2,"Novik",19,41.56,"IT");
        System.out.println(oc2.department); // IT
    } //если случайно допустить ошибку и перепутать местами параметры (int with double,тд) или не доуказать один
    //компилятор либо не найдет конструктор и даст ошибку,либо использует другой( если такой конструктор существует)
}

//правило: в конструкторе нельзя вызывать конструктор Overloading по его имени:
/*
OverloadingConstructor(int id2, String surname2, int age2) {
        OverloadingConstructor(String surname2, int age2);
        id=id2;
    }
    OverloadingConstructor(String surname2, int age2){
            surname = surname2;
            age = age2;
    }
*/
//Но что бы внутри конструктора вызвать его же Overloading нужно использовать слово "this":
//Первый способ:
class Employee {
    Employee(int id8, String surname8, int age8) {
        this(surname8,age8); // всегда идет первой в теле.
        idd = id8;
    }

    Employee(String surname9, int age9) {
        surnamee = surname9;
        agee = age9;
    }
    Employee(int id10, String surname10, int age10, double salary10,String depatment10) {
        this(id10,surname10,age10); // всегда идет первой в теле.
        salaryy = salary10;
        departmentt=depatment10;
    }

    int idd;
    String surnamee;
    int agee;
    double salaryy;
    String departmentt;
}
class EmployeeTest {
    public static void main(String[] args) {
        Employee emt = new Employee(1, "Inak", 28);
        System.out.println(emt.surnamee);

        Employee emt2 = new Employee("Ivanov", 31);
        System.out.println(emt2.departmentt);

        Employee emt3 = new Employee(2, "Novik", 19, 41.56, "IT");
        System.out.println(emt3.departmentt);
    }
}
// К примеру что бы постоянно не писать одну и туже повторяющиюся часть кода,мы можем внутри конструктора с
//помощью "this" и перечеслением параметров продублировать наш код,как в примере выше. В нашем примере мы
// с помощью такого способа продублировали surnamee = surname9; agee = age9; и дописали только недостоющийся элемент
// idd.Когда код большой этот метод очень выручает.
// Что бы понять какой именно из существующих Overloading конструкторов подставить , Java смотрит на кол-во параметров и
// их типы.
//This всегда должно идти первым statment (выражением) в теле.

//ВТОРОЙ СПОСОБ (более правильный и удобный):

class Employee1 {
    Employee1(int id8, String surname8, int age8) {
        this(id8,surname8,age8,0.0,null);
    }

    Employee1(String surname9, int age9) {
        this(0,surname9,age9,0.0,null);
    }
    Employee1(int id10, String surname10, int age10, double salary10,String depatment10) {
        idd=id10;
        surnamee = surname10;
        agee=age10;
        salaryy=salary10;
        departmentt=depatment10;
    }

    int idd;
    String surnamee;
    int agee;
    double salaryy;
    String departmentt;
}
class EmployeeTest1 {
    public static void main(String[] args) {
        Employee1 emt1 = new Employee1(1, "Inak", 28);
        System.out.println(emt1.surnamee);

        Employee emt2 = new Employee("Ivanov", 31);
        System.out.println(emt2.departmentt);

        Employee emt3 = new Employee(2, "Novik", 19, 41.56, "IT");
        System.out.println(emt3.departmentt);
    }
}
//Мы используем наиболее большой конструктор с самым большими параметрами и вызываем с помощью "this" его в другом
//конструкторе. Те параметры,которых нет в нужном нам конструкторе( тот констр. где вызываем "this") пишем defoult
//значения. int = 0, double= 0.0,String = null и тд. Пример выше.