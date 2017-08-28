package com.kodoma.servlets;

import com.kodoma.dao.ContactDAO;
import com.kodoma.datasource.User;
import com.kodoma.exceptions.WrongUserNameOrPassword;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;


public class ValidateServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");

        String name = request.getParameter("firstName");
        String password = request.getParameter("password");

        ContactDAO dao = ContactDAO.getInstance();
        String result;
        PrintWriter pw = response.getWriter();

        try {
            result = dao.validate(name, password);
            List<User> list = dao.showAllContacts();
            //request.setAttribute("validateUser", result); // с помощью атрибутов передаются данные между сервлетами
            request.setAttribute("listContacts", list);
            request.getRequestDispatcher("/main.jsp").forward(request, response);

        } catch (WrongUserNameOrPassword | SQLException e) {
            pw.println("<h3>" + e.getMessage() + "</h3>");
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //из дао в реквевст -> jsp

        //
    }
}
