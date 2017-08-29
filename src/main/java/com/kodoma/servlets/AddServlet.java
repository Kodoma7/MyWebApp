package com.kodoma.servlets;

import com.kodoma.datasource.User;
import com.kodoma.services.Service;
import com.kodoma.services.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Кодома on 29.08.2017.
 */
public class AddServlet extends HttpServlet {
    private Service service = UserService.getInstance();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String address = request.getParameter("address");
        int phoneNumber = Integer.parseInt(request.getParameter("phoneNumber"));
        String groupName = request.getParameter("groupName");

        User user = new User(0, firstName, lastName, address, phoneNumber, groupName);

        try {
            service.add(user);
            List<User> list = service.showAllContacts();
            request.setAttribute("listContacts", list);
            request.getRequestDispatcher("/main.jsp").forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        if (request.getParameter("Add") != null) {
            request.getRequestDispatcher("/addContact.jsp").forward(request, response);
        }
    }
}
