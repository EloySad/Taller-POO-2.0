// Clase SpecificProduct que extiende la clase Product y añade propiedades adicionales
public class SpecificProduct extends Product {
    // Atributos privados específicos de SpecificProduct
    private String category;
    private String brand;

    // Constructor de la clase SpecificProduct
    public SpecificProduct(int id, String name, double price, String category, String brand) {
        super(id, name, price); // Llama al constructor de la clase base Product
        this.category = category; // Inicializa el atributo category con el valor del parámetro category
        this.brand = brand; // Inicializa el atributo brand con el valor del parámetro brand
    }

    // Getter para el atributo category
    public String getCategory() {
        return category; // Devuelve el valor del atributo category
    }

    // Setter para el atributo category
    public void setCategory(String category) {
        this.category = category; // Asigna el valor del parámetro category al atributo category
    }

    // Getter para el atributo brand
    public String getBrand() {
        return brand; // Devuelve el valor del atributo brand
    }

    // Setter para el atributo brand
    public void setBrand(String brand) {
        this.brand = brand; // Asigna el valor del parámetro brand al atributo brand
    }

    // Método toString para representar el objeto SpecificProduct como una cadena de texto
    @Override
    public String toString() {
        return super.toString() + "\n" + "Categoría=" + category + "\n" + "Marca=" + brand;
        // Llama al método toString de la clase base Product y añade category y brand
    }
}
