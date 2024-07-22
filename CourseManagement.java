import java.util.ArrayList;

// Clase que gestiona los cursos y las inscripciones de estudiantes
public class CourseManagement {
    // Lista de cursos
    private ArrayList<Course> courseList;

    // Constructor de la clase CourseManagement
    public CourseManagement() {
        this.courseList = new ArrayList<>();
    }

    // Método para agregar un curso a la lista
    public void addCourse(Course course) {
        courseList.add(course);
    }

    // Método para inscribir un estudiante en un curso específico
    public void enrollStudentInCourse(String courseCode, Student student) {
        for (Course course : courseList) {
            if (course.getCode().equalsIgnoreCase(courseCode)) {
                course.enrollStudent(student);
                return;
            }
        }
        System.out.println("Curso no encontrado: " + courseCode);
    }

    // Método para listar los estudiantes inscritos en un curso específico
    public void listStudentsInCourse(String courseCode) {
        for (Course course : courseList) {
            if (course.getCode().equalsIgnoreCase(courseCode)) {
                System.out.println("Estudiantes inscritos en el curso " + courseCode + ":");
                for (Student student : course.getStudentList()) {
                    System.out.println(student);
                }
                return;
            }
        }
        System.out.println("Curso no encontrado: " + courseCode);
    }
}
