import java.util.*;

public class StudentService {
    ArrayList<Student> list = new ArrayList<>();

    void addStudent(Student s) {
        list.add(s);
    }

    void display() {
        for (Student s : list)
            System.out.println(s);
    }
}
