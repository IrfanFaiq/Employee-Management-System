package day1.InterfaceExercise;

import java.util.ArrayList;

interface Employee {
    void displayDetails();
    double getSalary();
}

class Manager implements Employee{

    private String name;
    private String ID;
    private double salary;
    private String department;

    //constructor
    public Manager(String name, String ID, double salary, String department) {
        this.name = name;
        this.ID = ID;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public void displayDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("ID: " + ID);
        System.out.println("Salary: RM" + salary);
        System.out.println("Department: " + department);
    }

    @Override
    public double getSalary() {
        return salary;
    }
}

class Developer implements Employee{

    private String name;
    private String ID;
    private double salary;
    private String programmingLanguage;

    //constructor
    public Developer(String name, String ID, double salary, String programmingLanguage) {
        this.name = name;
        this.ID = ID;
        this.salary = salary;
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("ID: " + ID);
        System.out.println("Salary: RM" + salary);
        System.out.println("Department: " + programmingLanguage);
    }

    @Override
    public double getSalary() {
        return salary;
    }
}

public class InterfaceTstUseArrayList {
    public static void main(String[] args) {

        //create array of employee use arrayList
        ArrayList<Employee> employees = new ArrayList<>();

        // Populate the ArrayList with instances of Manager and Developer
        employees.add(new Manager("Danish", "321", 4000.0, "Femboy"));
        employees.add((new Developer("Danish2", "920", 320, "Microsoft excel")));

        //Iterate over the ArrayList to display each employee
        double totalSalary = 0; //create local var for totalSalary
        for (Employee employee : employees){
            employee.displayDetails();
            totalSalary += employee.getSalary();
            System.out.println(); //print empty line
        }

        //display total salary
        System.out.println("Total salary of all salary is: RM" + totalSalary);
    }
}
