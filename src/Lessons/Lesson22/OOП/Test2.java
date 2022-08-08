package Lessons.Lesson22.OOП;

public class Test2 {
}


class Human2 {


    Human2(String n) {
        this(n, null);
    }

    Human2(String n, String s) {
        name = n;
        surname = s;
    }

    String name;
    String surname;
}

class Student2 extends Human2{
    Student2() {
        super("Kolya");  //super обращается к конструктору предка. Даже если мы сами его не будем писать,по дефолту
    }   //джава его будет добавлять. Работает как this. Только this обращается к оверлоад констурктору,а super
    //к родителю. У родителя идет обращение к своему родителю и тд.

    public static void main(String[] args) {
        Student2 s2 = new Student2();
    }

//Keyword “super” в конструкторе
//  *Выражение super вызывает конструктор super класса, который
//    заканчивает свою работу всегда раньше конструктора child класса.

//  *Выражение super если есть, то должно стоять на 1-ой строке конструктора.

//  *Если мы сами не пишем выражение super, то компилятор дописывает его
//    сам, обращаясь к конструктору без параметров super класса.

//  *Выражения super и this не могут одновременно находиться в теле
//    конструктора.

}