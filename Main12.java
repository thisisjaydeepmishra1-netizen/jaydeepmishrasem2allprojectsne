public class Main {

    public static void main(String[] args) {

        StudentDAO dao =
                new StudentDAO();

        Student student =
                new Student(
                        101,
                        "Rahul Sharma",
                        "Computer Science"
                );

        dao.insertStudent(student);

        System.out.println(
                "\nStudent Records:"
        );

        dao.displayStudents();
    }
}
