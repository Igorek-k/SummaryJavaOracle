package Lessons.Lesson25.Casting.Casting_Referens;

public class Test2 {
    //Кастинг массивов
    public static void main(String[] args) {
        String [] array = {"Hi","POK"};
        Object [] array2 = array;  //Любой String это Object, так что здесь upcasting
        String [] array3 = (String[])array2;  //Не любой Object это String, здесь кастим вручную downcasting
    }
}

class Test10{
    int a = 5;
    void abc(){
        System.out.println("OK");
    }
}

class Test20 extends Test10{
    int a = 10;
    void abc(){
        System.out.println("OK2");
    }
}


class Test30 extends  Test20{

    void abc(){
        super.abc();  //вызываем метод из Test20. Но из Test10 метод вызвать уже не сможем.
        System.out.println("OK3");
    }
    int a = 15; //Но что бы вызвать переменную с Test10 нужно просто кастить

    public static void main(String[] args) {
        Test30 t = new Test30();
        System.out.println(((Test10)t).a); //вызываем переменную из Test10

        ((Test10)t).abc(); //кастить методы так не выйдет. Результат все равно "OK3" из Test30,т.к. t ссылается на Test30
    }

}