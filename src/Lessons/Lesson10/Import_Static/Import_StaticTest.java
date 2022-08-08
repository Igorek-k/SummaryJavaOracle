package Lessons.Lesson10.Import_Static;
import Homework.Homework8.Pokko;

import static Homework.Homework8.Pokko.*; //так мы импортировали все статик элементы из класса Pokko

//теперь мы можем использовать методы,переменные по их простому имени,если в классе нет метода или переменной такого же
         //имени.
public class Import_StaticTest {
    public static void main(String[] args) {
        System.out.println(pok); //pok - static variables принадлежащая классу Pokko в пакете домашнее задание.

        fourth(45.5); //по простому имени можем вызывать и методы.
    }
}
class StaticImp{
    static int count = 56;

    public static void main(String[] args) {
        System.out.println(Pokko.count); //что бы вызвать имеено тот count который с другого класса,при том ,что уже
        //существует переменная такого же именни в данном классе, нужно использовать имя класса.
        System.out.println(count);//первым делом джава смотрит нет ли такой переменной в текущем классе,так что приоритет
        //на уже существубщие переменные в текущем классе.
    }
}