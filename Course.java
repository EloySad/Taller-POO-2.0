import java.util.ArrayList;

// Clase que representa un curso
public class Course {
    // Propiedades del curso
    private String code;
    private String name;
    private ArrayList<Student> studentList;

    // Constructor de la clase Course
    public Course(String code, String name) {
        this.code = code;
        this.name = name;
        this.studentList = new ArrayList<>();
    }

    // Getters y setters para las propiedades del curso
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    // Método para inscribir un estudiante en el curso
    public void enrollStudent(Student student) {
        studentList.add(student);
    }

    // Representación en cadena del curso
    @Override
    public String toString() {
        return "\nCurso \nCodigo: " + code + "\nNombre=" + name + "\nLista de estudiantes=" + studentList ;
    }
}
