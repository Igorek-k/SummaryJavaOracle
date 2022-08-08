package Homework.Homework19;
//
//Создайте метод abc, инпут параметр которого – N-ое
//        количество массивов типа String. В методе создайте новый
//        массив, который будет состоять из элементов массивов-
//        параметров и будет оутпутом данного метода. В методе main
//        вызовите метод abc и его элементам, которые равны
//        значениям command line параметров, присвойте значение
//        null. Выведите элементы обновлённого массива на экран.
//        Везде, где возможно, используйте foreach loop.
//        Запустите приложение с командной строки.
public class Homework {


    public static String[] abc(String[]... array1) { // ... - можно записать как []. То есть String []... двумерный массив.
        int length = 0; // изначально мы не знаем какой будет длинны этот массив,
        // но перед тем как создавать его мы должны определиться с длиной массива по этому создаем со значением 0.
        for (String[] array2 : array1) {
            length += array2.length; //Будем суммировать длинны всех массивов, которые будем указывать в параметре
        }
        String[] target = new String[length]; //создаем массив с длиной length.
        int count = 0;
        for (String[] array2 : array1) {
            for (String s : array2) {
                target[count] = s; //Присваиваем массиву target определнное значение - "s"
                count++; //идекс каждого последующего элемента массива target

            }
        }
        return target;
    }

    public static void main(String[] args) {
        String[] target = abc(new String[]{"ok", "privet", "poka"}, new String[]{"ok", "Hello", "buy"});
        //создаем массив,который является отпутом метода abc.

        for (String s : args) {
            for (int i = 0; i < target.length; i++) {
                if (s.equals(target[i])) { //Если написать наоборот target[i].equals(s) возможна
                    // Exceptions: ArrayIndexOutOfBoundsExceptions из-за  target[i] = null;
                    target[i] = null;
                }
            }
        }
        for(String s: target){
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
