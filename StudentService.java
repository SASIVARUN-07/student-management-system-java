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
        for (Student s : list)
            System.out.println(s);
    }
}
