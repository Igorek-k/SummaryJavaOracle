package Homework.Homework30;

import java.util.ArrayList;
import java.util.function.*;

public class TestEmployee {
    public static void printEmployee(Employee e) {
        System.out.println("Name Employee: " + e.name + " Department: " + e.depatrment + " Salary: " + e.salary);
    }

    public static void filtraciaRabotnikov(ArrayList<Employee> eL, Predicate<Employee> eP) {
        for (Employee e : eL) {
            if (eP.test(e)) {
                printEmployee(e);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> eL = new ArrayList<>();
        Employee emp1 = new Employee("Kolya", "IT", 400);
        Employee emp2 = new Employee("Egor", "Egor", 230);
        Employee emp3 = new Employee("Egor", "Egor", 450);
        Employee emp4 = new Employee("Nikita", "IT", 100);
        Employee emp5 = new Employee("MARK", "MARK", 1000);

        eL.add(emp1);
        eL.add(emp2);
        eL.add(emp3);
        eL.add(emp4);
        eL.add(emp5);

        filtraciaRabotnikov(eL, emp -> emp.depatrment.equals("IT") && emp.salary > 200);
        System.out.println("-------------------------------------------------------------");
        filtraciaRabotnikov(eL, emp -> emp.name.startsWith("E") && emp.salary != 450);
        System.out.println("-------------------------------------------------------------");
        filtraciaRabotnikov(eL, emp -> emp.name.equals(emp.depatrment));


    }
}
