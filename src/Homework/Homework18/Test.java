package Homework.Homework18;

public class Test {
    public void sortirovka(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
                if (i != index) {
                    int a = array[i];
                    array[i] = min;
                    array[index] = a;

                }
            }
        }




    public void show(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {7, -3, 6, -1, -7, 3, 9};
        int[][] array2 = {{5, 3, 2, 1}, {2, 434, 223, 13, -30}, {3, 4, 5, 1, 4343, 4}};
        Test t = new Test();
        Test2 t2 = new Test2();
        t.show(array);
        System.out.println();
        t.sortirovka(array);
        t.show(array);

        t2.showArray(array2);


    }
}

