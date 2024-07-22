// Clase base Person con propiedades básicas de nombre y edad
public class Person {
    private String name;
    private int age;

    // Constructor de Person
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter y setter para name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter y setter para age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Método toString para imprimir información de Person
    @Override
    public String toString() {
        return "\n----Empleado---- \nNombre: " + name + "\nEdad: " + age;
    }
}
