package Lessons.Lesson15;

public class Nested_loop {
    public static void main(String[] args) {
        int chas = -1;
        OUTER:
        do {
            chas++;
            int minuta = 0;
            INNER:
            while (minuta < 60) {
                if (minuta == 20) {
                    continue OUTER;
                }
                System.out.println(chas + ":" + minuta);
                minuta++;
            }

        }
        while (chas < 23);
    }
}


class Times {
    public static void main(String[] args) {
        for (int chas = 0; chas < 24; chas++) {
            int minuta = 0;
            while (minuta < 60) {
                System.out.println(chas + ":" + minuta);
                minuta++;
            }
        }
    }
}

