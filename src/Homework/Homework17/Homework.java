package Homework.Homework17;

public class Homework {
    public boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {
     boolean result = true;
    if (sb1.length() == sb2.length()) {
        for(int i = 0; i<sb2.length();i++){
            if(sb1.charAt(i)!=sb2.charAt(i)){
                result = false;
                break;
            }
        }
        }
        else{
            result = true; }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        Homework h = new Homework();
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("hello");
        StringBuilder sb3 = new StringBuilder("hello");
        StringBuilder sb4 = sb1;


        h.ravenstvo(sb1,sb2);

        h.ravenstvo(sb1,sb3);

        h.ravenstvo(sb1,sb4);

        h.ravenstvo(sb2,sb3);


    }
}
