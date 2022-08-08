package Homework.Homework24.HOMEWORK;
import Homework.Homework24.*;
public class MAIN {
    public static void main(String[] args) {
        Mechenosec m = new Mechenosec("Меченосец!");
        System.out.println(m.name);
        m.eat();
        m.sleep();
        m.swim();

        Speakable p = new Pingvin("Пингвинчик!");
        p.speak();

        Animal a = new Lev("Левчансий!");
        System.out.println(a.name);
        a.eat();
        a.sleep();

        Mammal ml = new Lev("Левурольд!");
        System.out.println(ml.name);
        ml.run();
        ml.sleep();
        ml.eat();
        ml.speak();




    }
}
