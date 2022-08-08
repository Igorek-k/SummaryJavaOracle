package Lessons.Lesson29.Part_2;

import java.util.ArrayList;

public class Test {
// var - local variables type inference

    public static void main(String[] args) {
        TestInfereneType tit = new TestInfereneType(); //что бы постоянно не писать имя класса при создании объекта
        var tit1 = new TestInfereneType();  //используем слово "var"

//  Так же var можно использовать:
        var i = 10; //компилятор понимает что это Integer/int
        var w = 1.5f;
        var array = new String[]{"s", "v"};
        var result = abc(); //компилятор понимает что result будет double

        Object obj = "Privet";
        var obj2 = obj;

        ArrayList<String> al = new ArrayList<>();
        for (var s : al) {   //компилятор понимает что var это ArrayList
            System.out.println("Hi");
        }

//  Как нельзя писать:
//*        var h;                                    нельзя просто объявить и не придать значение
//*        var n = null;                             нельзя ссылать  var на null
//*        var array2 = {1,2};                       при инициализации массива должен быть указан тип
//*        var [] array3 = {1,2};
    }
//*    var iy = 10;                                  нельзя писать вне метода
//*    static double abcd(var a) {return 3.14;}      нельзя писать внутри параметра
//*    static var abcde() {return 3.14;}             нельзя писать var в return type метода
//


    static double abc() {
        return 3.14;
    }
}


class TestInfereneType {

}