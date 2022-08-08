package Homework.Homework15;

public class Part2 {
    public static void time() {
        int chas = 0;
        OUTER:
        while (chas < 6) {
            int minuta = -1;

            MIDDLE:
            do {
                minuta++;
                if (chas > 1 && minuta % 10 == 0) {
                    break OUTER;
                }

                int secunda = 0;
                INNER:
                while (secunda < 60) {
                    System.out.println(chas + ":" + minuta + ":" + secunda);
                    secunda++;

                    if (secunda * chas > minuta) {
                        continue MIDDLE;
                    }
                }

            }
            while (minuta < 59);
            chas++;

        }
    }

    public static void main(String[] args) {
        time();
    }
}

