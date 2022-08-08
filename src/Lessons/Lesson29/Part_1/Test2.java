package Lessons.Lesson29.Part_1;

import java.util.ArrayList;

public class Test2 {
//                        *** Lambda expressions ***
//* Самый короткий вариант написания лямбда выражения:
//stud -> stud.avgGrade > 8.5

//* Более полный вариант написания лямбда выражения:
//(Student stud) -> {return stud.avgGrade > 8.5;}

//* В лямбда выражении оператор стрелка разделяет параметры метода и тело метода.

//* В лямбда выражении справа от оператора стрелка находится тело метода, которое было бы у метода соответствующего
// класса, имплементировавшего наш интерфейс с единственным методом.

//* Вы можете использовать смешанный вариант написания лямбда выражения: слева от оператора стрелка писать
// короткий вариант, справа – полный. Или наоборот.

//* Если вы используете полный вариант написания для части лямбда выражения справа от стрелки, то вы должны
// использовать слово return и знак «;»

//* Левая часть лямбда выражения может быть написанна в краткой форме, если метод интерфейса принимает только 1 параметр.
// Даже если метод интерфейса принимает 1 параметр, но в лямбда выражении вы хотите писать данный параметр используя
// его тип данных, тогда уже вы должны писать левую часть лямбда выражения в скобках.

//* Если в правой части лямбда выражения вы пишите более одного statement-
//а, то вы должны использовать его полный вариант написания.
}

//class Student {
//    String name;
//    int course;
//    int age;
//    char sex;
//    double avgGrade;
//
//    Student(String name, char sex, int age, int course, double avgGrade) {
//        this.name = name;
//        this.sex = sex;
//        this.age = age;
//        this.course = course;
//        this.avgGrade = avgGrade;
//    }
//
//}
//
//class StudentInfo {
//    void printStudent(Student st) {
//        System.out.println("Name of student: " + st.name + ". Sex of student: " + st.sex + ". Age of student: " +
//                st.age + ". Course of student: " + st.course + ". Average grade of student: " + st.avgGrade);
//
//    }
//
//    void testStudent(ArrayList<Student> aL, StudentCheks sc) {
//        for (Student s : aL) {
//            if (sc.test(s)) {
//                printStudent(s);
//            }
//        }
//    }
//
//
//    public static void main(String[] args) {
//        ArrayList<Student> list = new ArrayList<>();
//        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
//        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
//        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
//        Student st4 = new Student("Petr", 'm', 35, 4, 7);
//        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);
//
//        list.add(st1);
//        list.add(st2);
//        list.add(st3);
//        list.add(st4);
//        list.add(st5);
//        StudentInfo si = new StudentInfo();
//
//
////* Лямбда выражения позволяет использовать только интерфейс содержащий в себе один метод.
//
//        si.testStudent(list, (Student st) -> {return st.avgGrade > 8.5;});
//        System.out.println("---------------------------------------------------------------");
//        si.testStudent(list, st -> st.avgGrade < 9); //самый короткий способ лямбды выражения
//        System.out.println("---------------------------------------------------------------");
//        si.testStudent(list, (st) -> st.avgGrade < 9);
//        System.out.println("---------------------------------------------------------------");
//        si.testStudent(list, st -> {int z = 5; return st.age < 27;});
//        System.out.println("---------------------------------------------------------------");
//        si.testStudent(list, (Student st) -> st.avgGrade < 9);
//        System.out.println("---------------------------------------------------------------");
//        si.testStudent(list, (Student st) -> {return st.avgGrade > 7.2 && st.age < 23 && st.sex == 'f';});
//        System.out.println("---------------------------------------------------------------");
//
//
//    }
//
//}
//
//interface StudentCheks {
//    // Интерфейс, который имеет в своем теле всего 1 метод называется - функциональным интерфейсом.
//    boolean test(Student s);
//
//}

