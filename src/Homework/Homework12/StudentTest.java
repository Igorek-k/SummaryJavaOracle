package Homework.Homework12;
import Lessons.Lesson11.Student;

public class StudentTest {

    public void StudentСomparison(Student st, Student t){
        if(st.name.equals(t.name) && st.cours == t.cours && st.grade == t.grade){
      System.out.println("Student odinakovie");
        }
        else
            System.out.println("Student razyie");

        }

        public void StudentСomparisonMax(Student st, Student t) {
            boolean rt = true;

            if ( st.name.equals(t.name)){
                if (st.grade == t.grade ){
                    if(st.cours == t.cours){
                    System.out.println("Одинаковые и оценки, и курс, и имена");}
            else
                    {System.out.println("Одинаковые и оценки, и имена, разные курсы ");}}
            else
                { System.out.println("Одинаковые имена,разные оценки");}}
            else
            {System.out.println("Имена отличаються");}

        }






    public static void main(String[] args) {
        StudentTest r = new StudentTest();
     Student st = new Student("Ivan",4,2);
     Student t = new Student("Petr",3,9.9);
        r.StudentСomparisonMax(st,t);
       r.StudentСomparison(st,t);

    }
}
