package Lessons.Lesson29.Part_1;

import java.util.ArrayList;

public class Test {

}
//
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
//    void printStudentsOverGrade(ArrayList<Student> al, double avgGrade) {
//        for (Student s : al) {
//            if (s.avgGrade > avgGrade) {
//                printStudent(s);
//            }
//        }
//    }
//
//    void printStudentsUnderGrade(ArrayList<Student> al, double avgGrade) {
//        for (Student s : al) {
//            if (s.avgGrade < avgGrade) {
//                printStudent(s);
//            }
//        }
//
//    }
//
//    void printStudentsOverAge(ArrayList<Student> al, int age) {
//        for (Student s : al) {
//            if (s.age > age) {
//                printStudent(s);
//            }
//        }
//
//    }
//
//    void printStudentsUnderAge(ArrayList<Student> al, int age) {
//        for (Student s : al) {
//            if (s.age < age) {
//                printStudent(s);
//            }
//        }
//
//    }
//
//    void printStudentsBySex(ArrayList<Student> al, char sex) {
//        for (Student s : al) {
//            if (s.sex == sex) {
//                printStudent(s);
//            }
//        }
//
//
//    }
//
//    void printStudentsMixConditions(ArrayList<Student> al, double avgGrade, int age, char sex) {
//        for (Student s : al) {
//            if (s.avgGrade > avgGrade && s.age < age && s.sex == sex) {
//                printStudent(s);
//            }
//        }
//
//    }
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
//
//        StudentInfo si = new StudentInfo();
//        si.printStudentsOverGrade(list, 8.5);
//        System.out.println("------------------------------------------------------------");
//        si.printStudentsUnderGrade(list,9);
//        System.out.println("------------------------------------------------------------");
//        si.printStudentsOverAge(list,23);
//        System.out.println("------------------------------------------------------------");
//        si.printStudentsUnderAge(list,27);
//        System.out.println("------------------------------------------------------------");
//        si.printStudentsBySex(list,'m');
//        System.out.println("------------------------------------------------------------");
//        si.printStudentsMixConditions(list,7.2,23,'f');
//
//    }
//
//}
