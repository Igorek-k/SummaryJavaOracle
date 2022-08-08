package Lessons.Lesson30;

public class Test {
//Generics "<>"

    public static void main(String[] args) {
//  Везде где в классе Info использовалась Т - мы меняем на String. Происходит обычная замена
        Info<String> info1 = new Info<>("Privet");
        System.out.println(info1);
        String s = info1.getValue();

        Info<Integer> info2 = new Info<>(100);
        System.out.println(info2);


    }



}

//Т - любой тип данных, но мы не знаем еще какой. Так же можно использовать одновременно несколько типов! "Т,Е" и тд
//Т - заполнитель типа (+- корректное название)
class Info<T> {
    //  Пример Parameterized class
    private T value;

    public Info(T value) {
        this.value = value;
    }

    public String toString() {
        return "[{" + value + "}]";
    }


    public T getValue() {
        return value;
    }


    //Дженерики by runtime удаляются. Это из-за поддержки обратной совместимости. По этому есть разные моменты:
//* Problem with overloading
//    public void abc(Info<String> info) {
//        String a = info.getValue();
//    }
//
//    public void abc(Info<Ineger> info) {
//        Integer a = info.getValue();
//    }

//    Для компилятора эти методы выглядят оба одинаково
}

class Parent{
    public void abc(Info<String> info) {
        String a = info.getValue();
    }
}

class Child extends Parent{

//* Problem with overriding

//    public void abc(Info<Ineger> info) {
//        Integer a = info.getValue();
//    }
}
