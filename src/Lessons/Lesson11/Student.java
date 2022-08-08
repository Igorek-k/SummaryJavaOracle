package Lessons.Lesson11;

public class Student {
   public  String name;
    public int cours;
   public  double grade;


  public  Student(String name,int course,double grade){
        this.name=name;
        this.cours=course;
        this.grade=grade;
    }
    public static void swap(Student s1, Student s2){ //в параметр подставились копии этого метода, все изменения с ними
        Student s3 = s1;   //произошедшие в этом методе сойдут на нет, как только метод закончиться.
        s1 = s2;
        s2=s3;
        System.out.println(s1.name); //result Petr. Копии поменялись местами и они работают, но к оригиналам отношения
                    //не имеют.
    }
    //Когда мы подставляем референс тип данных в параметр метода, подставляется не сам референс,а его копия.!!!!!!!!!!
    public static void ChangeName(Student s2){
        s2.name = "Vasilkovka";
        /* Наша копия s2* и оригинл s2 ссылаються на один и тот же объект. Соответсвенно s2* меняет имя у самого объекта
        * именно по этому,когда копия s2* исчезает ,то s2 ссылаеться на уже измененный объект.
         */
    }
//с помощью копий мы можем изменять имя,но с помощью копий мы не можем менять референсы на объекты
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 3, 9.5);
        Student st2 = new Student("Petr", 1, 5.7);
        //методом swap мы хотели поменять местами ссылки st1 и st2.То есть что бы имя st1 = Petr, a st2 = Ivan.
        swap(st1,st2);
        System.out.println(st1.name); //Мы ожидаем, что результат будет Petr. Но результат Ivan.
        System.out.println(st2.name); // а вот здесь Petr.
        //Но в самом методе, где мы оперируем копиями referents данных все сработало,и если вывести на экран внутренность
        //метода все сработает как нам нужно. Но копии тут же перестают существовать после окончания метода, так как
        //они локальные, а оригинальный referents вообще ни как не изменился.
         ChangeName(st2);
        System.out.println(st2.name); //все сработала, результат Vasilkovka. Объект поменял свое значение,а все остальное
            //осталось прежним.

        //С помощью копий мы можем менять, изменять какие-то элементы объекта, но мы не можем менять сам объект!
    }
}


