package Homework.Homework6;

public class Student {
    int numberStudak;  //Переменные создающиеся вне методе main называются instance.
    String name;
    String Surname;
    String year;
    double Matematicks;
    double Economy;
    double foreingLanguage;
    double arifmeticks;

    Student(int numberStudak,String name,String Surname,String year,double Matematicks,double Economy,
            double foreingLanguage,double arifmeticks){
        numberStudak = numberStudak;
        name=name;
        Surname=Surname;
        year=year;
        Matematicks=Matematicks;
        Economy= Economy;
        foreingLanguage= foreingLanguage;
        arifmeticks=arifmeticks;
        System.out.println("Id: "+ numberStudak + "; Name: "+ name + "; Surname: "+ Surname +
                "; Cours: "+ year + "; Math score: " + Matematicks + "; Economy score: "+ Economy+
                "; English score: "+ foreingLanguage + "; Arithmetic mean by subjects: "+ arifmeticks);
    }
    Student(int numberStudak,String name,String Surname,String year){
        this(numberStudak,name,Surname,year,0.0,0.0,0.0,0.0);
        System.out.println("Id: "+ numberStudak + "; Name: "+ name + "; Surname: "+ Surname +
                "; Cours: "+ year);
    }
    Student(){

    }


    double srednyaArif (Student st){
        double Arif = (st.Matematicks+st.Economy+st.foreingLanguage)/3;
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

        Student r = new Student();
        Student r1 = new Student(789,"Katya","Novik","4-th",Girlfriend.Matematicks,
                Girlfriend.Economy, Girlfriend.foreingLanguage,Girlfriend.srednyaArif(Girlfriend));
        Student r2 = new Student(794,"Igor","Ivanov","5-th");

    }
}






