package Lessons.Lesson14;

public class Test5 {
    void time() {
        for (int chas = 0; chas <= 23; chas++) {
            System.out.println("Nachalo outer loopa:");  //данная строка не обязательна,она для того,что бы показать,что
            for (int minuta = 0; minuta <= 59; minuta++) {   // можно перед nested for писать свое выражение.
                System.out.println(chas + ":" + minuta);
            }
            System.out.println("Konec outer loopa."); // тоже самое,что и выше. Если эти строки убрать,суть не поменяется
        }    //просто не будет выводить на экран Nachalo outer loopa: и Konec outer loopa. Все остальное работает так же.
    } //мы написали метод,который выводит время: часы с минутой. 00:00, 00:01, 00:02 и тд.

    public static void main(String[] args) {
        Test5 t = new Test5();
        t.time();
        /* Как работает метод: сначала выполняется внешний for: 0 меньше 23? Да, теперь переходит контроль к внутренему for
         *  0 меньше 59? Да. И внутренний for делает свой цикл,пока в условии не будет Fasle. Все 59 раз,как только он
         * закончил контроль вновь передается внешнему for,который стал уже 1. 1 меньше 23? Да, и цикл повторяеться заново
         *  пока не будет в условии внешнего for - false.
         *
         * Так же в джаве нет ограничений по кол-ву loop. Внутри for,может быть for,внутри которого еще два for и тд.
         */
    }
}

class Test6 {
    public static void time() {
        for (int chas = 0; chas <= 23; chas++) {
            System.out.println("Nachalo outer loopa:");

            for (int minuta = 0; minuta <= 59; minuta++) {
                System.out.println(chas + ":" + minuta);
                if (minuta == 30) {
                    break;   //этот break выводит только из внутреннего loop, внешний продолжает полноценно работать.
                }//когда внутренний loop остановится на 30 ( из-за if) выведет на экран "Konec outer loopa."
            }
            // if (minuta == 30) { мы пытались использовать переменную minuta, которая принадлежит внутренему loop, во
            //  } внешнем loop. Именно по этому ошибка. Как только мы выходим из внутрненего loop переменная перестает
            System.out.println("Konec outer loopa.");       //существовать.
        }
    }

    public static void main(String[] args) {
        time();
    }
}

class Test7 {
    void time() {
        Name:
        for (int chas = 0; chas <= 23; chas++) {            // * мы можем называть наши for именами,это называется
            System.out.println("Nachalo outer loopa:");     // * labels. Имя + : for. Это создано для удобсвта и увелечения
            for (int minuta = 0; minuta <= 59; minuta++) {  // * функционала.
                System.out.println(chas + ":" + minuta);
                if (minuta == 30) {
                    break Name;   //К примеру,если бы не было имя после break, то остановился бы только внутренний loop
                } // а внешний работал так же. Результат был бы, 00:30, 1:01 ... 1:30, 2:00. И так до конца внешнего
            } //loop. А таким образом,с использованием имени,как только внутренний loop дойдет до 30, то выполняется
            System.out.println("Konec outer loopa."); //команда вывести из тела loop под именем Name,в нашем случае
        }                                            //это внешний loop.
    }  //Стандартные название для внешнего loop: Outer, а для внутреннего loop: Inner.
//Основная задача labels (имя для loop) управление внешними loop во внутренних.

}