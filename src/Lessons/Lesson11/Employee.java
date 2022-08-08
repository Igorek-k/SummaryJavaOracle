package Lessons.Lesson11;

public class Employee {
    public String  name;
    public  double  salary;
    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public double uvelichitel (double a){ //этот метод увеличит зарплату для нужной нам переменной и все. Если после
         a = a*2;                    //срабатывания метода мы захотим вывести salary - значение будет только таким
        return a;                  //какой мы укажем в конструкторе. В этом методе мы работаем не с самой
         //переменной зарплаты,а только с её значением. Пример ниже.
    }

    public double zp2 (){     //теперь внутри метода мы работаем с самой зарплатой, а не внутри её метода.
        salary = salary *2; //То есть после метода при попытки вывести на экран salary , то ёё значение останеться
        return salary;   // результат этого метода.
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ivan",100.55);
        double d = emp1.uvelichitel(emp1.salary);
        System.out.println(d); //result 201.1
        System.out.println(emp1.salary); //result 100.55
        emp1.zp2();
        System.out.println(emp1.salary);
    }
}
//когда мы подставляем примитивный тип данных в параметр его метода - мы подставляем его только значение.
//Когда мы используем притивный тип данных в параметре метода ,мы ьудем использовать не саму переменную,а лишь её
   //значение. В данном случае число(100.55).Когда будем работать с переменной типа char мы будем использовать
   //просто символ.

//Аргументы методов 2-х типов: referense and primitive.