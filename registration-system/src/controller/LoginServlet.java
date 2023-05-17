package com.javamaster.controller;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Validate the user's credentials against the database
        boolean isValidUser = validateCredentials(username, password);

        if (isValidUser) {
            // Create a session and set an attribute to indicate that the user is logged in
            HttpSession session = request.getSession();
            session.setAttribute("username", username);

            // Redirect to a protected resource
            response.sendRedirect("home.jsp");
        } else {
            // Display an error message
            request.setAttribute("errorMessage", "Invalid username or password");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }

    private boolean validateCredentials(String username, String password) {
        // Database connection details
        String jdbcUrl = "jdbc:postgresql://localhost:5432/dobjjfpsocsdd";
        String dbUsername = "ofaifliuhobekd";
        String dbPassword = "d055b9cfabe18bff995ebb10e8880b8733164a74c37691af2b02cf80a7b40710";

        try {
            // Load the PostgreSQL JDBC driver
            Class.forName("org.postgresql.Driver");

            // Establish a connection to the database
            Connection connection = DriverManager.getConnection(jdbcUrl, dbUsername, dbPassword);

            // Prepare the SQL statement
            String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);

            // Execute the query
            ResultSet resultSet = statement.executeQuery();

            // Check if a matching record exists
            boolean isValidUser = resultSet.next();

            // Close resources
            resultSet.close();
            statement.close();
            connection.close();

            return isValidUser;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}
