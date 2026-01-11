public class Main {
    public static void main(String[] args) {
        StudentService ss = new StudentService();
        ss.addStudent(new Student(1, "Alex", "CSE"));
        ss.addStudent(new Student(2, "Carry", "EEE"));
        ss.display();
    }
}
