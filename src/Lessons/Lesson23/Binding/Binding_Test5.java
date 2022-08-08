package Lessons.Lesson23.Binding;

public class Binding_Test5 {
    public static void main(String[] args) {
        A c1 = new C();
        c1.abc(new B()); //result "A"
    }
}
//Как пример с Employee и Teacher. Мы не можем вызывать метод, которого нет в классе -A-, если наш объект ссылается
//на тип данных -А-. Мы не можем вызвать метод "учить", если в Employee его нет.
//А по сколько -В- саб класс -А-, то любой объект -В- является объектом А

class A{
    void abc(A a){
        System.out.println("A");
    }
}

class B extends A{
    //Этот класс так же имеет метод abc(A a)
    void abc(B b){             //overloading метод
        System.out.println("B");
    }
}

class C extends B {
    //Этот класс так же имеет метод abc(A a)

    void abc(B b2){          //overriding метод
        System.out.println("C");
    }
}