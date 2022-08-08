package Lessons.Lesson24.Inteface.Interface2;

public interface I1 {
    //методы в интерфейсе могут иметь аксес модифаер - private - , но тогда обязательно писать тело метода!
    private static void method(){
        System.out.println("Okay");
    }

    private  void method2(){
        System.out.println("OK");
    }

//    private void method1();   - так нельзя, нужно либо дописать тело метода, либо сделать метод абстрактным

    default void method3() {    //можем вызвать внутри не статического метода наши приватные методы
        method();
        method2();
    }

    static void method4() {    //можем вызвать внутри статического метода наш приватный статический метод
        method();
    }
}
