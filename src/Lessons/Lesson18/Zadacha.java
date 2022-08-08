package Lessons.Lesson18;

public class Zadacha {
    public static void MaxMin(double[] array) {
        double max = array[0];
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }

        }
        System.out.println("Max array: " + max + "; Min array: " + min);
    }

    public static void main(String[] args) {
        double array1[] = {0.6, -3.3, 2.1, -4.23, 0.1, 7.8, -9.9};

        MaxMin(array1);
        MaxMin(new double[]{-545.45,4343,54,-98,7,1,-2});
    }
}
