package Lessons.Lesson8.static_NaM;

public class Studentt {

        String name;
        int course;
        static int count;
        int a;


        public Studentt(String name, int course) {
            count++; // создаем внутри конструктора
            name = name;
            course = course;
            System.out.println("Student # " + count + " sozdan");
        }



        public static void ShowCount() {
            System.out.println("Vsego sozdano studentov: " + count);
        }

        public void showInfo(){
            System.out.println("Welcome to the student class!!");
        }
        void abc(){
         a++;                              //мы можем в не статичном методе вызвать не статичную переменную."a"no static
         count++;                    //увеличить статичную переменную мы тоже можем
        }
        static void abcd(){ //статичный метод может создаваться и запускать без каких либо объектов
        count++;      //statik переменую мы можем увеличить
//      a++;         //no static уже не можем,ошибка. Ведь что бы использовать нестатичную переменную нужно создать объект:
            Studentt st5 = new Studentt("Petr",5);//мы использовали уже созданный конструктор с двумя параметрами
            st5.a++;   //теперь ,когда объект создан,мы можем увеличивать не статичную переменную в статичном методе
            //правило: нет объекта - нет инстанс переменной!
        }
    public static void main(String[] args) {
            abcd(); //мы можем без объекта вызывать статичный метод,так как он пренадлежит не объекту ,а классу
//            abc(); //мы не можем без создания объекта вызвать не статичный метод,т.к он принадлежит конкретному объекту
        Studentt st1 = new Studentt("Петрушка",3);
        st1.abc(); //после создания объекта теперь мы можем вызвать не статичный метод,т.к. он принадлежит теперь объекту
        // st1.
    }
}
