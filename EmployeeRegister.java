import java.util.Scanner;

// Clase Main para interactuar con el usuario y gestionar empleados
public class EmployeeRegister {
    public static void main(String[] args) {
        EmployeeManagement management = new EmployeeManagement(); // Instancia de EmployeeManagement
        Scanner scanner = new Scanner(System.in); // Scanner para entrada de usuario

        while (true) {
            // Menú de opciones
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Añadir empleado temporal");
            System.out.println("2. Añadir empleado permanente");
            System.out.println("3. Listar empleados");
            System.out.println("4. Buscar empleado por ID");
            System.out.println("5. Eliminar empleado por ID");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int option = scanner.nextInt(); // Leer opción del usuario
            scanner.nextLine();  // Consumir la nueva línea

            // Salir del bucle si el usuario elige la opción 6
            if (option == 6) {
                break;
            }

            // Manejar las opciones del menú
            switch (option) {
                case 1:
                    // Añadir empleado temporal
                    System.out.print("Ingrese nombre: ");
                    String tempName = scanner.nextLine();
                    System.out.print("Ingrese edad: ");
                    int tempAge = scanner.nextInt();
                    System.out.print("Ingrese ID de empleado: ");
                    int tempEmployeeId = scanner.nextInt();
                    System.out.print("Ingrese salario: ");
                    double tempSalary = scanner.nextDouble();
                    System.out.print("Ingrese duración del contrato (en meses): ");
                    int duration = scanner.nextInt();
                    scanner.nextLine();
                    TemporaryEmployee tempEmployee = new TemporaryEmployee(tempName, tempAge, tempEmployeeId, tempSalary, duration);
                    management.addEmployee(tempEmployee);
                    break;
                case 2:
                    // Añadir empleado permanente
                    System.out.print("Ingrese nombre: ");
                    String permName = scanner.nextLine();
                    System.out.print("Ingrese edad: ");
                    int permAge = scanner.nextInt();
                    System.out.print("Ingrese ID de empleado: ");
                    int permEmployeeId = scanner.nextInt();
                    System.out.print("Ingrese salario: ");
                    double permSalary = scanner.nextDouble();
                    scanner.nextLine();  // Consumir la nueva línea
                    System.out.print("Ingrese departamento: ");
                    String department = scanner.nextLine();
                    PermanentEmployee permEmployee = new PermanentEmployee(permName, permAge, permEmployeeId, permSalary, department);
                    management.addEmployee(permEmployee);
                    break;
                case 3:
                    // Listar todos los empleados
                    System.out.println("Listado de empleados:");
                    management.listEmployees();
                    break;
                case 4:
                    // Buscar empleado por ID
                    System.out.print("Ingrese ID del empleado: ");
                    int searchId = scanner.nextInt();
                    scanner.nextLine();
                    Employee foundEmployee = management.findEmployeeById(searchId);
                    System.out.println(foundEmployee != null ? foundEmployee : "Empleado no encontrado");
                    break;
                case 5:
                    // Eliminar empleado por ID
                    System.out.print("Ingrese ID del empleado a eliminar: ");
                    int removeId = scanner.nextInt();
                    scanner.nextLine();
                    management.removeEmployee(removeId);
                    System.out.println("Empleado eliminado");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }

        scanner.close(); // Cerrar el scanner
    }
}
