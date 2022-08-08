package Lessons.Lesson18;

public class Dinamik_Initialization {
    public static void main(String[] args) {
        //Динамическая Initialization:
        String[] array;
        int[][] array2;

        array = new String[3];
        array2 = new int[3][];

       // Динамическая Initialization: это когда мы не пишем чему равен каждый элемент вручную,а делаем это
        //к примеру с помощью for и тд:

        for(int i = 0; i < array.length;i++){
           array[i] = "Hello" + i;
            System.out.println(array[i]);
        }

        array2[0] = new int [5];
        array2[1] = new int [2];
        array2[2] = new int [7];

        for(int i = 0; i< array2.length; i++){
            for( int j = 0; j<array2[i].length; j++){
                array2[i][j] = i + j;
                System.out.println(array2[i][j]);
            }
        }


    }
}
