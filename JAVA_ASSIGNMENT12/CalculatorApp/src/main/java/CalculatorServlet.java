import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        try {
            res.setContentType("text/html");
            PrintWriter out = res.getWriter();

            // Retrieve form parameters
            String num1Str = req.getParameter("num1");
            String num2Str = req.getParameter("num2");
            String operation = req.getParameter("operation");

            // Validate inputs
            double num1 = Double.parseDouble(num1Str);
            double num2 = Double.parseDouble(num2Str);
            double result = 0;

            // Perform calculation
            switch (operation) {
                case "add":
                    result = num1 + num2;
                    break;
                case "subtract":
                    result = num1 - num2;
                    break;
                case "multiply":
                    result = num1 * num2;
                    break;
                case "divide":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        out.println("<h2>Error: Division by zero is not allowed.</h2>");
                        return;
                    }
                    break;
                default:
                    out.println("<h2>Error: Invalid operation selected.</h2>");
                    return;
            }

            // Display the result
            out.println("<h1>Calculation Result</h1>");
            out.println("<p>" + num1 + " " + operation + " " + num2 + " = " + result + "</p>");
            out.println("<a href='index.html'>Back to Calculator</a>");
        } catch (NumberFormatException e) {
            res.getWriter().println("<h2>Error: Invalid input. Please enter numbers only.</h2>");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
