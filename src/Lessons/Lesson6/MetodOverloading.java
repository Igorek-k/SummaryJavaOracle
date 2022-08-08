package Lessons.Lesson6;

public class MetodOverloading {

    void show (int a, boolean t){ //подобных методов можно написать бесконечное кол-во, и что бы воспользоваться каждым
        System.out.println(a); //нужно знать название всех методов и так можно запутаться, поэтому методы
        System.out.println(t); //можно называть одним именем ,как в данном случае, и при его написании они будут
    }                              // выводить ( в нашем случае) на экран,а что они будут выводить зависит от параметра,
    void show (boolean b,int r) {    //который мы укажем.
        System.out.println(b);
        System.out.println(r);
    }
    void show (String c) {
        System.out.println(c);
    }
    void show (String f,String g){ //Но имена и параметры одинаковыми быть не могут в разных методах. К примеру у нас уже
        System.out.println(f + g); //есть метод Show(int a) другого метода с именем Show и параметром (а) быть не может.
    }//компилятор ищет наш метод по его имени и параметру,и если будет два метода с одним именем и параметром
} //компилятор выдаст ошибку. Но если создать рядом еще один параметр show (boolean b,int r), то компилятор без труда
//его найдет и все будет хорошо. Можно даже просто типы поменять местами: show (boolean b,int r) и show (int a, boolean t)

class MetodOverloadingTest {
    public static void main(String[] args) {
        //Overloading (перегрузка) - это метод создания других методов с одинаковым именем,но разными параметрами!!
        MetodOverloading mO = new MetodOverloading();
        int a = 50;
        mO.show(a, false);

        mO.show(true, 6);

        String c5 = "Privet!!!";
        mO.show(c5);

        mO.show("Igor","Nice");
    }
}
//Существует несколько вариантов метода Overloading:
/* Разный по типам данных:
show (int a,double b)
show (boolean a, String b)

Разный по кол-ву:
show (int a, int c)
show (int a,int c , int b)

Разный по порядку:
show (int a, double b)
show (double b, int a)
 */