import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class JDBC_3045 {
    private static final String URL = "jdbc:mysql://localhost:3306/java_assignment"; // Replace 'your_database' with your database name
    private static final String USER = "root"; // Replace with your database username
    private static final String PASSWORD = "root"; // Replace with your database password

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Database connected successfully!");

            // Create Student table
            //createTable(connection);

            // Insert data
            insertStudent(connection, 1, "Alice", 85);
            insertStudent(connection, 2, "Bob", 90);

            // Update data
            updateStudent(connection, 1, "Alicia", 88);

            // Delete data
            deleteStudent(connection, 2);

            // Retrieve and display all students
            displayStudents(connection);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createTable(Connection connection) throws SQLException {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS Student (id integer PRIMARY KEY, name VARCHAR(50), marks integer); ";

        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(createTableSQL);
            System.out.println("Student table created successfully.");
        }
    }

    private static void insertStudent(Connection connection, int id, String name, int marks) throws SQLException {
        String insertSQL = "INSERT INTO Student (id, name, marks) VALUES (?, ?, ?);";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setInt(3, marks);
            int rowsInserted = preparedStatement.executeUpdate();
            System.out.println(rowsInserted + " row(s) inserted.");
        }
    }

    private static void updateStudent(Connection connection, int id, String newName, int newMarks) throws SQLException {
        String updateSQL = "UPDATE Student SET name = ?, marks = ? WHERE id = ?;";
        try (PreparedStatement preparedStatement = connection.prepareStatement(updateSQL)) {
            preparedStatement.setString(1, newName);
            preparedStatement.setInt(2, newMarks);
            preparedStatement.setInt(3, id);
            int rowsUpdated = preparedStatement.executeUpdate();
            System.out.println(rowsUpdated + " row(s) updated.");
        }
    }

    private static void deleteStudent(Connection connection, int id) throws SQLException {
        String deleteSQL = "DELETE FROM Student WHERE id = ?;";
        try (PreparedStatement preparedStatement = connection.prepareStatement(deleteSQL)) {
            preparedStatement.setInt(1, id);
            int rowsDeleted = preparedStatement.executeUpdate();
            System.out.println(rowsDeleted + " row(s) deleted.");
        }
    }

    private static void displayStudents(Connection connection) throws SQLException {
        String selectSQL = "SELECT * FROM Student;";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(selectSQL)) {

            System.out.println("Student Table:");
            System.out.println("ID | Name       | Marks");
            System.out.println("-------------------------");

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int marks = resultSet.getInt("marks");
                System.out.printf("%2d | %-10s | %3d%n", id, name, marks);
            }
        }
    }
}
