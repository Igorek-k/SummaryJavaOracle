package Lessons.Lesson1.Cycle_No_Lesson.Cycle_for;

public class Cycle_for {
    public static void main(String[] args) {
        for (int i = 0;i<=10;i=i+2) {    // в "()" три блока. Принцип как у while.
            System.out.println("Hello "+i); // i++ == i = i+1 (true)
            // i = 0 - первый блок - та переменная,которая будет меняться с каждой террацией цикла
            // i<=10 - второй блок - условие ( должно быть true иначе не выполниться) - до какх пор
            //будет выполняться цикл.
            // i=i+2 - третий блок - какое дейсвтие выпонляеться каждую террацию цикла.

        }
    }
}

