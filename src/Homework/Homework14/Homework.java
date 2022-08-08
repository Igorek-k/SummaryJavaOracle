package Homework.Homework14;

public class Homework {
    public static void time() {
        chasic:
        for (int chas = 0; chas <= 6; chas++) {
            minutka:
            for (int minuta = 0; minuta <= 59; minuta++) {
                if (chas > 1 && minuta % 10 == 0) {
                    break chasic;
                }
                secudochka:
                for (int secunda = 0; secunda <= 59; secunda++) {
                    System.out.println(chas + ":" + minuta + ":" + secunda);

                    if (secunda * chas > minuta) {
                        continue minutka;

                    }
                }

            }
        }
    }


    public static void main(String[] args) {
        time();
    }
}
