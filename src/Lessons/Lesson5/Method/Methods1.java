package Lessons.Lesson5.Method;

public class Methods1 {
    //создадим для примера еще три метода:
    String color;
    String engine;
    int speed;
    String brand;

    int gaz(int skorost) { //сначала пишем тип данных ,который будет возвращать метод (первый int),имя метода
        //() - тип параметра(второй int), имя параметра.
        speed += skorost; //увлечиваем speed  на skorost
        return speed; // Возвращаем значение
    }

    int tormoz(int skorost) {
        speed -= skorost;
        return speed;
    }
    //В следующим методе мы хотим сделать,что бы метод показывал информацию о машине( тек.скорость,цвет,марка и тд)
    //То есть нам output не нужен,если нам он не нужен начинаем метод с "void"
    void CarInfo () {
        System.out.println("cvet mashini: "+color+"; motor: "+engine+"; marka: "+brand+"; skorost: "+speed);
    }
}

class Test{
    public static void main(String[] args) {
        Methods1 g =new Methods1();
        g.color="black";
        g.engine="V12";
        g.brand="Porshe";
        g.speed = 80;
        //вызываем метод:
        g.CarInfo(); //метод без проблем выводим на экран то,что мы задали ему выше
        g.gaz(20); //метод увеличит нашу скорость на аргумент в ().
        g.CarInfo();// используем тот же метод вывода,что бы увидеть изменения.
        g.tormoz(100);//метод уменьшит нашу скорость на аргумент в ().
        g.CarInfo();
        //это простенькие методы, они не идеальны, к примеру если в torvoz написать значение 110,то скорость будет -10
        //чего в реале не может быть.
    }
}

