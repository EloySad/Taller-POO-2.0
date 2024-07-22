// Clase PermanentEmployee que hereda de Employee y añade propiedad de departamento
public class PermanentEmployee extends Employee {
    private String department;

    // Constructor de PermanentEmployee
    public PermanentEmployee(String name, int age, int employeeId, double salary, String department) {
        super(name, age, employeeId, salary); // Llama al constructor de Employee
        this.department = department;
    }

    // Getter y setter para department
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Método toString para imprimir información de PermanentEmployee
    @Override
    public String toString() {
        return super.toString() + "\nDepartamento:" + department;
    }
}
