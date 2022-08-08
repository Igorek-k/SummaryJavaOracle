package Homework.Homework7;

public class Employee{

    protected int id ;
    String name;
    public String surname;
    int age;
    private double salary;
    String department;

    public void first (String surname,int age,String department){
        surname = surname;
        age = age;
        department = department;
    System.out.println(surname + " "+age+ " "+ department);
    }

    public void second (String surname,int age,String department){
        surname = surname;
        age = age;
        department = department;
        System.out.println(surname + " "+age+ " "+ department);
    }

public void thirtd (String surname,int age,String department){
        surname = surname;
        age = age;
        department = department;
        System.out.println(surname + " "+age+ " "+ department);
        }
        public Employee(int age,String surname){
        age = 27;
        surname = "trr";
        }
        private Employee(int a,String surname,double salary) {
            this(28, "ivanov");
            salary = salary;
            salary = 15.9;
        }
        Employee (String name){
        name = name;
        }

}

class Totrrtiki {
    public static void main(String[] args) {

        Employee emp = new Employee("Vanya");
        Employee emp1 = new Employee(37,"Vanisimus");
        //Employee emp2 = new Employee (56,"Kirka",87.30); ошибка из-за modifier private
       emp.name="IY";

        emp1.age = 32;
        emp1.surname = "TY";

        emp1.first("yuu",45,"ITt");
        emp.second("ew",44," e");
    }
}