package Lessons.Lesson23.Keyword_super;

public class _SUPER_ {
// Обращение к элементам super класса с помощью keyword “super”:
    //*Keyword “super” означает обращение к объекту родительского класса.
    //*С помощью keyword “super” можно обращаться как к методам, так и к переменным родительского класса.
    //*Невозможно использование keyword “super” в static методах и переменных.
    //*Для того чтобы обратиться к элементам родительского класса с помощью keyword “super”,
    //   эти элементы должны быть видны в дочернем классе.
    //*При обращении к методу родительского класса, выражение “super”
    //   необязательно должно быть первой строкой тела метода.


    String s1 = "Hello";
    static double d1 = 3.14;

    int summa(int... i) {
        int result = 0;
        for (int a : i) {
            result += a;
        }
        return result;
    }

    static void abc() {
        System.out.println("Static method");
    }

}

class B extends _SUPER_ {
    String s1 = super.s1 + ", friend!";  //используем super для вызова переменой hide из класса родителя

    //В статик переменной нельзя присвоить значение с помощью "super" и  "this"
//    static String s1 = super.s1;
    //Но присвоить не статичной переменной статичное значение можно
    double d1 = super.d1;

    int summa(int... i) {
        int result = super.summa(i); //Что бы не переписывать полностью метод - используем supper.
        System.out.println("Summa " + result);  //Его так же можно вызывать из других методов,не обязательно одноименных
        super.abc(); //С помощью super можем вызвать статический метод из super класса
        return result;
    }

    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.s1);

        //В static методах  ключевое слово "super", как и  "this" использовать нельзя
//        System.out.println(super.s1);

    }

}

