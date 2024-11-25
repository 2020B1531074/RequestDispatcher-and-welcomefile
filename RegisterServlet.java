package com.practice;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * RegisterServlet handles the form submission for user registration.
 * 
 * @author ARUN
 */
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Setting the content type of the response
        response.setContentType("text/html");
        
        // Getting the PrintWriter to write response
        PrintWriter out = response.getWriter();
        
        // Retrieving form data
        String name = request.getParameter("user_name");
        String password = request.getParameter("user_password");
        String email = request.getParameter("user_email");
        String gender = request.getParameter("user_gender");
        String terms = request.getParameter("terms_conditions");

        // Check if terms and conditions are accepted
        if (terms != null && terms.equals("on")) {
            // If accepted, proceed to registration success page
            out.println("<html>");
            out.println("<head><title>Registration Successful</title></head>");
            out.println("<body>");
            out.println("<h2>Registration Successful</h2>");
            out.println("<p>Welcome, " + name + "!</p>");
            out.println("<p>Email: " + email + "</p>");
            out.println("<p>Gender: " + gender + "</p>");
            out.println("</body>");
            out.println("</html>");
             RequestDispatcher rd = request.getRequestDispatcher("success"); // Replace "index.html" with your form page
            rd.forward(request, response);
        } else {
            // If not accepted, redirect to another page with a message
            out.println("<html>");
            out.println("<head><title>Registration Failed</title></head>");
            out.println("<body>");
            out.println("<h2>Registration Failed</h2>");
            out.println("<p>You have not agreed to the terms and conditions.</p>");
            out.println("<p>If you want to proceed, you must agree to the terms and conditions.</p>");
            out.println("</body>");
            out.println("</html>");

            // Redirect back to the registration form or another page
            RequestDispatcher rd = request.getRequestDispatcher("index.html"); // Replace "index.html" with your form page
            rd.include(request, response);
        }
    }
}
