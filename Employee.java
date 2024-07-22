// Clase Employee que hereda de Person y añade propiedades específicas
public class Employee extends Person {
    private int employeeId;
    private double salary;

    // Constructor de Employee
    public Employee(String name, int age, int employeeId, double salary) {
        super(name, age); // Llama al constructor de Person
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Getter y setter para employeeId
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    // Getter y setter para salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Método toString para imprimir información de Employee
    @Override
    public String toString() {
        return super.toString() + "\nID empleado: " + employeeId + "\nSalario: " + salary;
    }
}

