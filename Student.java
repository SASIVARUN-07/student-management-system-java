public class Student {
    int id;
    String name;
    String branch;

    Student(int id, String name, String branch) {
        this.id = id;
        this.name = name;
        this.branch = branch;
    }

    public String toString() {
        return id + " " + name + " " + branch;
    }
}
