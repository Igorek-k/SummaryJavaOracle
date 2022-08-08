package Lessons.Lesson3;

public class Operators_С {
    public static void main(String[] args) {
        //Логические операторы:

        //Логические операторы работают только с логическими типами данных, то есть с Boolean. С числами работать нельзя.


        //Оператор "&&"- AND. Результат будет true, если абсолютно все условие "true".
        Boolean a0 = true;
        Boolean a1 = true;
        Boolean a2 = true;
        Boolean a3 = true;
        Boolean a4 = a0 && a1 && a2 && a3; //result: true.
        System.out.print(a4);
        System.out.println();

        Boolean b0 = true;
        Boolean b1 = true;
        Boolean b2 = false;
        Boolean b3 = true;
        Boolean b4 = b0 && b1 && b2 && b3; //result: false.
        System.out.print(b4);
        System.out.println();

        //Оператор "||" - OR. Результат будет true, если хотя бы одно из условий "true".
        Boolean с0 = false;
        Boolean с1 = true;
        Boolean с2 = false;
        Boolean с3 = false;
        Boolean с4 = с0 || с1 || с2 || с3; //result: true.
        System.out.print(с4);
        System.out.println();

        Boolean t0 = false;
        Boolean t1 = false;
        Boolean t2 = false;
        Boolean t3 = false;
        Boolean t4 = t0 || t1 || t2 || t3; //result: false.
        System.out.print(t4);
        System.out.println();


        //Short circuit: ситуация (выражение) при котом читаеться самая первая операнта, а остальные не читаються.
        //Оператор "&&"(AND):
        Boolean q0 = false; //short circuit.
        Boolean q1 = true;
        Boolean q2 = true;
        Boolean q3 = true;
        Boolean q4 = q0 && q1 && q2 && q3; //result: false.
        System.out.print(q4); //Здесь первая операнта "b0" - false , соответственно исход выражения предрешен.
        System.out.println();  //Если хоть одна false ,то оператор &&(and) выведет false. Так что компилятор читает b0
        // сразу понимает иход и до остальных оперант даже не идёт.
        //Так же и с оператором ||(OR) :
        Boolean w0 = true; //short circuit.
        Boolean w1 = false;
        Boolean w2 = false;
        Boolean w3 = false;
        Boolean w4 = w0 || w1 || w2 || w3; //result: true.
        System.out.print(w4); //Первая операнта w0 "true" - условие выполнено. Компилятор дальше не читает изложение,т.к.
        System.out.println();  //уже понятно,что ответ будет "true".

        int mm =10;
        int m1 = 5;
        int m2 = 99;
        int m3 = 100;
        boolean m4 = mm<m1 && ++m2==m3; //short circuit. Из-за того,что компилятору сразу стало понятно,что это
        //выражение false, дальше он не выполняеться  и соответсвенно значение m2 не поменяеться.
        System.out.println(m4);
        System.out.println(m2); //m2 осталась 99(хоть и был префикс ++,который должен был увеличить значение) из-за
        //short circuit. C оператором || и тд тоже самое.

        //Но что бы выражение выполнялост полностью вне зависимости от shurt circuit используем операторы:
        // "&"(and), "|"(or) :
        int vv =10;
        int v1 = 5;
        int v2 = 99;
        int v3 = 100;
        boolean v4 = vv<v1 & ++v2==v3;  //тоже самое выражение,что и в примере выше , но из-за оператора "|" выражение
        //выполняеться полностью и "v2" изменило свое значение на +1.
        System.out.println(v4);
        System.out.println(v2); //Вывод результата : 100

        //Эти операторы "|","&" (beetwais) могут работать и с цифрами:
        int hh =10;
        int hk = 7;
        System.out.println(hh|hk); //происходит некое сочетание: число 10 и 13 конвертируються в двоичную систему:
         /* 1010 (10)          Начинаем с права: 0 - false, 1- true. 0| 1 = true,записываем 1, 1|1=true,запис 1,
           |                    0|1=true зап. 1, 1|1=true зап.1. У нас получилось 1111 ( это в двоичной) в переводе на
            1111  (7)           десятичную ответ 7. На экран выведет : 7.
           =1111  //7 = 111,но добавляем в начале 0,что бы уровнять кол-во цифр

            1010 (10)          Начинаем с права: 0 - false, 1- true. 0&1 = false,записываем 0, 1|1=true,запис 1,
           &                    0&1=false зап. 0, 1|1=true зап.1. У нас получилось 1010 ( это в двоичной) в переводе на
            1111  (7)           десятичную ответ 10. На экран выведет : 10.
           =1010  //7 = 111,но добавляем в начале 0,что бы уровнять кол-во цифр
          */


        //"^" оператор,который выведт true только если в выражении есть 1 true. Если будет больше одного =false.
        /*   true^true^true^true = false
             false^false^false^false = false
             true^false^true^false= false
             true^false^false^false= true. */
        boolean gg = true;
        boolean g1 = true;
        boolean g2 = true;
        boolean g3 = true;
        System.out.print(gg^g1^g2^g3); //result: false
        System.out.println();

        boolean kk = false;
        boolean k1 = true;
        boolean k2 = false;
        boolean k3 = false;
        System.out.print(kk^k1^k2^k3);// result: true
        System.out.println();


        // "!" - знак отрицания, принимает противоположное значение: "!true= false" , "!false = true".
        // грубо говоря (не)true = false or (не)false = true.
        boolean as = true;
        boolean as1 = false;
        System.out.println(!as); // variables "as" save meaning "true", but "!" меняет значение на противоположное.
        System.out.println(!false); //the results will be "true". Записывать можно и таким образом.

        int ai = 15;
        int ai2 = 10;
        boolean ai3 = !(ai>ai2); //Если мы хотим изменить значение выражения,нужно взять его в скобки и перед ними
        // поставить "!". И такое значение станет противополножным.
        System.out.println(ai3); //15>10 - это true, но из-за оператора "!" результат выведет :false.


        //Операторы сравнения: "<", ">", "<=", ">=", "==", "!=".

        boolean a = true; //может хранить знаяения "false/true".
        boolean b = 5 > 5; //так же хранит выражание: 5>5 - не верно, значит выведет false.
        boolean x = 3 == 5;// для равенства ставим "==", т.к "=" занято под присваивание переменной.
        boolean z = 5!=7; // "!=" - не равняеться. 5 не равно 7, так что выведет true.
        boolean v =  3 <= 1; // выведет false. 3 больше-равно 1 - не верно!
        // "<",">"-больше/меньше."<=",">="-больше равно/меньше равно."=="-равно(равняеться)."!="-не равно(не равняеться)
        boolean m = 356 >= 134; //true
        System.out.print(m);

        boolean pov = false;
        boolean pok = pov==true;
        System.out.println(pok);//вывод будет False. Читаем строку с pok с права на лево: true равное pov (false).
        //другими словами false == true ествественно это fasle.
        boolean pod = false;
        boolean pof = pov=true;
        System.out.println(pof);//вывод будет true. Мы присвоили значение true переменной pov.
        //Другими словами pof = true.

        //Последовательность выполнении операторов если они в одном уравнении:
        //Первыми: "++", "--", "!". Вторыми: "*", "/", "%". Третьи: "+", "-". Четвертые:"<", "<=", "=>", ">".
        // Пятые: "==", "!=". Шестые: "&&", "||". Седьмые: "=", "+=", "-=", "*=", "/=", "%=".

        //Что бы изменить последовательность используем скобки (). (a - b)*c.



    }
}

