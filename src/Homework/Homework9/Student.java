package Homework.Homework9;

public class Student {


    static int a = 7;
    static double b = 8;
    static String l = "Nab";
    static short h = 4;
    static byte u = 120;
    static long hg = 34443l;
    char j = 'a';
    float y = 43.4f;

    public static void ShowInfo() {
        System.out.println(a + "_" + b + "_" + l + "_" + h + "_" + u + "_" + hg);
    }

    public static void main(String[] args) {
        Student st = new Student();
        st.a = 0;
        st.b = 0;
        st.l = null;
        st = null;
        Student st2 = new Student();
        st2.h = 0;
        st2.u = 0;
        st2.hg = 0;
        System.out.println(st2.j + " " + st2.y);
        st2.ShowInfo();
    }
}
//Более удобное и правильное выполнение дз:

class StudentTest{

    public static void abcd(){
        String st = new String("ABC");
        String st2 = new String("DEF");
    }

    public static void main(String[] args) {
        StudentTest r = new StudentTest(); // выжил этот объект
        abcd();
        abcd();
        StudentTest t = new StudentTest(); // и этот
        abcd();
        //остальные скончались.
    }
}
