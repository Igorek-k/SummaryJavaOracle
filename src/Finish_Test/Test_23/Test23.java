package Finish_Test.Test_23;

//Что будет результатом компиляции и запуска данного кода?
class Test {
    public static void main(String args[]) {
        String array1[] = new String[][]{new String[]{"privet", "poka", "ok"}, {new String()},
                {null}}[2];
        String array2[] = {null};
        String array3[] = null;
        System.out.println(array1[0]);
        System.out.println(array2[0]);
        System.out.println(array3[0]);
    }
}


// Output:
//null
//null
//NullPointerException

