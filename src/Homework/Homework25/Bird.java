package Homework.Homework25;

public abstract class Bird extends Animal implements Speakable {
    public Bird(String name) {
        super(name);
    }

    abstract public void fly();

    @Override
    public void speak() {
        System.out.println(super.name + " sings");
    }
}
