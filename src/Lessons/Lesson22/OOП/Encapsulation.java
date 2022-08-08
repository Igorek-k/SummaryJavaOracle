package Lessons.Lesson22.OOП;

public class Encapsulation {
    //Представим,что название класса "человек"
    final String pol;              //создали final переменную pol

    Encapsulation(String pol) {     //задали её значение в конструкторе
        this.pol = pol;
    }

    private boolean clever;

    public boolean isClever() {            //Для  boolean вместо get принято называть is. Метод set здесь так же.
        return clever;
    }

    private String name;            //Ограничеваем видимость,что бы на прямую не могли влиять на переменные

    public String getName() {       //Что бы мы могли в дальнейшем работать с переменной name создаем паблик методы
        return name;                //getName - будет позволять видеть имя.
    }

    public void setName(String s) {   //setName будет позволять задавать имя
        name = s;                     // Таким образом мы сделали Encapsulation для переменной name. С 11 по 19 строку.
    }

    private int vozrast;

    public int getVozrast() {
        return vozrast;
    }

    public void setVozrast(int i) {
        if (i > 0) {                        //возраст не может быть отрицательным (-25) и тд. Ограничиваем выбор.
            vozrast = i;
        }
    }

    private int ves;

    public int getVes() {
        return ves;
    }

    public void setVes(int i) {          //вес так же не может быть отрицательным
        if (i > 0) {
            ves = i;
        }
    }
    //Для имени,возраста и веса мы сделали Encapsulation. На переменные на прямую повлиять нельзя,но можно через методы
    // управлять выводить и задавать значения.
}

class Test {
    public static void main(String[] args) {
        Encapsulation e = new Encapsulation("male");   //Указываем пол в конструкторе
        e.setName("Kolya");  //С помощью метода setName задаем значения.
        e.setVozrast(25);
        e.setVes(57);

        System.out.println(e.getName());        //С помощью метода getName выводим значения.
        System.out.println(e.getVozrast());
        System.out.println(e.getVes());

//  Encapsulation
//  * Сокрытие данных, защита их от внешнего
//        нежелательного вмешательства, помещение их в «капсулу».

//  * Характеризуется private переменными и public
//        методами get и set, которые нередко проверяют какие - либо условия.

//  * Если return type метода get –это mutable тип
//        данных, то лучше возвращать его копию.
    }
}
