package Lessons.Lesson23.Binding;

public class Binding_Test {
// Binding – определение вызываемого метода, основываясь на объекте, который производит вызов
//     или типе данных reference variable.

 // Существуют два типа: Compile time binding ( называют так же статическим) и Run time binding ( называют динамическим)
//  Compile time binding:  - определяет при компиляции.
    // * private methods
    // * static methods
    // * final methods
//  Run time binding:   - если во время компиляции не определил, то определяет во время запуска
    // * All other methods

//  Все переменные имеют compile time binding т.к. компилятор определяет сразу их тип.
    void abc(Animal a){
        System.out.println("A");
    }
    void abc(Mouse m){
        System.out.println("M");
    }

    public static void main(String[] args) {
        Binding_Test bt = new Binding_Test();
        Animal an = new Mouse();
        bt.abc(an); //здесь не нужна run time проверка, что на самом деле an типа Mouse, т.к. в параметре используем
        //переменную типа Animal
        an.getName(); //тут бы уже шла проверка run time,что бы понять какой метод вызывать
    }
}

class Animal{
    void getName(){
        System.out.println("Animal");
    }
}

class Mouse extends Animal{
    void getName(){
        System.out.println("Mouse");
    }
}
