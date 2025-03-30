package Q_05;


class Course {
    private String courseName;
    private String courseCode;
    private Lecturer lecturer;


    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
}


class Lecturer {
    private String lecturerName;
    private String courseTeaching;

    // Constructor
    public Lecturer(String lecturerName, String courseTeaching) {
        this.lecturerName = lecturerName;
        this.courseTeaching = courseTeaching;
    }


    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public String getCourseTeaching() {
        return courseTeaching;
    }

    public void setCourseTeaching(String courseTeaching) {
        this.courseTeaching = courseTeaching;
    }
}


class Student {
    private String studentName;
    private String degreeName;
    private String courseFollowing;


    public Student(String studentName, String degreeName) {
        this.studentName = studentName;
        this.degreeName = degreeName;
    }


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public String getCourseFollowing() {
        return courseFollowing;
    }

    public void setCourseFollowing(String courseFollowing) {
        this.courseFollowing = courseFollowing;
    }
}


public class five {
    public static void main(String[] args) {

        Lecturer lecturer = new Lecturer("Dr. Smith", "Computer Science 101");


        Course course = new Course("Computer Science 101", "CS101");
        course.setLecturer(lecturer);


        Student student1 = new Student("Alice Johnson", "Computer Science");
        student1.setCourseFollowing(course.getCourseName());

        Student student2 = new Student("Bob Williams", "Computer Science");
        student2.setCourseFollowing(course.getCourseName());


        System.out.println("=== Course Registration System ===");
        System.out.println("\nCourse Information:");
        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Course Code: " + course.getCourseCode());
        System.out.println("Lecturer: " + course.getLecturer().getLecturerName());

        System.out.println("\nRegistered Students:");
        System.out.println("1. " + student1.getStudentName() +
                " (" + student1.getDegreeName() + ") - " +
                student1.getCourseFollowing());
        System.out.println("2. " + student2.getStudentName() +
                " (" + student2.getDegreeName() + ") - " +
                student2.getCourseFollowing());
    }
}