package Homework.Homework4;

public class Homework_4 {
}
class Student {
    int numberStudak;  //Переменные создающиеся вне методе main называются instance.
    String name;
    String Surname;
    String year;
    float Matematicks;
    float Economy;
    float foreingLanguage;
    float arifmeticks;

}

class StudentTest{
    public static void main(String[] args) {
        Student Me = new Student();
        Student Friend = new Student();
        Student Girlfriend = new Student();

        Me.numberStudak = 7854;
        Me.name = "Igor";
        Me.Surname = "Stupalov";
        Me.year = "4-th years";
        Me.Matematicks = 4.1f;
        Me.Economy = 5.0f;
        Me.foreingLanguage = 4.8f;
        Me.arifmeticks = (Me.Matematicks+Me.Economy+Me.foreingLanguage)/3F;

        Friend.numberStudak = 9352;
        Friend.name = "Andrey";
        Friend.Surname = "Kirkorov";
        Friend.year = "3-th years";
        Friend.Matematicks = 3.8f;
        Friend.Economy = 3.5f;
        Friend.foreingLanguage = 3.1f;
        Friend.arifmeticks = (Friend.Matematicks+Friend.Economy+Friend.foreingLanguage)/3F;

        Girlfriend.numberStudak = 7989;
        Girlfriend.name = "Ekaterina";
        Girlfriend.Surname = "Novickaya";
        Girlfriend.year = "4-th years";
        Girlfriend.Matematicks = 4.9f;
        Girlfriend.Economy = 5.0f;
        Girlfriend.foreingLanguage = 5.0f;
        Girlfriend.arifmeticks = (Girlfriend.Matematicks+Girlfriend.Economy+Girlfriend.foreingLanguage)/3F;

        System.out.println("Igor's arithmetic mean score: " + Me.arifmeticks);
        System.out.println("Andrew arithmetic mean score: " + Friend.arifmeticks);
        System.out.println("Ekaterina's arithmetic mean score: " + Girlfriend.arifmeticks);




    }
}
