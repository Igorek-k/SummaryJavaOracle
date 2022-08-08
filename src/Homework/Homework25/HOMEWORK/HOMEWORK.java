package Homework.Homework25.HOMEWORK;

import Homework.Homework25.*;

public class HOMEWORK {
    public static void main(String[] args) {
        Animal al = new Lev("Animal - Lev");
        Animal ap = new Pingvin("Animal - Pingvin");
        Animal am = new Mechenosec("Animal - Mechenosec");

        Bird b = new Pingvin("Bird - Pingvin");

        Fish f = new Mechenosec("Fish - Mechenosec");

        Speakable speakablePingvin = new Pingvin("Speakable - Pingvin");
        Speakable speakableLev = new Lev("Speakable - Lev");

        Mammal mammal = new Lev("Mammal - Lev");

        Mechenosec mechenosec = new Mechenosec("Mechenosec - Mechenosec");
        Pingvin pingvin = new Pingvin("Pingvin - Pingvin");
        Lev lev = new Lev("Lev - Lev");

        Speakable[] arraySpeakable = {speakablePingvin, speakableLev, pingvin, lev, mammal, b};
        Animal[] arrayAnimal = {al, ap, am, b, f, mammal, mechenosec, pingvin, lev};

        for (Animal animal : arrayAnimal) {
            if (animal instanceof Lev) {
                System.out.println(lev.name);
                lev.eat();
                lev.run();
                lev.sleep();
                lev.speak();
            } else if (animal instanceof Pingvin) {
                System.out.println(pingvin.name);
                pingvin.eat();
                pingvin.fly();
                pingvin.sleep();
                pingvin.speak();
            } else if (animal instanceof Mechenosec) {
                System.out.println(mechenosec.name);
                mechenosec.eat();
                mechenosec.swim();
                mechenosec.sleep();
            }
            System.out.println("------------------------------------");
        }


        for (Speakable sss : arraySpeakable) {
            if (sss instanceof Lev) {
                System.out.println(lev.name);
                lev.eat();
                lev.run();
                lev.sleep();
                lev.speak();
            } else if (sss instanceof Pingvin) {
                System.out.println(pingvin.name);
                pingvin.eat();
                pingvin.fly();
                pingvin.sleep();
                pingvin.speak();
            }
            System.out.println("------------------------------------");
        }

    }
}
