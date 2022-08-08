package Finish_Test.Test_43;

//Что будет результатом компиляции и запуска данного кода?
class Test {
    public static void main(String[] args) {
        String s1 = "ok";
        String s2 = s1;
        s1 += "!!!";
        System.out.println(s1 + ", " + s2 + ", " + (s1 == s2) + ", " + s1.equals(s2));
        StringBuilder sb1 = new StringBuilder("ok");
        StringBuilder sb2 = sb1;
        sb1.append("!!!");
        System.out.println(sb1 + ", " + sb2 + ", " + (sb1 == sb2) + ", " + sb1.equals(sb2));
    }
}

// Output:
//ok!!!, ok, false, false
//ok!!!, ok!!!, true, true