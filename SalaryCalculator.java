import java.util.Scanner;

class Employee {
    private String name;
    private String employeeID;
    private double salary;
    private double bonusPercentage;

    public Employee(String name, String employeeID, double salary, double bonusPercentage) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
        this.bonusPercentage = bonusPercentage;
    }

    public double calculateTotalSalary() {
        return salary + (salary * bonusPercentage / 100);
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee's Details : ");
        System.out.println("Name : " + name);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Base Salary: " + salary);
        System.out.println("Bonus Percentage: " + bonusPercentage + "%");
        System.out.println("Total salary : " + calculateTotalSalary());
    }
}

public class SalaryCalculator {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
        
       System.out.println("Enter employee name: ");
       String name = scanner.nextLine();

       System.out.println("Enter employee ID: ");
       String employeeID = scanner.nextLine();

       System.out.println("Enter base salary: ");
       double salary = scanner.nextDouble();

       System.out.println("Enter bonus percentage: ");
       double bonusPercentage = scanner.nextDouble();

        Employee employee = new Employee(name, employeeID, salary, bonusPercentage);
        employee.displayEmployeeInfo();

        scanner.close();

    }

}