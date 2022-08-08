package Homework.Homework27.HOMEWORK;

import Homework.Homework27.*;

public class Test {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat("myaso");
        try {
            t.drink("voda");
            try {
                t.drink("pivo");
            } catch (NeVodaException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }finally{
                    System.out.println("It's inner finally block");
                }
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }


    }
}

