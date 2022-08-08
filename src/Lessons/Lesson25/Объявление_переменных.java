package Lessons.Lesson25;

public class Объявление_переменных {
    //Можно объявлять так:
    int a, b =3 ,c,d=b+5;
    int a2, b2 =3 ,c2,d2=a2+5;

//    int a3, b3 =3, c3 = 10 - d3, d3 = 7;  Так писать нельзя, т.к. d3 объявили позже, чем попытались отнять

    public static void main(String[] args) {
        Объявление_переменных g = new Объявление_переменных();
        System.out.println(g.d); //result: 8
        System.out.println(g.d2); // result: 5
    }
}
