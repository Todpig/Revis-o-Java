
import java.util.ArrayList;

class Enterprise<T extends Employee> {

    ArrayList<T> employees = new ArrayList<>();

    public void addEmployee(T employee) {
        employees.add(employee);
    }

    public void displayEmployees() {
        for (T employee : employees) {
            System.out.println(employee.calculateSalary());
        }
    }
}
