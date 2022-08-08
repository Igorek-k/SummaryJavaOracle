package Homework.Homework25;

public interface Speakable {
    default void speak() {
        System.out.println("Somebody speaks!");
    }
}

