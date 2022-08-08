package Lessons.Lesson5.Constructor;

public class Const2 {
    String name;
    Car car10;
    BankAccount bA;

    void info(){
        System.out.println("Imya: "+name+"; Mashina: "+car10.color2+"; Bank Account: "+bA.balance+"$");
    }

}


class Car{
    Car(String r1, String t1){
        color2=r1;
        engine2=t1;

    }
    String color2;
    String engine2;
}

class BankAccount{
    BankAccount(int id2,double balance2){
        id = id2;
        balance = balance2;
    }
    int id;
    double balance;
}
 class Human {
    public static void main(String[] args) {
        Const2 H = new Const2();
        H.name = "Igor";
        H.car10 = new Car("red", "V10");
        H.bA = new BankAccount(143563, 456.67);
        H.info();

    }
}
