package Homework.Homework25;

public class Lev extends Mammal {
public String name;
    public Lev(String name){
        super(name);
     this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Lev, kak luboy hishnik, lubit maso!");
    }

    @Override
    public void sleep() {
        System.out.println("Bolshuu chast dnya lev spit!");
    }

    @Override
    public void run() {
        System.out.println("Lev - eto ne samaya bistraya koshka!");
    }
}
