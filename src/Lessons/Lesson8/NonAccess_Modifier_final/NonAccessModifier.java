package Lessons.Lesson8.NonAccess_Modifier_final;



public class NonAccessModifier { //касательно referens variables:
    String color = "blue";
    String engine = "V6";

}

class Himan{
    String name = "Ivan";
    NonAccessModifier car = new NonAccessModifier(); //если бы был final то,что ниже было бы невозможно

    public static void main(String[] args) {
        Himan h1 = new Himan();

        h1.car = new NonAccessModifier(); //это была бы ошибка
        h1.car = new NonAccessModifier(); // и это тоже ошибка
        h1.car.engine="v8"; //но будь класс NonAccessModifier final мы бы не смогли поменять его адресс.
        //То есть переменную car типа данных NonAccessModifier на другие значения.

        //Но поменять мотор смогли бы (h1.car.engine="v8") это ни как не повлияло бы на адресс переменной car.
    }
}