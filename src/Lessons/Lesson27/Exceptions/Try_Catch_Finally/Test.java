package Lessons.Lesson27.Exceptions.Try_Catch_Finally;

public class Test {

    //Try - попытка написания программы / кода
//Catch - блок, который ловит ошибки и исключения, что бы их исправить. При этом может либо не давать продолжить работу
// программы, либо разрешить работу программы.
//Finally - вне зависимости будут ошибки и исключения или нет обеспечивает обработку всего кода. Код написанный в теле
// Finally всегда будет выполняться.
    public static void main(String[] args) {
        int[] array = {1, 4, 8};
        System.out.println("We have a massive.");
        try {  //мы пытаемся выполнить эту часть кода
            System.out.println(array[5]); //мы запрашиваем 5-тый элемент, которого не существует.
            System.out.println("Vsem horoshego dnya!");
        } catch (
                ArrayIndexOutOfBoundsException e) {  //если мы словим исключение типа ArrayIndexOutOfBoundsException, то
            System.out.println("Мы поймали исключение!" + e); //выводим на экран эту строку
        } finally {
            System.out.println("Этот код будет всегда обрабатываться!");
        }

        System.out.println("Данный код не имеет отношения к исключениям!");
    }
}
