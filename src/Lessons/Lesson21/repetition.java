package Lessons.Lesson21;

public class repetition {
    public static void main(String[] args) {

//  Ternaty Operator
        // booleanExpression ? expression1 : expression2
        int a = 4;
        System.out.println(a < 4 ? 7 : "privet");
        //Выводи на экран "7", если a<4 - true
        //Выводи на экран "privet", если  a<4 - false
        //int b = (a<4)?7:"privet"; - так писать нельзя, т.к. если b будет false,инт не присвоит значения String

        int a1 = 5;
        int b1 = 5;
        int c1 = (a1 < 6) ? a1++ : b1++;
        System.out.println("a1 = " + a1);
        System.out.println("b1 = " + b1);
        //Если будет true, то b1++ не сработает. Если false, то a1++ не сработает.

//  Конфликт имен  в блокноте

//  Garbage collections. Methods System.gc() , finalize()
        // Garbage collections - механизм, который собирает и удаляет муссор.
        // Methods System.gc() - с помощью данного метода,мы СОВЕТУЕМ Garbage collections сработать сейчас.
        // finalize() - однократно вызывается Garbage collections на объект. Если Garbage collections не будет вызван
        //то и метод вызван не будет
    }
}
class Test1{
//  При вызове метода, требующего в параметр тип данных int мы можем использовать тип данных char
     void abc(int i){
            System.out.println(i);
        }

    public static void main(String[] args) {
        Test1 t = new Test1();
        char c = 'a';
        t.abc(c);
    }
    }

