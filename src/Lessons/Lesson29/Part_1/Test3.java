package Lessons.Lesson29.Part_1;

public class Test3 {
//* Как можно писать:
//def( () -> 5 );                 если нет параметров - пустые скобки
//def( (x) -> x.length() );
//def( (String x) -> x.length() );
//def( (x, y) -> x.length() );
//def( (String x, String y) -> x.length() );

//method( (int x, int y) -> {x=5; return10;} );
//method( (int x, int y) -> {int x2=5; return10;} );

//* Compile time errors:
//def( x -> {x.length();} );            без return
//def( x -> {return x.length()} );      не указать ";" в конце
//def( x, y -> x.length() );           при 2-х и более параметров не брать их в скобки

//method( (int x, int y) -> {int x=5; return10;} ); в параметре уже есть переменная x,нельзя создавать еще переменную
    //с таким именем

    static void def(TestInterface ti) {
        System.out.println(ti.abc("privet", "poka"));
    }

    static void def1(TestInterface1 ti) {
        System.out.println(ti.abc());
    }

    public static void main(String[] args) {
        def((x, y) -> x.length());

        def1(() -> 5);
    }
}

interface TestInterface {
    int abc(String s, String s2);
}

interface TestInterface1 {
    int abc();
}
