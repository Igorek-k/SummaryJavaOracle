package Lessons.Lesson12;

public class Flow_Countrol {
 //   Flow_Countrol - это контроль выполнения хода нашей программы. Какой элемент, в какой последовательности будет
    //выполняться, а какой элемент вообще не будет выполняться.

    //Flow_Countrol делиться на две части:
    // * selection - когда нам предстоит выбрать (если воскресеьне , то не иду в школу)
    // * looping - когда нам предстоит повторять что-то (некий цикл) повторение одной и той же программы, тд.

    //Синтаксис if :
/*  if (boolean expression) {         *  if (boolean expression) - обязательный элемент
  *    our code                       *  our code - необязательный, но чаще всего пишут
  *      }
  *    else {                         *  else - не обязательный элемент.
  *    our code                       *  our code - - не обязательный элемент.
  *      {             //в данном случае boolean expression(логическое выражение) - это условие. Если (условие), то ..
 */
}

class Test10 {
    public static void main(String[] args) {
        int a = 10;
        if (a < 20) {  //если а<20 , то вывести на экран то,что написали. Само собой если условие true.
            System.out.println("a menshe 20");
        }


        int b = 30;
        if (b < 20) {  //30<20 - false. В таком случае программа ничего не выведет.
            System.out.println("b menshe 20");
        }


        int c = 15;
        if (c < 20)   //если мы используем только одно выражение,то скобки не обязательны.
            System.out.println("c menshe 20");


        int v = 15;
        if (v < 20) {
            System.out.println("v menshe 20");
            System.out.println("TRTRT");
            v++;
        }   //А если больше одного - скобки обязательны.
        //Однако если мы не поставим при таком случае скобки компилятор ошибку не выдаст, но к if будет относиться
        //только первое выражение. Все остальное -игнор. if.


        int g = 25;
        if (g < 20) {     //если данное выражение false
            System.out.println("g меньше 20");
        } else {         //то выполняеться это строка.
            System.out.println("g больше 20");
        }



      int salary = 600;
        if(salary<200){    //false  проверяет следущие условие
            System.out.println("Z/p nizkaya");
        }
        else if ( salary<300){     //false  проверяет следущие условие
            System.out.println("Z/p srednya");
        }
        else if(salary< 600){      //false  проверяет следущие условие
            System.out.println("Z/p norm");
        }
        else{       //если ни одно условие не выполнено,то просто else.
          System.out.println("Z/p goooooodnice");
        }  //если убрать else  и оставить только if and else if,то из-за невыполнения ни одного условия на экран ничего
                // не выведется.



    }
}