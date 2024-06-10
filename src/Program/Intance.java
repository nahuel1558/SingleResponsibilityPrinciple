package Program;

import Model.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nahue
 */
public class Intance {

    public static List<Employee> employees = new ArrayList<>();

    public static void instancing() {
        employeeInitiations();
    }

    public static void employeeInitiations() {
        employees.add(new Employee("Employee 1", "Position 1", 11, "email_11@gmail.com"));
        employees.add(new Employee("Employee 2", "Position 2", 22, "email_22@gmail.com"));
        employees.add(new Employee("Employee 3", "Position 3", 33, "email_33@gmail.com"));
        employees.add(new Employee("Employee 4", "Position 4", 44, "email_44@gmail.com"));
    }
}
