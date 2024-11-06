
import java.util.ArrayList;

class Teacher {

    private int id;
    private String name;
    private ArrayList<Course> courses = new ArrayList<>();

    public Teacher(int id, String name) {
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
                return;
            }
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }
}
