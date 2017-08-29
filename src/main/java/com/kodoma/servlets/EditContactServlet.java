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
 * Created by Кодома on 28.08.2017.
 */
public class EditContactServlet extends HttpServlet {
    private Service service = UserService.getInstance();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");

        String action = request.getParameter("take");
        int id = Integer.parseInt(request.getParameter("Ok"));
        User user = new User();
        user.setId(id);

        try {
            switch (action) {
                case "Edit": {
                    request.setAttribute("ID", id);
                    request.getRequestDispatcher("/dataInput.jsp").forward(request, response);

                    //service.editContact(user);
                }
                case "ShowAllGroupsNames": {
                    List<String> groupNames = service.showAllGroupsNames();
                    System.out.println(groupNames);
                    request.setAttribute("groupNames", groupNames);
                    request.getRequestDispatcher("/showAllGroupNames.jsp").forward(request, response);
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
