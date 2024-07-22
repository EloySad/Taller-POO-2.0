import java.util.ArrayList;
import java.util.Scanner;

// Clase principal que controla el sistema de inventario
public class InventoryControl {
    public static void main(String[] args) {
        // Crear una instancia de Inventory para gestionar los productos
        Inventory inventory = new Inventory();
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Bucle infinito para mostrar el menú de opciones
        while (true) {
            // Mostrar el menú de opciones
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Añadir producto genérico");
            System.out.println("2. Añadir producto específico");
            System.out.println("3. Listar productos");
            System.out.println("4. Buscar producto por nombre");
            System.out.println("5. Buscar productos por categoría");
            System.out.println("6. Eliminar producto por ID");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            // Leer la opción seleccionada por el usuario
            int option = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea

            // Salir del bucle si el usuario selecciona la opción 7
            if (option == 7) {
                break;
            }

            // Menu principal con switch
            switch (option) {
                case 1:
                    // Añadir un producto genérico
                    System.out.print("Ingrese ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese nombre: ");
                    String name = scanner.nextLine();
                    System.out.print("Ingrese precio: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    Product product = new Product(id, name, price);
                    inventory.addProduct(product);
                    break;
                case 2:
                    // Añadir un producto específico
                    System.out.print("Ingrese ID: ");
                    int specificId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese nombre: ");
                    String specificName = scanner.nextLine();
                    System.out.print("Ingrese precio: ");
                    double specificPrice = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Ingrese categoría: ");
                    String category = scanner.nextLine();
                    System.out.print("Ingrese marca: ");
                    String brand = scanner.nextLine();
                    SpecificProduct specificProduct = new SpecificProduct(specificId, specificName, specificPrice, category, brand);
                    inventory.addProduct(specificProduct);
                    break;
                case 3:
                    // Listar todos los productos
                    System.out.println("Listado de productos:");
                    inventory.listProducts();
                    break;
                case 4:
                    // Buscar un producto por su nombre
                    System.out.print("Ingrese nombre del producto: ");
                    String searchName = scanner.nextLine();
                    Product foundProduct = inventory.findProductByName(searchName);
                    System.out.println(foundProduct != null ? foundProduct : "Producto no encontrado");
                    break;
                case 5:
                    // Buscar productos por su categoría
                    System.out.print("Ingrese categoría: ");
                    String searchCategory = scanner.nextLine();
                    ArrayList<Product> categoryResults = inventory.findProductsByCategory(searchCategory);
                    for (Product prod : categoryResults) {
                        System.out.println(prod);
                    }
                    break;
                case 6:
                    // Eliminar un producto por su ID
                    System.out.print("Ingrese ID del producto a eliminar: ");
                    int removeId = scanner.nextInt();
                    scanner.nextLine();
                    inventory.removeProduct(removeId);
                    System.out.println("Producto eliminado");
                    break;
                default:
                    // Opción no válida
                    System.out.println("Opción no válida");
                    break;
            }
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
