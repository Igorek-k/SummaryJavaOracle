package Lessons.Lesson8.static_NaM;

public class Student { //static бывают для переменных и методов,особенность в том,что они пренаджелат всему классу
    //а не отдельному объекту.
    String name;
    int course;
    int count;
    public Student (String name,int course){
       count++; // создаем внутри конструктора
        name = name;
        course = course;
        System.out.println("Student # "+ count +" sozdan");
    }

}

class StidentTest{
    public static void main(String[] args) {
        //Допустим перед нами стоит задача добавить в этот класс еще одну переменную,которая всегда будет увеличиваться на 1
        //при создании нового студента,то есть данная переменная будет считать сколько студентов уже создано
    //создаем студентов
        Student st1 = new Student("Ivan",1);
        Student st2 = new Student("Petr",4);
        Student st3 = new Student("Masha",3);
        //результат будет:
       // Student # 1 sozdan
       // Student # 1 sozdan
       // Student # 1 sozdan
        //А все потому,что инстанс переменная count имеет дефолт значение, в конструкторе мы указали увелечение числа+1
        //И при каждом создании конструктора дефолт знач.(0) меняеться на 1.
        //Мы не можем с помощью этого кода увеличивать count как бы мы хотели,нет,оно будет увеличиваться с 0 на 1,ведь
        //при создании объекта count = 0 для каждого объекта и при создании он увеличиваеться на 1.

        //теперь нам нужна такой count ,который не будет принадлежать частному объекту,она должна принадлежать классу.
        //добавляем static перед count и переменная становиться не object variables, a class variables:
    }
}


 class Student1 {
     String name;
     int course;
     static final int gh = 10;//очень распространное сочитаение. Общий для объектов,но значение нельзя поменять.
     static int count; //добавляем статик для того,что бы переменная count стала классовой переменной и увеличивала

     //значение при создании каждого объекта
     public Student1(String name, int course) {
         count++; // создаем внутри конструктора
         name = name;
         course = course;
         System.out.println("Student # " + count + " sozdan");
     }


     //Так же можно применять static и для методов,что бы после их можно было вызывать без создания объекта:
     public static void ShowCount() {
         System.out.println("Vsego sozdano studentov: " + count);
     }

     public static void main(String[] args) {

         //вызываем созданный нами выше метод без создания объекта:
         ShowCount();
     }
 }
class StidentTest1 {
    public static void main(String[] args) {

        Student1 st1 = new Student1("Ivan", 1);
        Student1 st2 = new Student1("Petr", 4);
        Student1 st3 = new Student1("Masha", 3);

        //Если перед переменной стоит static она принадлжеит всему классу и являеться общей для всех объектов. Она
        //не являеться собстенностью какого-то объекта или всех объектов , она являеться собственностью класса и к ней
        //могут обращаться и изменять её любой объект класса.

        System.out.println(Student1.count); //из-за особенности static компилятор нам позволяет запись в подобном виде.
        //То есть без создания объекта класса. Результат будет 3. Даже если мы используем с объектом:
        System.out.println(st1.count);
        System.out.println(st2.count);
        System.out.println(st3.count);
        //во всех случаях результат будет "3", т.к. созданно на данный момент три таких объекта.

        //с дефолт значения для static все как обычно. Если int = 0, если String = null.

        //Можно использовать static final
//        static final int gh = 10; Его значение нельзя поменять и он общий для всех объектов

    }
}