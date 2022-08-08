package Lessons.Lesson24.Inteface.Defoult_Methods;

public class Test5 {
//* Данное слово default никаким образом не связанно с access modifier. Access
//    modifier default-ных методов в интерфейсе – public, который будет добавлен
//    компилятором, если его не указать самостоятельно.
//* default методы предоставляют дефолтную реализацию метода и могут быть созданы только в интерфейсе.
//* Если в интерфейсе создан default метод, то он должен иметь тело.
//* default методы не должен быть static, final или abstract.
}

interface I1{
    void abc();
    default void def(){
        System.out.println("H");  //дефолтный метод нельзя создать без тела. Дефолтный метод можно не переписывать
        //в других классах
    }
    default void def1(){
        System.out.println("H");  //дефолтный метод нельзя создать без тела. Дефолтный метод можно не переписывать
        //в других классах
    }
}

class Z2 implements I1{
    public void abc(){
        System.out.println("Darova");
    }

    public static void main(String[] args) {
        Z2 z = new Z2();
        z.abc();
        z.def();
    }

    @Override
    public void def() {   //что бы перезаписать дефолтный метод в классе используем аксес модифаер -public-
        System.out.println("XE");
    }
}

interface I2 extends I1{
    default void def1(){
        System.out.println("H");

    }
    void def();     //дефотлные метод можно сделать в других интерфейсах абстрактным
}

abstract class R implements I1{
    public abstract void def1(); //дефотлные метод можно сделать в других абстрактных классах абстрактным

    @Override
    public void def() {
        System.out.println("H");  //а можно просто переписать
    }
}