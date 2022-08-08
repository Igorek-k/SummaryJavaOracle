package Homework.Homework22.Exersize2;

public class Animal {
    protected Animal() {
        System.out.println("I am animal!");
    }

    protected int eyes;

    protected void eat() {
        System.out.println("Animal eats!And so again and again...");
    }

    protected void drink() {
        System.out.println("Animal drinks! Right now!");
    }
}

class Pet extends Animal {
    protected Pet() {
        System.out.println("I am pet! Do you understand me???");
        eyes = 2;
    }

    protected String name;
    protected int tail = 1;
    protected int paw = 4;

    protected void run() {
        System.out.println("Pet runs. Wish her luck..NOW!!");
    }

    protected void jump() {
        System.out.println("Pet jumps right now...it looks very nice!");
    }
}


class Dog extends Pet {
    protected Dog(String name) {
        this.name = name;
        System.out.println("I am dog and my name " + name + ". Let's be friends :)");
    }

    protected void play() {
        System.out.println("Dog play. Don't bother him!!");
    }
}

class Cat extends Pet {
    protected Cat(String name){
        this.name = name;
        System.out.println("I am cat and my names " + name + ". Don't get in my way!!!!");
    }

    protected void sleep(){
        System.out.println("Cat sleep now. Please, don't bother him! ");
    }
}

class Test{
    public static void main(String[] args) {
        Dog d = new Dog("Backs");
        System.out.println("And I have paws, there are "+ d.paw + " of them! ");

        Cat t = new Cat("Busy");
        t.sleep();



    }
}








