package Homework.Homework25;

public class Pingvin extends Bird {
    public String name;
    public Pingvin(String name) {
        super(name);
        this.name = name;
    }
    @Override
    public void eat() {
        System.out.println("Pingvin lubit est rubu!");
    }

    @Override
    public void sleep() {
        System.out.println("Pingvini spyat prijavchis drug k drugu!");
    }

    @Override
    public void fly() {
        System.out.println("Pingvin ne umeet letat!");
    }

    @Override
    public void speak() {
        System.out.println("Pingvin ne umeet pet kak solovey!");
    }

}
