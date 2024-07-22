// Clase que representa a un estudiante
public class Student {
    // Propiedades del estudiante
    private int id;
    private String name;
    private String email;

    // Constructor de la clase Student
    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getters y setters para las propiedades del estudiante
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Representación en cadena del estudiante
    @Override
    public String toString() {
        return "\nEstudiante \nID: " + id + "\nNombre: " + name + "\nEmail: " + email;
    }
}

