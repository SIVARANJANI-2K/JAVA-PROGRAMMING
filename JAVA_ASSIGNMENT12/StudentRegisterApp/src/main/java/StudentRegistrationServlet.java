import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentRegistrationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) {
        res.setContentType("text/html");
        try (PrintWriter out = res.getWriter()) {
            // Retrieve form data
            String name = req.getParameter("name");
            int age = Integer.parseInt(req.getParameter("age"));
            String email = req.getParameter("email");
            String department = req.getParameter("department");
            double tenthPercentage = Double.parseDouble(req.getParameter("tenthPercentage"));
            double twelfthPercentage = Double.parseDouble(req.getParameter("twelfthPercentage"));
            String dob = req.getParameter("dob");
            int graduationYear = Integer.parseInt(req.getParameter("graduationYear"));

            // JDBC connection details


            String jdbcURL = "jdbc:mysql://localhost:3306/java_assignment"; // Replace with your database name
            String dbUser = "root"; // Replace with your DB username
            String dbPassword = "root"; // Replace with your DB password

            // Insert data into the database
            String sql = "INSERT INTO students (name, age, email, department, tenth_percentage, twelfth_percentage, dob, graduation_year) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
                 PreparedStatement statement = connection.prepareStatement(sql)) {

                // Set parameters
                statement.setString(1, name);
                statement.setInt(2, age);
                statement.setString(3, email);
                statement.setString(4, department);
                statement.setDouble(5, tenthPercentage);
                statement.setDouble(6, twelfthPercentage);
                statement.setString(7, dob);
                statement.setInt(8, graduationYear);

                // Execute update
                int rowsInserted = statement.executeUpdate();

                if (rowsInserted > 0) {
                    out.println("<h1>Registration Successful!</h1>");
                } else {
                    out.println("<h1>Error: Registration Failed</h1>");
                }
            } catch (Exception e) {
                e.printStackTrace();
                out.println("<h1>Error: " + e.getMessage() + "</h1>");
            }

            out.println("<a href='index.html'>Back to Registration Form</a>");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

