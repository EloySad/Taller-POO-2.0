// Clase Product que representa un producto con id, nombre y precio
public class Product {
    // Atributos privados de la clase
    private int id;
    private String name;
    private double price;

    // Constructor de la clase Product
    public Product(int id, String name, double price) {
        this.id = id; // Inicializa el atributo id con el valor del parámetro id
        this.name = name; // Inicializa el atributo name con el valor del parámetro name
        this.price = price; // Inicializa el atributo price con el valor del parámetro price
    }

    // Getter para el atributo id
    public int getId() {
        return id; // Devuelve el valor del atributo id
    }

    // Setter para el atributo id
    public void setId(int id) {
        this.id = id; // Asigna el valor del parámetro id al atributo id
    }

    // Getter para el atributo name
    public String getName() {
        return name; // Devuelve el valor del atributo name
    }

    // Setter para el atributo name
    public void setName(String name) {
        this.name = name; // Asigna el valor del parámetro name al atributo name
    }

    // Getter para el atributo price
    public double getPrice() {
        return price; // Devuelve el valor del atributo price
    }

    // Setter para el atributo price
    public void setPrice(double price) {
        this.price = price; // Asigna el valor del parámetro price al atributo price
    }

    // Método toString para representar el objeto Product como una cadena de texto
    @Override
    public String toString() {
        return "\n" + "Producto" + "\n" + "ID:" + id + "\n" + "Nombre:" + name + "\n" + "Precio=" + price;
        // Devuelve una cadena que describe el objeto Product con sus atributos
    }
}
