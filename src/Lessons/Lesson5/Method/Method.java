package Lessons.Lesson5.Method;

public class Method {
    //Метод - это функция, он совершает действия.

    /*Структура метода:
      public static void main(String[]args){our code}
      public - access modifier (не обязательная часть написания)
      static - Non-access modifier (s) (не обязательная часть,метод может сущевствовать и без нее)
      void(пустота) - return type, то,что возвращает наш метод,что являеться его output-ом,обязательный элемент в методе
      main - имя метода, обязательная часть, имя можем задавать какое нам угодно
      () - то ,что заключено в круглых скобках - параметры,мы можем оставить их пустыми, а можем заполнить
      [] - то ,что заключено в квадратных скобках - параметры,мы можем оставить их пустыми, а можем заполнить
      {} - body (тело метода)  в фигурных скобках заключен наш код,мы описываем его логику
     */

    //Мы можем создать метод один раз и вызывать его неограниченное кол-во раз:
    //Создадим метод ,который будет сумировать наши значения:
    int summa(int a, int b, int c, int e, int f) {  //int = тип параметров,переменной с которыми будем работать
        // "summa" -имя метода,называю так, как хочу. ()- все,что в скобочках параметры, тип и имя.
        //через запятую мы можем перечеслять несколько параметров

        int result = a + b + c + e + f;  //результат у нас тоже будет типом int,так что его и указываем
        // result - просто имя

        return result; // return - возращение результата,вернули нашу переменную методу. Это последнее выражение,
        //оно должно всегда находиться на последнем месте, после него ничего нельзя писать.

        //вывод на экран и output не одно и тоже. Output - то,что имеем мы на руках,после того,как метод завершает обработку

        //тип данных указаного в методе и тип данных,который мы возвращаем всегда должны быть одинаковыми!Если будет
        //другой тип - метод работать не будет.
    }

}

class Method1 {
    public static void main(String[] args) { //что бы использовать наш созданный метод,его нужно вызвать в методе main
        Method t = new Method();//что бы применить метод из прошлого класса-необходимо создать объект вызовом конструктора
        //ВЫЗОВ метода:
        int Far = t.summa(1, 2, 3, 0, 5);
        // int - тип метода, Far = имя. Мы вызываем его таким способ(в этом примере) ,что бы смогли вывести на экран.
        //t- имя переменной конструктора, summa - название нашего метода, () - в скобочках задаем числа (аргументы) подходящим
        // к параметрам метода. Если в параметрах метода тип int, то и аргументы должны быть такого же типа.

        //компилятор ищет метод по его имени, по кол-ву параметров (если мы укажем 3 параметра,а значений 5 метод не найдеться)
        //и по его типу. Что бы все подходило.

        //если запустить программу мы ничего не увидем,т.к не было команды вывести на экран. Но компилятор все посчитал,
        //просто не показал нам.
        System.out.println(Far);// ответ 11
        System.out.println(t.summa(1, 0, 1, 0, 4));// еще один способ вывести на экран метод. Можно
        //менять аргументы на другие,это не имеет  значения.
    }
}
