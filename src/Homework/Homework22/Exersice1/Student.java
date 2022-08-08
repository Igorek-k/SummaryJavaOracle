package Homework.Homework22.Exersice1;


public class Student {
    private StringBuilder name;

    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }

    public void setName(StringBuilder sb) {
        if (sb.length() >= 3) {
            name = sb;
        } else {
            System.out.println("Please, check your name. Name doesn't correctly.");
        }
    }

    private int course;

    public int getCourse() {
        return course;
    }

    public void setCourse(int i) {
        if (i > 0 && i < 5) {
            course = i;
        } else {
            System.out.println("Please, check your course. Course doesn't correctly.");
        }
    }

    private double grade;

    public double getGrade() {
        return grade;
    }

    public void setGrade(double i) {
        if (i > 0 && i <= 10) {
            grade = i;
        } else {
            System.out.println("Please, check your grade. Grade doesn't correctly.");
        }
    }

    public void showInfo() {
        System.out.println("Name this student: " + getName() + ". His course: " + getCourse() +
                ". He has grade: " + getGrade() + ".");
    }
}

class TestStudent {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName(new StringBuilder("Igorek"));
        s.setCourse(4);
        s.setGrade(9.8);

        s.showInfo();

    }

}
