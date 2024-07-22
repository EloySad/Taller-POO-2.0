import java.util.ArrayList;

// Clase EmployeeManagement para gestionar una lista de empleados
public class EmployeeManagement {
    private ArrayList<Employee> employees;

    // Constructor de EmployeeManagement
    public EmployeeManagement() {
        this.employees = new ArrayList<>();
    }

    // Método para añadir un empleado a la lista
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Método para eliminar un empleado de la lista por ID
    public void removeEmployee(int employeeId) {
        employees.removeIf(employee -> employee.getEmployeeId() == employeeId);
    }

    // Método para listar todos los empleados
    public void listEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    // Método para encontrar un empleado por ID
    public Employee findEmployeeById(int employeeId) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId() == employeeId) {
                return employee;
            }
        }
        return null;
    }
}
