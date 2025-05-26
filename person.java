package program_3;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
public class person {

    protected String name;

    public person(String name) {
        this.name = name;
    }

    public void displayPersonName() {
        System.out.println("Name: " + name);
    }

    public void displayAge(String dob) {
        LocalDate birthDate = parseDate(dob);
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthDate, currentDate);
        System.out.println("Age: " + age.getYears() + " years");
    }

    private LocalDate parseDate(String dob) {
        DateTimeFormatter formatter;
        if (dob.matches("\\d{2}-\\d{2}-\\d{4}")) {
            formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        } else if (dob.matches("\\d{4}-\\d{2}-\\d{2}")) {
            formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        } else {
            throw new IllegalArgumentException("Invalid date format.");
        }
        return LocalDate.parse(dob, formatter);
    }
}