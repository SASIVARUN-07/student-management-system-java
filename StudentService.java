import java.util.*;

public class StudentService {
    ArrayList<Student> list = new ArrayList<>();
    void addStudent(Student s) {
        list.add(s);
    }
    void searchbyid(int id) {
        for (Student s : list) {
            if (s.id == id) {
                System.out.println(s);
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }
    void updateStudent(int id, String newName, String newBranch) {
        for (Student s : list) {
            if (s.id == id && newName != null ) {
                s.name = newName;
                s.branch = newBranch;
                System.out.println("Student with ID " + id + " updated.");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }
    void duplicateidcheck(int id) {
        for (Student s : list) {
            if (s.id == id) {
                System.out.println("Duplicate ID found: " + id);
                return;
            }
        }
        System.out.println("No duplicate ID found for: " + id);
    }
    void deletestudent(int id) {
        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            if (s.id == id) {
                it.remove();
                System.out.println("Student with ID " + id + " deleted.");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }
    void display() {
        Collections.sort(list, (s1, s2) -> Integer.compare(s1.id, s2.id));
        for (Student s : list)
            System.out.println(s);
    }
}
