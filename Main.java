public class Main {
    public static void main(String[] args) {
        StudentService ss = new StudentService();
        ss.addStudent(new Student(1, "Alex", "CSE"));
        ss.addStudent(new Student(2, "Carry", "EEE"));
        ss.addStudent(new Student(3, "Bumrah", "MECH"));
        ss.display();
        ss.searchbyid(2);
        ss.deletestudent(1);
        ss.display();
        ss.updateStudent(3, "Virat", "ECE");
        ss.display();
    }
}
