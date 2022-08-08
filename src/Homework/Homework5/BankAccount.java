package Homework.Homework5;

public class BankAccount {
    int id= 5;
    String name= "Ivan";
    double balance=120;
    double popolnenieScheta(double a ){
        System.out.println(balance);
        balance += a;
        System.out.println(balance+" - увеличенная зп на задданое число.");
        return  balance;
    }
    double  snyatieSoScheta(double b){
        System.out.println(balance);
        balance -= b;
        System.out.println(balance + " - уменьшенная зп на задданое число.");
        return  balance;
    }





}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount MyBank = new BankAccount();
        BankAccount HisBank = new BankAccount();
        BankAccount YouBank = new BankAccount();



        MyBank.id = 1101;
        MyBank.name = "Ivan";
        MyBank.balance = 986.7;

        HisBank.id = 1154;
        HisBank.name = "Nastya";
        HisBank.balance = 568.1;

        YouBank.id = 1234;
        YouBank.name = "Lena";
        YouBank.balance = 432.1;

        MyBank.popolnenieScheta(13.6);
        HisBank.popolnenieScheta(200 );
        YouBank.popolnenieScheta(20.5 );

        MyBank.snyatieSoScheta(11.3);
        HisBank.snyatieSoScheta(43.9);
        YouBank.snyatieSoScheta(22.1 );
    }
}
class Student {
    int numberStudak;  //Переменные создающиеся вне методе main называются instance.
    String name;
    String Surname;
    String year;
    double Matematicks;
    double Economy;
    double foreingLanguage;
    double arifmeticks;
    double srednyaArif (Student st){
        double Arif = (st.Matematicks+st.Economy+st.foreingLanguage)/3F;
        System.out.println(Arif);
        return Arif;
    }


}

class StudentTest {
    public static void main(String[] args) {
        Student Me = new Student();
        Student Friend = new Student();
        Student Girlfriend = new Student();
        //оценка по 5-бальной шкале
        Me.numberStudak = 7854;
        Me.name = "Igor";
        Me.Surname = "Stupalov";
        Me.year = "4-th years";
        Me.Matematicks = 4.1;
        Me.Economy = 5.0;
        Me.foreingLanguage = 4.8;


        Friend.numberStudak = 9352;
        Friend.name = "Andrey";
        Friend.Surname = "Kirkorov";
        Friend.year = "3-th years";
        Friend.Matematicks = 3.8;
        Friend.Economy = 3.5;
        Friend.foreingLanguage = 3.1;


        Girlfriend.numberStudak = 7989;
        Girlfriend.name = "Ekaterina";
        Girlfriend.Surname = "Novickaya";
        Girlfriend.year = "4-th years";
        Girlfriend.Matematicks = 4.9;
        Girlfriend.Economy = 5.0;
        Girlfriend.foreingLanguage = 5.0;

        Me.srednyaArif(Me);
        Friend.srednyaArif(Friend);
        Girlfriend.srednyaArif(Girlfriend);

    }
}

class Employee{
    Employee(int a5, String b5, String c5, int e5, double f5, String g5 ){
        id1=a5;
        name1=b5;
        surname1=c5;
        age1=e5;
        salary=f5;
        department=g5;
        System.out.println("Id: "+a5+"; Name: "+b5+"; Surname: "+c5+"; Age: "+ e5+ "; Salary: "+f5+"$"+"; Department: "+g5+
                ".");
    }
    int id1 ;
    String name1;
    String surname1;
    int age1;
    double salary;
    String department;

    double Bigsalary(double A){
        double Bgl = A*2;
        System.out.println(Bgl + " - удвоенная зп.");
        return Bgl;
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee Tolik = new Employee(745,"Anatoliy","Ivanov",41 ,48000.5,"Technology study");
        Employee Oleg = new Employee(1982,"Oleg","Smolka",27,1500.3,"metallurgy");

        Tolik.Bigsalary(Tolik.salary);
        Oleg.Bigsalary(Oleg.salary);
    }
}


