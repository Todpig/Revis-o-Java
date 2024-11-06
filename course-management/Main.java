
import java.util.ArrayList;

class Main {

    private static ArrayList<Teacher> teachers = new ArrayList<>();
    private static ArrayList<Student> students = new ArrayList<>();
    private static ArrayList<Course> courses = new ArrayList<>();

    public static void enrollStudent(Student student, Course course) {
        student.addCourse(course);
    }

    public static void assignTeacher(Teacher teacher, Course course) {
        teacher.addCourse(course);
    }

    public static void addCourse(Course course) {
        courses.add(course);
    }

    public static void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public static void addStudent(Student student) {
        students.add(student);
    }

    public static ArrayList<Student> showStudentsInCourse(Course course) {
        ArrayList<Student> studentsInCourse = new ArrayList<>();
        for (Student student : students) {
            for (Course studentCourse : student.getCourses()) {
                if (studentCourse.getId() == course.getId()) {
                    studentsInCourse.add(student);
                }
            }
        }
        return studentsInCourse;
    }

    public static ArrayList<Course> showCoursesAssignedTeacher(Teacher teacher) {
        ArrayList<Course> coursesAssignedTeacher = teacher.getCourses();
        return coursesAssignedTeacher;
    }

    public static void initializeData() {
        Course course1 = new Course(1, "Matemática", 6);
        Course course2 = new Course(2, "História", 12);
        Course course3 = new Course(3, "Física", 4);
        Course course4 = new Course(4, "Química", 12);
        Course course5 = new Course(5, "Literatura", 6);

        addCourse(course1);
        addCourse(course2);
        addCourse(course3);
        addCourse(course4);
        addCourse(course5);

        Teacher teacher1 = new Teacher(1, "Prof. Silva");
        Teacher teacher2 = new Teacher(2, "Prof. Santos");

        addTeacher(teacher1);
        addTeacher(teacher2);

        Student student1 = new Student(1, "Ana");
        Student student2 = new Student(2, "Bruno");
        Student student3 = new Student(3, "Carla");
        Student student4 = new Student(4, "Daniel");
        Student student5 = new Student(5, "Elisa");

        addStudent(student1);
        addStudent(student2);
        addStudent(student3);
        addStudent(student4);
        addStudent(student5);

        assignTeacher(teacher1, course1);
        assignTeacher(teacher1, course2);
        assignTeacher(teacher2, course3);
        assignTeacher(teacher2, course4);

        enrollStudent(student1, course1);
        enrollStudent(student2, course2);
        enrollStudent(student3, course3);
        enrollStudent(student4, course4);
        enrollStudent(student5, course5);
    }

    public static void main(String[] args) {
        initializeData();
        Course course = courses.get(0);
        Teacher teacher = teachers.get(0);
        ArrayList<Student> studentsInCourse = showStudentsInCourse(course);
        ArrayList<Course> coursesAssignedTeacher = showCoursesAssignedTeacher(teacher);
        System.out.println("Alunos no curso " + course.getName() + ":");
        for (Student student : studentsInCourse) {
            System.out.println(student.getName());
        }
        System.out.println("Cursos do professor " + teacher.getName() + ":");
        for (Course teacherCourse : coursesAssignedTeacher) {
            System.out.println(teacherCourse.getName());
        }
    }
}
