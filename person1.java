package program_3;

public class person1 {
    public static void main (String[] args) {
        // Hardcoded input using constructors
        String name = "Shraddha";
        String dob = "2005-10-13"; 
        int empId = 270;
        double salary = 50000.75;
        Employee emp = new Employee (name, empId, salary);
        emp.displayEmployeeDetails();
        emp.displayAge(dob);
}
}