package Lessons.Lesson23.Binding;

public class Binding_Test4 {
}

class Animal4 {

    static String showName() {
        return "some Animal";
    }

     String showName1() {
        return "some Animal";
    }

    void showInfoAboutAnimal() {
        System.out.println("Name of animal: " + showName());
    }

    void showInfoAboutAnimal1() {
        System.out.println("Name of animal: " + showName1());
    }
}

class Mouse4 extends  Animal4 {

    static String showName() {
        return "Jerry";
    }

     String showName1() {
        return "Jerry";
    }

    void showInfoAboutMouse() {
        System.out.println("Name of animal: " + showName());
    }

    void showInfoAboutMouse1() {
        System.out.println("Name of animal: " + showName1());
    }

    public static void main(String[] args) {
       Mouse4 a = new Mouse4();

       a.showInfoAboutMouse();//result Name of animal: Jerry
       a.showInfoAboutAnimal();// result Name of animal: some Animal

        //Если убрать static
        a.showInfoAboutMouse1();//result Name of animal: Jerry
        a.showInfoAboutAnimal1();// result Name of animal: Jerry

    }

}
