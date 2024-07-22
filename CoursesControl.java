import java.util.Scanner;

public class CoursesControl {
    public static void main(String[] args) {
        CourseManagement courseManagement = new CourseManagement();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Añadir curso");
            System.out.println("2. Inscribir estudiante en curso");
            System.out.println("3. Listar estudiantes en curso");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            if (option == 4) {
                break;
            }

            switch (option) {
                case 1:
                    System.out.print("Ingrese código del curso: ");
                    String courseCode = scanner.nextLine();
                    System.out.print("Ingrese nombre del curso: ");
                    String courseName = scanner.nextLine();
                    Course course = new Course(courseCode, courseName);
                    courseManagement.addCourse(course);
                    break;
                case 2:
                    System.out.print("Ingrese código del curso: ");
                    String enrollCourseCode = scanner.nextLine();
                    System.out.print("Ingrese ID del estudiante: ");
                    int studentId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese nombre del estudiante: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Ingrese email del estudiante: ");
                    String studentEmail = scanner.nextLine();
                    Student student = new Student(studentId, studentName, studentEmail);
                    courseManagement.enrollStudentInCourse(enrollCourseCode, student);
                    break;
                case 3:
                    System.out.print("Ingrese código del curso: ");
                    String listCourseCode = scanner.nextLine();
                    courseManagement.listStudentsInCourse(listCourseCode);
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }

        scanner.close();
    }
}
