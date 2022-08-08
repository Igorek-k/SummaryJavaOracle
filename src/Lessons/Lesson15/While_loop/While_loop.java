package Lessons.Lesson15.While_loop;

public class While_loop {
    //В While loop мы не знаем заранее кол-во повторений.
    /* Синтаксис :

    while (condition) {    * condition - условие - должно быть либо true, либо false.
    Statement 1;           * Если true - все, что в теле обрабатывается.
    Statement 2;           * Если false - все, что в теле не обрабатывается, loop finish.
    ..............
    Statement n;
    }

     */
    public static void main(String[] args) {
        int i =1;
        while (i<=10){
            System.out.println(i); //так выглядит while,хоть и не логично его использовать для вывода на экран от 1 до 10
            i++;
        }
        System.out.println(i); //но если после цикла попытаться вывести на экран i, она уже будет = 11;
    }

}

class Test{
    public static void main(String[] args) {
        int a =1;
        boolean b = true;
        while(b){
            System.out.println(a);
            if(a%3==0 && a%7==0){
                b = false;
            }
            a++;
        }

        int money = 100;
        while(money>0){
            System.out.println("Your Balance: "+ money);
            System.out.println("Place your bet ");
            System.out.println("Your losse!");
            money-=13;
            System.out.println("Your balance: "+money);
            System.out.println();
        }

        while (a==5); //минимальная реализация, которая ничего не делает.
    }
}
