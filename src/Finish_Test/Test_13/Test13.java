package Finish_Test.Test_13;

// Что будет результатом компиляции и запуска данного кода?
class Book {
}
interface Readable {
}
class PaperBook extends Book implements Readable {
}
class ElectronicBook extends Book {
}
class TestBook {
    public static void main(String args[]) {
        Readable r = null;
        ElectronicBook eBook = new ElectronicBook();
        r = (Readable) eBook;
    }
}

// Output:
//ClassCastException