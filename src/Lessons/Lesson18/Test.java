package Lessons.Lesson18;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int array[] = {1, 3, 5, -6, 0, 7, 5, 3, 2, 1};

//  * 1 method:
//    sort(array) - сортирует массив от меньшего числа к большему.
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
//  * 2 method
//    binarySearch(array,value) - будет находить определенную value в определнном array
        //Но данный метод будет работать корректно только после сортировки!
        System.out.println();
        int index = Arrays.binarySearch(array,-6);
        System.out.println(index);

        int index1 = Arrays.binarySearch(array,7);
        System.out.println(index1);
    }


}
