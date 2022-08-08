package Lessons.Lesson6;
//                 Return type может быть одинаковый и различный:
public class MethodOverloading2 {
    int sum (int a, int a1){
        return a + a1;
    }

    String sum (String s1, String s2){
        return s1 + s2;
    }
}

class MethodOverloading2Tesr{
    public static void main(String[] args) {
        MethodOverloading2 mO =  new MethodOverloading2();

        int a = mO.sum(4,7);
        System.out.println(a);

        String s = mO.sum("good ","boy");
        System.out.println(s);
    }

}
//Overloading так же может иметь разные и одинаковые access modifier (public,private, protected и тд
//Overloading тогда и только тогда, когда метод имеет одинаковое имя и разные параметры.Ничего больше на них не влияет
//ни Return type, ни access modifier

//Метода отличающиеся только access modifier и Return type не являются Overloading. Будет ошибка компилятора:
//  public int sum (int a, int a1)
//  private int sum (int a, int a1)  - ошибка!
