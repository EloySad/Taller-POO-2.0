// Clase TemporaryEmployee que hereda de Employee y añade propiedad de duración del contrato
public class TemporaryEmployee extends Employee {
    private int contractDuration; // Duración del contrato en meses

    // Constructor de TemporaryEmployee
    public TemporaryEmployee(String name, int age, int employeeId, double salary, int contractDuration) {
        super(name, age, employeeId, salary); // Llama al constructor de Employee
        this.contractDuration = contractDuration;
    }

    // Getter y setter para contractDuration
    public int getContractDuration() {
        return contractDuration;
    }

    public void setContractDuration(int contractDuration) {
        this.contractDuration = contractDuration;
    }

    // Método toString para imprimir información de TemporaryEmployee
    @Override
    public String toString() {
        return super.toString() + "\nDuración contrato: " + contractDuration + " meses\n";
    }
}
