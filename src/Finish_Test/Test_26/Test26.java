package Finish_Test.Test_26;

//Что будет результатом компиляции и запуска данного кода?
class Test {
    public static void main(String[] args) {
        int[][] array = {{1, 2}, {3, 4}};
        int i = 5;
        try {
            array[abc()][i = 0]++;
        } catch (Exception e) {
            System.out.println(i + " " + array[1][1]);
        }
    }
    static int abc() throws Exception {
        throw new Exception();
    }
}

// Output:
//5 4