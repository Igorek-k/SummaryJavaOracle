package Lessons.Lesson19;

public class Varags {
    //Variable arguments - аргументы, количество которых может быть совершенно разное

        //Что бы постоянно не писать один и тот же метод, но с разным кол-вом переменных:
    static void summa(int a,int b){
        int summa = a+b;
        System.out.println(summa);
    }
    static void summa(int a,int b,int c){
        int summa = a+b+c;
        System.out.println(summa);
    }
    static void summa(int a,int b,int c,int e){
        int summa = a+b+c+e;
        System.out.println(summa);
    }

    //Можно использовать Varags:
    static void summa (String s, int... a){
        int summa = 0;
        for(int i = 0; i<a.length;i++){
            summa+=a[i];
        }
        System.out.println(summa);
    }
    // int... a означает бесконечное число переменных типа int;

    //Можно подобный метод создать и с помощью массива:
    static void summ (int[] a){
        int summa = 0;
        for(int i = 0; i<a.length;i++){
            summa+=a[i];
        }
        System.out.println(summa);
        //Но тогда что бы использовать этот метод,нужно каждый раз создавать массив.
    }
    //Использовать varags можно и с массивом:
    static void abc(int [] ... array){ //Это значит ,что можно использовать бесконечное число массивов.
        System.out.println(array);
    }


    public static void main(String ... args) { //массив в main можно заменить на varags "..."
        summa("");
        summa("",3,7,5,3,5,6,32,232,1);

        summ(new int[]{4,3,2,1});  //Но подобное очень не удобное.

        //На самом деле ,когда мы пишем метод используя varags параметр "..." джава переводит этот varags в массив,
        //но делает это "за кулисами"
        //Правила использования varags переменной:
        //* 1. "..." использовать только между типом переменной и именем переменной.
       //* 2. Тип переменной может быть какой угодно.
      //* 3.В листе параметров метода может быть только 1 varags.
     //* 4.В листе параметров varags должен стоять самым последним.
    //* 5.Следующий код вызывает ошибку:
    /*   void abc(int ... a){
     *          some code;                                           * Так как компилятор принимает этих два метода
     *          }                                                    * как одно и тоже. Имена одинаковые и список
     *                                                               * параметров тоже одинаковый.
     * void abc(int array[]){
     *           some code;
     *      }
     */

        //В место параметра varags- метода можно вписать массив:
        summa("",new int[]{4,3,4}); //т.к. varags джава представляет как массив.


    }
}
