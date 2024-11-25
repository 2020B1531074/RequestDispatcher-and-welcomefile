/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practice;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * SuccessServlet handles the response for successful registration.
 * 
 * @author ARUN
 */
public class SuccessServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Set the content type of the response
        response.setContentType("text/html");
        
        // Get the PrintWriter to write the response
        PrintWriter out = response.getWriter();
        
        // Write the success message
        out.println("<html>");
        out.println("<head><title>Registration Successful</title></head>");
        out.println("<body>");
        out.println("<h2>Registration Successful</h2>");
        out.println("<p>Congratulations! You have successfully registered.</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
