package Lessons.Lesson26.Initializers;

public class Test {
//* Initializer block срабатывает каждый раз, когда создаётся новый объект соответствующего класса.

    {
        System.out.println("It is init block 3");
    }

    Test() {
        System.out.println("It is konstructor 1");
    }

    Test(int a) {
        System.out.println("It is konstructor 2");
    }

    {
        System.out.println("It is init block 1");
    }

    static {
        System.out.println("It is STATIC init block 1");
    }

    {
        System.out.println("It is init block 2");
    }
    static {
        System.out.println("It is STATIC init block 2");
    }

    public static void main(String[] args) {
        Test t1 = new Test();  //Статические Initializers выполняются 1 раз и всегда самые первые.
        Test t2 = new Test(3); //При создании каждого объекта вызывается Initializers.
//  Выполняются: 1.Static Initializers (один раз) | 2.Non-static Initializers (каждый объект) | 3.Конструкторы (каждый объект)

    }
}
