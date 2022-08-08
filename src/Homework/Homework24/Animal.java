package Homework.Homework24;

public abstract class Animal {
    public String name;

    Animal(String name) {
        this.name = name;
    }

    public abstract void eat();

    public abstract void sleep();
}

abstract class Fish extends Animal {
    Fish(String name) {
        super(name);
    }

    public void sleep() {
        System.out.println("Vsegda interesno nabludat, kak spyat ribi!");
    }

    public abstract void swim();
}

abstract class Bird extends Animal implements Speakable {
    public Bird(String name) {
        super(name);
    }

    abstract public void fly();

    @Override
    public void speak() {
        System.out.println(super.name + " sings");
    }
}





