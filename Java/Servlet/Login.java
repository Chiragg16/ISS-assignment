package com.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginForm")
public class Login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/registerloginservlet", "root", "123456");

            PreparedStatement preparedStatement = connection.prepareStatement("select * from users where email = ? and password = ?");

            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/profile.jsp");
                dispatcher.include(request, response);
            } else {
                response.setContentType("text/html");
                out.print("<h3> Incorrect email or password</h3>");

                RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
                dispatcher.include(request, response);
            }

        } catch (Exception e) {
            response.setContentType("text/html");
            out.print("<h3> Login exception " + e.getMessage() + "</h3>");

            RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
            dispatcher.include(request, response);
        }
    }
}
