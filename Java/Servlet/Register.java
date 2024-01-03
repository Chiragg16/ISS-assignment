package com.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/regForm")
public class Register extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/registerloginservlet", "root", "12345");

            PreparedStatement preparedStatement = connection.prepareStatement("insert into users(username, email, password) values(?,?,?)");

            preparedStatement.setString(1, username);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, password);

            int count = preparedStatement.executeUpdate();

            if (count > 0) {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/profile.jsp");
                dispatcher.include(request, response);
            } else {
                response.setContentType("text/html");
                out.print("<h3> Registration Failed</h3>");

                RequestDispatcher dispatcher = request.getRequestDispatcher("/register.jsp");
                dispatcher.include(request, response);
            }
        } catch (Exception e) {
            response.setContentType("text/html");
            out.print("<h3> Registration Failed Exception " + e.getMessage() + "</h3>");

            RequestDispatcher dispatcher = request.getRequestDispatcher("/register.jsp");
            dispatcher.include(request, response);
        }
    }
}
