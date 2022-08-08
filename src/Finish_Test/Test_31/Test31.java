package Finish_Test.Test_31;

public class Test31 {
}


//    Что будет результатом компиляции и запуска данного кода?
interface Jumpable {
}

class Cats implements Jumpable {
}

class Tiger extends Cats {
}

class House {
}

class Test {
    public static void main(String[] args) {
        Jumpable j = new Tiger();
        Tiger t = new Tiger();
        House h = new House();
        if (j instanceof Cats) {
            System.out.println("j is Cat");
        }
        if (t instanceof Jumpable) {
            System.out.println("t is Jumpable");
        }
        if (h instanceof Jumpable) {
            System.out.println("h is Jumpable");
        }
    }
}

//   Output:
//        j is Cat
//        t is Jumpable