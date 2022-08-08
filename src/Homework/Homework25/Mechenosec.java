package Homework.Homework25;

public class Mechenosec extends Fish {
    public String name;

    public Mechenosec(String name) {
        super(name);
        this.name = name;
    }

    public void swim() {
        System.out.println("Mechenosec krasivaya riba, kotoraya bistro plavaet!");
    }

    public void eat() {
        System.out.println("Mechenosec ne hishnaya riba, i ona est obichniy ribiy korm!");
    }
}
