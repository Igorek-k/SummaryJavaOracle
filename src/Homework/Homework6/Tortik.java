package Homework.Homework6;

public class Tortik {



    int summa (int a,int b,int c,int e,int f){
        int T = a+b+c+e+f;
        System.out.println(T);
        return  T ;
    }
    int summa (int a,int b,int c,int e){
        int R = a+b+c+e;
        System.out.println(R);
        return  R;
    }
    int summa (int a,int b,int c){
        int RR = a+b+c;
        System.out.println(RR);
        return  RR = a+b+c;
    }
    int summa (int a,int b){
        int TY = a+b;
        System.out.println(TY);
        return  TY ;
    }
    int summa (int a){
        int RT = a;
        System.out.println(RT);
        return  RT ;
    }

    int summa (){
        int TU = 0;
        System.out.println(TU);
        return TU = 0;
    }
}


class TortikTest {
    public static void main(String[] args) {

        Tortik t = new Tortik();
        t.summa();
        t.summa(0);

        t.summa(4, 0);

        t.summa(6, 0, 0);

        t.summa(0, 8, 1, 0);

        t.summa(1, 0, 8, 0, 1);


    }
}