package Finish_Test.Test_11;

public class Test11 {
}


//    Что будет результатом компиляции и запуска данного кода?
class Book {
    String bookName;
    Book() {
        Book b1 = new Book();
        b1.bookName = "Java OCA";
    }
}
class TestBook {
    public static void main(String args[]) {
        Book b2 = new Book();
        b2.bookName = "Java OCP";
        System.out.println(b2.bookName);
    }
}

// Output:
//StackOverflowError