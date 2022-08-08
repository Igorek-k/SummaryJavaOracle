package Homework.Homework25;

public abstract class Fish extends Animal {
    Fish(String name) {
        super(name);
    }

    public void sleep() {
        System.out.println("Vsegda interesno nabludat, kak spyat ribi!");
    }

    public abstract void swim();
}