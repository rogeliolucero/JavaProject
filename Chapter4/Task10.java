package Chapter4;

class Student {
    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

   
    public void FullName() {
        System.out.println(this.firstName + " " + this.lastName);
    }
}

public class Task10 {
    public static void main(String[] args) {
        Student[] students = new Student[]{
            new Student("Rogelio", "Lucero"),
            new Student("Jemuel", "Lucero"),
            new Student("Lurenz", "Aviles"),
        };

        for (Student s : students) {
            s.FullName();
        }
    }
}