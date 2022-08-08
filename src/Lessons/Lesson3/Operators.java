package Lessons.Lesson3;

public class Operators {
    public static void main(String[] args) {
        //Арифмичиские операторы: "+", "-", "*", "/", "%", "++", "--".
        int a = 11;
        int b = 3;
        //int c = a+b;
        // System.out.print(c);     //- можно и так, и так - результат будет один и тот же.
        System.out.println(a+b);      // так же можно с операторами "+", "-", "*".

        int c1 = 11;               // 11/3= 3,6666666666 , но из-за того,что переменная типа int все,что после запятой
        int c2 = 3;                 //отсекаеться, не округляеться, а отсекаеться.
        int c3 =c1/c2;
        System.out.println(c3);  // данный пример выведет просто 3.

        double e1 = 11;   //тип double вмещает в себе дробные числа. Так что выводимое на экран число будет в своем
        double e2 = 3;    // исходном виде, в данном случае 3,66666666666.
        double e3 = e1/e2;
        System.out.println(e3);

        //что бы в переменной типа инт можно было увидеть остаток нужно воспользваться оператором "%".
        int r1 = 11;
        int r2 = 3;
        int r3 = r1%r2;
        System.out.println(r3); //в данном примере на экран выведет "2".
        //число "3" влезает в "11" три раза. 3+3+3 = 9. 11-9=2. То есть остаток два .
        //Если взять 17%4= 1. Число "4" влезает в "17" четрые раза. 4+4+4+4 =16. 17-16=1.

        //тоже самое можно с типом double.
        double t1= 5.5, t2=3.5, t3 = t1%t2; //упрощенная запись переменных. Упрощать подобным образом можно,только если
        //тип данных для всех параметров единтичный.
        System.out.println(t3); // Вывод :2.0. По сколько double тип дробительный, он выводит со значением после запятой.
        //в int = 3 ,a в double = 3.0 и тд.

        /*Арефметическе операторы "++", "--" называются - unarу (унарные).
         Если такой оператор идет в переди значения : ++а, --в = эти операторы называют "prefix"
         Если в конце значения : а--, а++ = называют "postfix".
         */
        int g1= 5;
        int g2 = 3;
        int g3 = g1 + ++g2;
        System.out.println(g3); //вывод будет 9. Если "++"перед значением, он увеличиваеться на 1 и считаеться.
        // Если "--" перед значением, он уменьшиться на 1 и считаеться.
        // другими словами : 5+ (1+3) = 9
        int h1 = 6;
        int h2 = 2;
        int h3 = h1 + h2++;
        System.out.println(h3); // вывод будет 8. Если "++" ("--) стоит в конце значения ,то в данном уравнении
        // сохраняються все значения, а уже после добавляеться или отнимаеться 1. То есть:
        // 6+2 = 8. Но теперь "h2" = 3.
        // Еще пара примеров:
        int k1 = 7;
        int k2 = 4;
        int k3 = --k1 - k2;
        System.out.println(k3); // Результат :2. Т.к. оператор "--" стоит перед значением оно сразу меняеться и после
        //считаеться.
        int q1 = 10;
        int q2 = 3;
        int q3 = q1-- - q2;
        System.out.println(q3); // Результат: 7. Т.к. оператор "--" стоит после значения,сначала выполняеться уравнения.
        // то есть postfix не влияет на результат сложения, а просто меняет значение к которому он привязан
        // уже после решения. 10-3 = 7. Но q1 теперь = 9. И если повторно использовть q1 в следующем сложении
        // оно будет = 9 изначально.
        System.out.println(q1);// из-за постфикса в "q3" переменная уменьшила свое значение на "1". Рузельтат вывода: 9.

        int m = 5; //чему будет ранвять m, если:
        int m1 = ++m - --m - m-- + m++ ;  // m1=m. Компилятор ругаеться))
        //    6 -   5 - 5   + 4 =0
        System.out.println(m1);





    }
}

