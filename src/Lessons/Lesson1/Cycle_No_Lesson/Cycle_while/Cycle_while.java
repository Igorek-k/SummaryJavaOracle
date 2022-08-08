package Lessons.Lesson1.Cycle_No_Lesson.Cycle_while;

public class Cycle_while {
    public static void main(String[] args) {
        boolean a = true; //может хранить знаяения "false/true".
        boolean b = 5 > 5; //так же хранит выражание: 5>5 - не верно, значит выведет false.
        boolean z = 10 >= 5;// "==" - равенство, "<=,>=" ,  "<,>" и тд.
        boolean x = 3 == 5;// для равенства ставим "==", т.к "=" занято под приравнивание переменной.

        int neo = 5;
        while (neo < 10) {  //цикл - будет выполнять пока в "()" значение true.
            neo = neo + 1; // таким образом ограничиваем повтрорение цикла.
            // как только значение false - цикл остановиться
            System.out.println("Happy " + neo); // повториться 5 раз. Пока neo = <10 не будет false.
        }
    }
}

