package Finish_Test.Test_14;

// Что будет результатом компиляции и запуска данного кода?
class Test {
    public static void main(String[] args) {
        String[][] array
                = {{"A", "B", "C"}, null,
                {"D"}, new String[8]};
        System.out.println(array);
        System.out.println(array[1]);
        System.out.println(array[0][2]);
        System.out.println(array[3][0]);
        System.out.println(array[3][5].length());
    }
}

// Output:
//[[Ljava.lang.String;@2a139a55
//null
//C
//null
//NullPointerException