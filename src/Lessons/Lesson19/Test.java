package Lessons.Lesson19;

public class Test {
    public static void main(String[] args) {

        int[] array = new int[4];
        for (int i = 0; i < array.length;i++){
           array[i] = i*10; // С помощью classic for мы можем изменить элемент массива.
            //А с помощью foreach нельзя проводить динамическую инициализацию.
        }

        for(int a : array){
            System.out.println(a);
        }
    }
}

class Testil{
    public static void main(String[] args) {
        int [] array = {3,4,3,2};
        int [] array2 = {-2,6,1,8};
        for(int i = 0; i<array.length && i<array2.length; i++){
            array[i] = 12;   //с помощью  classic for мы можем работать и менять значение сразу двух и более массивов
            array2[i] = 3;
        }  //А с помощью foreach можно работать только с 1 массивом.
         /*
          * То есть с помощью foreach loop:
          * невозможно изменить значения элементов массива примитивного типа данных;
          *
          * возможно изменить значения элементов (значения объектов) массива ссылочного типа данных,но заменить элемент
          * невозможно;
          *
          * невозможно проводить динамическую инициализацию массива;
          *
          * невозможно в одном цикле одновременно работать более чем с 1 массивом;
          *
          * Но с помощью tradition for loop можно это все!!
          */
    }

}
