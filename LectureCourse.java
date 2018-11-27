public class LectureCourse {

    private Student[] students; // array of students enrolled in the course.
    private int registered = 0; // number of registered students.
    private final String name; // name of course doesn't change, hence it is final.

    // Initialize with course title and class size.
    public LectureCourse (int size, String name) {
        this.name = name;
        students = new Student[size];
    }

    // taking Student class and its methods from Student.java
    public void register (Student student){
        if (registered < students.length) { // class not full
            students[registered] = student; // add student to list
            registered++; // increase number of registered students.
        }
    }

    public void print() {
        System.out.println("Course" + name + ": ");
        for (int i =0; i<registered; i++) {
            students[i].print();
        }
    }

    public static LectureCourse createCourse(String[] names) {
        LectureCourse c = new LectureCourse(names.length, "MA407");
        for (int i = 0; i < names.length; i++) {
            Student student = new Student(names[i], 1000 + i);
            c.register(student);
        }
        return c;
    }

    public static void main (String[] args) {
        if (args.length > 0) {
            LectureCourse course = createCourse(args);
            course.print();
        }
    }

}