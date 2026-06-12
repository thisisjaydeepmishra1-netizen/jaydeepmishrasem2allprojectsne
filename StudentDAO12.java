import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDAO {

    public void insertStudent(Student student) {

        try {

            Connection con =
                    DBConnection.getConnection();

            String query =
                    "INSERT INTO students VALUES(?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setInt(1, student.getId());
            ps.setString(2, student.getName());
            ps.setString(3, student.getCourse());

            ps.executeUpdate();

            System.out.println(
                    "Student Inserted Successfully"
            );

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public void displayStudents() {

        try {

            Connection con =
                    DBConnection.getConnection();

            String query =
                    "SELECT * FROM students";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ResultSet rs =
                    ps.executeQuery();

            while(rs.next()) {

                System.out.println(
                        rs.getInt("id") + " "
                      + rs.getString("name") + " "
                      + rs.getString("course")
                );
            }

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
