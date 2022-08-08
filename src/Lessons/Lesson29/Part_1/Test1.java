package Lessons.Lesson29.Part_1;

import java.util.ArrayList;

public class Test1 {
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
//
//        StudentInfo si = new StudentInfo();
//        FindStudentOverGrade fsog = new FindStudentOverGrade();
//        FindStudentUnderGrade fsug = new FindStudentUnderGrade();
//        FindStudentOverAge fsoa = new FindStudentOverAge();
//        FindStudentUnderAge fsua = new FindStudentUnderAge();
//        FindStudentBySex fsbs = new FindStudentBySex();
//        FindStudentMixCondition fsmc = new FindStudentMixCondition();
//
//
//        si.testStudent(list, fsog);
//        System.out.println("---------------------------------------------------------------");
//        si.testStudent(list, fsug);
//        System.out.println("---------------------------------------------------------------");
//        si.testStudent(list, fsoa);
//        System.out.println("---------------------------------------------------------------");
//        si.testStudent(list, fsua);
//        System.out.println("---------------------------------------------------------------");
//        si.testStudent(list, fsbs);
//        System.out.println("---------------------------------------------------------------");
//        si.testStudent(list, fsmc);
//        System.out.println("---------------------------------------------------------------");
//
//
//    }
//
//}
//
//interface StudentCheks {
//    boolean test(Student s);
//}
//
//class FindStudentOverGrade implements StudentCheks {
//    public boolean test(Student s) {
//        return s.avgGrade > 8.5;  //будет проверять avgGrade больше 8.5 или нет
//    }
//}
//
//class FindStudentUnderGrade implements StudentCheks {
//    public boolean test(Student s) {
//        return s.avgGrade < 9;
//    }
//}
//
//class FindStudentOverAge implements StudentCheks {
//    public boolean test(Student s) {
//        return s.age > 25;
//    }
//}
//
//class FindStudentUnderAge implements StudentCheks {
//    public boolean test(Student s) {
//        return s.age < 27;
//    }
//}
//
//class FindStudentBySex implements StudentCheks {
//    public boolean test(Student s) {
//        return s.sex == 'm';
//    }
//}
//
//class FindStudentMixCondition implements StudentCheks {
//    public boolean test(Student s) {
//        return (s.avgGrade > 7.2 && s.age < 23 && s.sex == 'f');
//    }
//}