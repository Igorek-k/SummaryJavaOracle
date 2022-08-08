package Finish_Test.Test_33;

//Что будет результатом компиляции и запуска данного кода?
class Test{
    public static void main(String[ ] args){
        int[] array1 = { -3, 2, 0, 8, 1};
        int[] array2 = { 9, 0, 4, -10 };
        System.out.println( array1 [ (array1 = array2)[1] ] );
    }
}

// Output:
//-3