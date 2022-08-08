package Lessons.Lesson18;

public class Massive2 {
    public static void main(String[] args) {
        //Смешанные варианты создания массива:
//  *
        int[] array = new int[7]; //объединили Declaration и Allocation
//  *
        int[] array2 = {1,2,3,4};  // объединили все 3 шага: Declaration, Allocation, Initialization;
//  *
        int[] array3;
        array3 = new int[]{1,2,3};
//  *
        int[] array4 = new int[]{1,2,3,4};

        //Нельзя два раза указывать длину массива явно и неявно. В [] - явно, {1,2,3,4} - не явно:
//        int[] array4 = new int[4]{1,2,3,4};

        //Если мы напишем так:
        int [] array5 , a; //мы говорим,что и array5 и а - массивы, т.к. [] стоит перед их именами.
        int b  [], c;  // мы говорим,что b - массив, а с - переменная. Т.к. [] стоит после b и перед c
        c=5;
        int d [], e [] [];// мы говорим,что d одномерный массив,а e - двухмерный.

        int [] yer []; //[] - эти скобки можно ставить как и где угодно - это разрешено;


        //Тип массива может быть каким угодным:
 //       Massive2 array [] = {c1,c2,c3,new Massive2()};
  //      Massive2 c3 = new Massive2();

        //сравнение массивов с помощью "==" и метод equals работает точно так же для массивов, как и для String Builder

        //Так же вместо индекса массива можно указывать,к примеру, 2-3, 2+7;
        int arlik[] = new int[3-6];


    }
}
