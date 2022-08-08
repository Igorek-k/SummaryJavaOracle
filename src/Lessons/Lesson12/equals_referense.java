package Lessons.Lesson12;

public class equals_referense {
    //Когда мы пытаемся прировнять реферс типых данных:
    /* Car c1 = new Car();
       Car c2 = new Car();
       c1 == c2; - false. Мы приравниваем не сами объекты этих типов,а их адресса. А адреса все разные,если они не
                                  ссылаются на один и тот же объект.
       Car c3 = c1;
       c3 == c1; - true, c3 and c1 ссылаются на один объект и адреса соответственно одинаковые.
     --------------------------------------
     Для того,что бы сравнивались именно объекты сущесвтует метод equals,но  он существует и так всегда по дефолту.

     Отношение метода equals к реферс String:
     * Равными считаются те объекты String,у которых кол-во букв одинаковое и совпадают по порядку меэжу собой.

     String s1 = new String("abc");
     String s2 = new String("abc");
     s1==s2; - false, ведь адреса разные! (логическая ошибка)
     s1.equals(s2); - true,мы вызываем метод equals и в параметр метода подставляем второе наше значение.
                      тогда уже сравниваються сами объекты,а не их адреса.
         ----------------------------------
         String st1 = new String("Hello");
         String st2 = new String("Hello");
         if(st1 == st2)
         {our code}
         result: Logical error.
         ---------------------------------------------------------------------
         String st1 = new String("Hello");
         String st2 = new String("Hello");
         if(st1.(equals(st2))
         {our code}
         result: Work ok.
         ----------------------------------------------------------------------
         Для всех объектов созданные нами (Car,Student и тд) мы должны метод equals писать сами.Что с чем сранивнивать
                        это наш класс,мы его создали и самии пишем метод под наше усмотрение.
     */
}

class Test11{
    void Maximum(int i1,int i2, int i3){
        if(i1>i2 && i1 > i3){
//       int a = 10;   эта локальная переменная видна только в скобках if.
            System.out.println("Maximym - "+i1);
        }
        else if(i2>i1 && i2>i3){
//        int a = 15;     эта локальная переменная видна только в скобках else if.
            System.out.println("Maximym - "+i2);
        }
        else {
//        int a = 85;     эта локальная переменная видна только в скобках else .
            System.out.println("Maximym - "+i3);
        }
    }

    public static void main(String[] args) {
        Test11 t = new Test11();
        t.Maximum(4,7,0);

    }
}

class  TernaryOperators{
    void abc(){
        String str;
        int a = 10;
        if(a>=10){
            str = ("Privet");
        }
        else if(a<10){
            str = ("Poka");
        }
        else {   //если  else не будет в данном случае,то
            str = "PrivetPoka";
        }
        System.out.println(str); // здесь будет ошибка компиляции (str неопределна),т.к. джава думает,что возможен
        //вариант, где не if ,не  else if не подойдут. И нужно добавить else и присвоить переменной хотя бы null.
    }

    public static void main(String[] args) {
        int a=20;
        int b = 15;
        int maximum = (a<b)?a:b;
        //(boolean expression) ? (if true) : (if false)
        System.out.println(maximum); //result "b" - false.
        //Грубо говоря упрощенный метод иф. Создаем переменную,пишем условие + знак вопроса.
        //Далее если правда,пишем первое значение , двоеточие, если лож,второе значение.
    }
}
