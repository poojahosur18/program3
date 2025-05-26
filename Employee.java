package program_3;

public class Employee extends person {
    private int empId;
    private double salary;

    public Employee(String name, int empId, double salary) {
        super(name);
        this.empId = empId;
        this.salary = salary;
    }
     public void displayEmployeeDetails() {
        displayPersonName();
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: $" + salary);
    }
}