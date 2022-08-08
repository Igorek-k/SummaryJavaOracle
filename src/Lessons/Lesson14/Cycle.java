package Lessons.Lesson14;

public class Cycle {
    //Циклы называют петлей.
    /* Существуют циклы:
     *  regular for;
     * while;
     * do while;
     * foreach;


     * Cинтаксис for:
     * for (initialization ; condition; update){      * initialization - иницилизация;
     *              expressions;                      * condition - условие;
     *              }                                 * update - изменение;
     *
     * Цикл for - нужен тогда,когда мы точно знаем сколько раз придется повторить действие.
     */
    public static void main(String[] args) {

        for (int y = 1; y <=10; y++){
        System.out.println("Lesson 14");
            System.out.println("Privet ");
        }
        //Условие всегда должно отвечать true/false;
        //Если true цикл выполняеться, если false - заканчивает выполнение.
       int y =10; // переменную с таким именем мы можем создать,т.к. внутри for локальные переменные.
    }
}

class Test{
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++){
            System.out.println(i); // выводит на экран по порядку числа от 1 до 10;

        }
        /* initialization - должна быть всегда одна,но можно задать нескольк переменных ( перечислять через запятую),
         * самое главное ОДНОГО ТИПА. Её даже можно не указывать,но тогда придеться задать значения до for.
         */
        int i = 9;
        for (;i>=1;i--){
            System.out.println(i);
        }

        for(int j=1,k=7,u = 10;j <= 10 && j> -3 || j> 4; j++, u=u*10, k--){
            System.out.println(j+u + " "+ k);
        }
        //В condition нельзя перечислять через запятую,но можно использывать операторы boolean (&& , ||)
    }   // В update можно перечислять изменения через запятую,уже извесных нам значений. Что бы иземения были не просто
    // ++ или -- , то приравниваем переменной её значение: u=u*10 ,но если просто написать u*10 будет ошибка комплицяи.
}
class Test2{
    static void abc(int n){
        System.out.println(n);
    }
    public static void main(String[] args) {
        for(int j=1; j <= 10  ; j++,abc(18) ){
            System.out.println(j);
            abc(7);
            //j++;
        } // мы можем даже внутри ,через запятую с update вызывать методы. Или просто в теле.
           // так же в теле можно писать update.  Update можно вообще не писать,тогда for будет бесконечен.
        //И так же можно не указать condition, но точку с запятой обязательно:
        /*
        for(int j=1;; j++ ){
            System.out.println(j);     бесконечный цикл с постоянным увелечением на "1".
          }
       И тело так же не обязательно,но тогда смысла не будет.
         */



    }
}