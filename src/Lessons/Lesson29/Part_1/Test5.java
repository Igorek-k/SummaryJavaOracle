package Lessons.Lesson29.Part_1;

import java.util.ArrayList;
import java.util.function.*;

public class Test5 {
//              *** interface Predicate<T> ***
//* Лямбда выражения работают с интерфейсом, в котором есть только 1 абстрактный метод,но дефолтных и статических
// может быть много. Такие интерфейсы называются функциональными интерфейсами, т.е. интерфейсами,
// пригодными для функционального программирования.

//public interface Predicate<T> {
//boolean test(T t);
//}

//* Интерфейс Predicate<T> находится в java.util.function
//* Метод класса ArrayList removeIf использует в параметре Predicate<T>.
}

class Student {
    String name;
    int course;
    int age;
    char sex;
    double avgGrade;

    Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

}

class StudentInfo {
    void printStudent(Student st) {
        System.out.println("Name of student: " + st.name + ". Sex of student: " + st.sex + ". Age of student: " +
                st.age + ". Course of student: " + st.course + ". Average grade of student: " + st.avgGrade);

    }

    void testStudent(ArrayList<Student> aL, Predicate<Student> t) {
        for (Student s : aL) {
            if (t.test(s)) {
                printStudent(s);
            }
        }
    }


    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);

        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        StudentInfo si = new StudentInfo();

        for (Student s : list) {
            System.out.println(s.name);
        }
        System.out.println("----------------------------------------------");

        list.removeIf(x->x.name.endsWith("a"));  //удали, если это true
        for (Student s : list) {
            System.out.println(s.name);
        }

        si.testStudent(list, (Student st) -> {return st.avgGrade > 8.5;});
        System.out.println("---------------------------------------------------------------");
        si.testStudent(list, st -> st.avgGrade < 9); //самый короткий способ лямбды выражения
        System.out.println("---------------------------------------------------------------");
        si.testStudent(list, (st) -> st.avgGrade < 9);
        System.out.println("---------------------------------------------------------------");
        si.testStudent(list, st -> {int z = 5; return st.age < 27;});
        System.out.println("---------------------------------------------------------------");
        si.testStudent(list, (Student st) -> st.avgGrade < 9);
        System.out.println("---------------------------------------------------------------");
        si.testStudent(list, (Student st) -> {return st.avgGrade > 7.2 && st.age < 23 && st.sex == 'f';});
        System.out.println("---------------------------------------------------------------");


    }

}



