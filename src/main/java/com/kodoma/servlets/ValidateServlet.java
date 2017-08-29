package com.kodoma.servlets;

import com.kodoma.datasource.User;
import com.kodoma.exceptions.WrongUserNameOrPassword;
import com.kodoma.services.Service;
import com.kodoma.services.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;


public class ValidateServlet extends HttpServlet {
    private Service service = UserService.getInstance();

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8");

        String name = request.getParameter("firstName");
        String password = request.getParameter("password");

        PrintWriter pw = response.getWriter();

        try {
            service.validate(name, password);
            List<User> list = service.showAllContacts();
            request.setAttribute("listContacts", list);
            request.getRequestDispatcher("/main.jsp").forward(request, response);

        } catch (WrongUserNameOrPassword | SQLException e) {
            pw.println("<h3>" + e.getMessage() + "</h3>");
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
