package Lessons.Lesson27.Exceptions.Try_Catch_Finally;

import java.io.*;

public class Test1 {

//* Несколько catch блоков могут следовать за try блоком, но лишь 1 finally блок может следовать за catch блоками.
//* Одновременно вы можете использовать все 3 типа блоков или по 2: try блок с catch блоком/ами;
//   try блок с finally блоком. По отдельности блоки использовать невозможно.
//* Последовательность блоков всегда должна соответствовать следующему порядку: try --> catch --> finally
//* finally блок выполняется вне зависимости от того выбросилось исключение или нет.

    public static void main(String[] args) {
        File f = new File("text1.txt");
        try {   //может быть только один блок                                               / обязательный блок
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Vsem horoshego dnya!");
        } catch (FileNotFoundException e) {   // может быть несколько блоков              / обязательный блок
            System.out.println("Мы поймали исключение!" + e);
        } catch (NullPointerException e) {   // может быть несколько блоков
            System.out.println("Мы поймали исключение!" + e);
        } finally {  //может быть только один блок                                       /  не обязательный блок
            System.out.println("Этот код будет всегда обрабатываться!");
        }

        System.out.println("Данный код не имеет отношения к исключениям!");
    }
}

