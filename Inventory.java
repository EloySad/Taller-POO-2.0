import java.util.ArrayList;

// Clase Inventory que maneja una lista de productos
public class Inventory {
    // Atributo privado que almacena los productos en una lista
    private ArrayList<Product> products;

    // Constructor de la clase Inventory
    public Inventory() {
        this.products = new ArrayList<>(); // Inicializa la lista de productos
    }

    // Método para añadir un producto a la lista
    public void addProduct(Product product) {
        products.add(product); // Añade el producto a la lista
    }

    // Método para eliminar un producto de la lista por su ID
    public void removeProduct(int id) {
        products.removeIf(product -> product.getId() == id); // Elimina el producto si su ID coincide
    }

    // Método para listar todos los productos en la lista
    public void listProducts() {
        for (Product product : products) { // Recorre todos los productos en la lista
            System.out.println(product); // Imprime la representación en cadena de cada producto
        }
    }

    // Método para encontrar un producto por su nombre
    public Product findProductByName(String name) {
        for (Product product : products) { // Recorre todos los productos en la lista
            if (product.getName().equalsIgnoreCase(name)) { // Compara el nombre del producto (ignorando mayúsculas/minúsculas)
                return product; // Devuelve el producto si encuentra una coincidencia
            }
        }
        return null; // Devuelve null si no encuentra ninguna coincidencia
    }

    // Método para encontrar productos por su categoría
    public ArrayList<Product> findProductsByCategory(String category) {
        ArrayList<Product> results = new ArrayList<>(); // Lista para almacenar los productos que coinciden con la categoría
        for (Product product : products) { // Recorre todos los productos en la lista
            if (product instanceof SpecificProduct) { // Verifica si el producto es una instancia de SpecificProduct
                SpecificProduct specificProduct = (SpecificProduct) product; // Realiza el casting a SpecificProduct
                if (specificProduct.getCategory().equalsIgnoreCase(category)) { // Compara la categoría del producto
                    results.add(specificProduct); // Añade el producto a la lista de resultados si coincide
                }
            }
        }
        return results; // Devuelve la lista de productos que coinciden con la categoría
    }
}
