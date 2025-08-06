public class Student {
    private String name;
    private int studentId;

    
    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + studentId);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Alice", 1001);

        student1.displayInfo();
    }
}

