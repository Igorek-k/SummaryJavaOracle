package Lessons.Lesson27.Error;

public class Test {
//*        Error
//* Error – это очень серьёзные ошибки, которые не могут быть напрямую контролированные вашей программой.
//* Error-ы могут быть объявлены, но объявлять error-ы считается глупой практикой. Некоторые error-ы могут быть
// обработаны, но это тоже будет очень глупой затеей. Error-ы, как и runtime исключения считаются unchecked.
        static void abc(){  //рекурсия - метод вызывает сам себя до бесконечности. Рекурсивный метод
            System.out.println("Hello");
            abc();
        }

    public static void main(String[] args) {
//        abc(); //Рекурсивный метод. Stack переполнился и закончилась память и выкинет ошибку: StackOverflowError

        //Конечно такую ошибку тоже можно обработать и объявить
        try{abc();}
        catch(StackOverflowError e){
            System.out.println("Error poyman");
        }  //НО НИКОГДА НЕ СТОИТ НИ ОБРАБАТЫВАТЬ, НИ ОБЪЯВЛЯТЬ ERROR И RUN_TIME_EXCEPTIONS!
    }
    }

