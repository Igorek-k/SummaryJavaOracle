package Lessons.Lesson30;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-60);
        list.add(30);
        list.add(150);
        int a = GenMethod.getSecondElement(list);
        System.out.println(a);
    }
}

class GenMethod {
    public static <T> T getSecondElement(ArrayList<T> al){
        return al.get(1);
    } //Parameterized methods

}
