package Lessons.Lesson5.Method;

public class Methods2 {
    //создадим метод внутри метода
    int summa(int a, int b, int c, int e) {
        int res = a + b + c + e;
        return res;
    }

    int sredneeArif(int a, int b, int c, int e) {
        int Cv = summa(a, b, c,e) / 3;
        return Cv;
    }
}
class Test1 {
    public static void main(String[] args) {
        Methods2 Frr = new Methods2();//название конструктора всегда совпадает с именем класса.
        System.out.println(Frr.sredneeArif(20,33,61,40));
        //здесь действует правило - последний в очереди - первый выйдет. Как с книгой, если лежит стопка книг,ту,которую
        //мы положили последней сможем взять в след.раз первой. А та,первая книга,которая в самом низу - мы сможем
        //взять её последней,пока не уберем предыдущие. То есть: метод sredneeArif несможет начать выполнять действие,пока
        //метод summa(который внутри метода sredneeArif) не закончит своё.
    }
}
