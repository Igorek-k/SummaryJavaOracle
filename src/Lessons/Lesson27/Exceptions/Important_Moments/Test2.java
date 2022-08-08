package Lessons.Lesson27.Exceptions.Important_Moments;

import java.io.*;

public class Test2 {
//* finally блок выполняется даже в том случае, если в try блоке или в catch блоке имеется return statement.
//* finally блок не выполнится толко в том случае, если вы прекращаете работу программы с помощью System.exit в try блоке
// или в catch блоке или же, если происходит крушение JVM или, например, операционной системы.
//* Если return statement имеется и в catch блоке, и в finally блоке, то оутпутом метода будет возвращаемое значение
// из finally блока

//*Если return statement в catch блоке возвращает primitive data type, то в finally блоке вы его изменить не сможете.
// Если return statement в catch блоке возвращает reference data type, то в finally блоке вы его сможете изменить
//(естественно, если тип mutable).

    static int abc() {
        int a = 5;
        try {
            File f = new File("text.txt");
            FileInputStream fis = new FileInputStream(f);
//            return 5;
        } catch (FileNotFoundException e) {
            System.out.println("Exceptions poyman");
            System.out.println("Znachenia variables -a- v catch blocke: " + a);
            return a;
        } finally {  //finally срабатывает первее всех return statement
            //Но предыдущие return statement при срабатывании создают копию и если data type immutable то блок finally
            //не повлияет на результат вывода, если не имеет в себе собственного return statement
            a = 10;
            System.out.println("Its block finally!");
            System.out.println("Znachenia variables -a- v finally blocke: " + a);
//            return 7;  //если в finally есть return оно всегда будет финальным и решающим!
        }
        return a;

    }

    static StringBuilder def() {
        StringBuilder a = new StringBuilder("privet");
        try {
            File f = new File("text.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("Exceptions poyman");
            System.out.println("Znachenia variables -a- v catch blocke: " + a);
            return a;
        } finally {
            a.append("!!!");
            System.out.println("Its block finally!");
            System.out.println("Znachenia variables -a- v finally blocke: " + a);
        }
        return a;

    }

    public static void main(String[] args) {
        System.out.println(abc());
        System.out.println(def());
    }
}
