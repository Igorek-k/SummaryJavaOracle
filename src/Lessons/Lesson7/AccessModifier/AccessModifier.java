package Lessons.Lesson7.AccessModifier;

public class AccessModifier {
//Access Modifier существуют для скрытия информации между классами. Что бы,к примеру,пользователь не видел лишнее,
    //а видел результат.

    //Существуют 4 контроллеров доступа: public , private , defoult , protected.

    //public (публичный) - их область видимости абсолютно все классы текущего пакета или же других. Можем вызывать
    //другие классы,конструкторы,методы  из этого пакета,из подпакетов и тд.


    //private(приватный) - область видимости - класс,в котором и был создан. Другие классы и уж тем более пакеты
    //не увидят его ,не запустят.
    private void summ(int a, int b, int c) { //этот метод будет работать только в данном классе,в других же уже не будет.
        int result = a + b + c;
        System.out.println(result);
    }
}

class Testik{
    AccessModifier yui = new AccessModifier();
    //   yui.summ(1,2,3); даже в текущем файле,просто другого класса наш метод private не виден.

}

//defoult Access Modifier (дефолтный) - это когда ничего не пишется перед классом,методом . То есть нет никакого
//Access Modifier:  к примеру как class Testik - ничего не пишеться ,его не видно - он дефолтный.
//Область видимости все классы внутри текущего пакета.


//protected - объектно ориентированный контроллер доступа. Сама Джава,как язык,тоже объектно ориентирована.
//Область видимости как и у дефолтного : Область видимости все классы внутри текущего пакета ++ "дети" класса как в
//текущем пакете, так и в других.

//У всешних классов есть : defoult and public Access Modifier
//у конструкторов,методов,переменных есть все 4 типа Access Modifier:  public , private , defoult , protected.

//У переменных,которые создаються внутри методов Access Modifier нет! Такие переменные называются "локальными". Они
//созданы внутри метода,работают внутри метода и умирают внутри метода.
