package Homework.Homework8;

public class Pokko {
    public static String pok = "hey"; //не касаеться этого дз,создана для лекции 10.
    public int l10 = 232; //не касаеться этого дз,создана для лекции 10.
   public static int count;
    static int count1;
    static int count2;
    static int count3;
    static int count4;
    static double ploshadresult;
    static double dlinaresult;
   public static final double Pi = 3.14;
    static double radiuss;

    static int firstr(int  a,int b,int c){
        count++;
        int result = a*b*c;
        return result;
    }
    static void second(double a,double b){
        count1++;
      double r = a/b;
      System.out.println("Result delenia dvuh chisel: " + r+ " Method # "+ count1);
        System.out.println("Celoe chastnoe: "+r+". Ostatok: "+ a%b);
        System.out.println();
    }

    void third(double radius){
        count2++;
        radiuss = radius;
         double ploshad = Pi * radius * radius;
        ploshadresult = ploshad;
        System.out.println("Ploshad kruga nahoditcya po formule: Pi*radius*radius");
        System.out.println("Ploshad kruga = "+ploshad+ ". Pri radiuse: "+ radius+ ". Formula ispolzovana "+ count2 +
                "raz");
        System.out.println();

    }
   public static void fourth(double radius){
        count3++;
        double ploshad = 2*Pi*radius;
        Pokko jk = new Pokko();
        dlinaresult = ploshad;
        System.out.println("Dlina okrujnosti nahoditcya po formule: 2*Pi*radius");
        System.out.println("Dlina okrujnosti = "+ploshad+ ". Pri radiuse: "+ radiuss+ ". Formula ispolzovana "+ count3 +
                "raz");
        System.out.println();
    }
    void fifth(double radius){
        count4++;
        Pokko hr = new Pokko();
        System.out.println("Radius okrujnosti: "+ radiuss + ". Ploshad kruga: "+ploshadresult+ ". Dlina okrujnosti: " +
                dlinaresult);
        System.out.println("Info vivodilos na ekran "+count4+" raz");
        System.out.println();
    }

}
class PokkoTest{
    public static void main(String[] args) {
        Pokko g = new Pokko();

       System.out.println(Pokko.firstr(10,5,2)+ " "+ Pokko.count+ " raz method ispolzovalsya");

        System.out.println(Pokko.firstr(5,5,2)+" "+ Pokko.count+" raza method ispolzovalsya");

        Pokko.second(100.5,50.5);

        g.second(200.5,20.0);



        g.third(28);

        Pokko.fourth(g.radiuss);

        g.fifth(g.radiuss);

        System.out.println(g.radiuss);








    }
}
