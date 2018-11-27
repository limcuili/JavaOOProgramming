public class Student {

    private String name;
    private final int number; // student number should not be allowed to change, hence the 'final'

    public Student(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public void print() {
        System.out.println("student number: " + number + ", name: " + name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public static void main (String[] args) {
        Student student1 = new Student("Cui Li", 1);
        Student student2 = new Student("Tristan", 2);

        student1.print(); // expect 'student number: 1, name: Cui Li'
        student2.print(); // expect 'student number: 2, name: Tristan'

        student1.setName("Not Cui Li");
        student1.print(); // expect 'student number: 1, name: Not Cui Li'
    }

}