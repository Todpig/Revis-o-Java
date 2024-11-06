
import java.util.ArrayList;

class Student {

    private int id;
    private String name;
    private ArrayList<Course> courses = new ArrayList<>();

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(int courseId) {
        for (Course course : courses) {
            if (course.getId() == courseId) {
                courses.remove(course);
                break;
            }
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public int getId() {
        return id;
    }

}
