package Homework.Homework20;

import java.util.*;


public class Test {
    public ArrayList abc(String... masiv) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : masiv) {
            if (!list.contains(s)) {
                list.add(s);
            }
        }
            Collections.sort(list);
            System.out.println(list);



        return list;
    }


    public static void main(String[] args) {
        Test t = new Test();
        t.abc("listik","privet","Hello","b","a","d","c");
    }
}
