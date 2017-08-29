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
public class ShowInformationServlet extends HttpServlet {
    private Service service = UserService.getInstance();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();
        int answer = checkAction(request);

        try {
            switch (answer) {
                case 1: {
                    int id = Integer.parseInt(request.getParameter("ID"));
                    user.setId(id);

                    User resultUser = service.showContactByID(user);
                    request.setAttribute("contact", resultUser);
                    request.getRequestDispatcher("/showContactByID.jsp").forward(request, response);
                    break;
                }
                case 2: {
                    String name = request.getParameter("Name");
                    user.setFname(name);

                    User resultUser = service.showContactByName(user);
                    request.setAttribute("contact", resultUser);
                    request.getRequestDispatcher("/showContactByID.jsp").forward(request, response);
                    break;
                }
                case 3: {
                    List<String> groupNames = service.showAllGroupsNames();
                    System.out.println(groupNames);
                    request.setAttribute("groupNames", groupNames);
                    request.getRequestDispatcher("/showAllGroupNames.jsp").forward(request, response);
                    break;
                }
                case 4: {
                    String groupName = request.getParameter("NameOfGroup");
                    List<User> users = service.showContactsOfGroup(groupName);
                    request.setAttribute("listContacts", users);
                    request.getRequestDispatcher("/showAllContacts.jsp").forward(request, response);
                    break;
                }

            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int checkAction(HttpServletRequest request) {
        if (request.getParameter("ID") != null) {
            return 1;
        }
        if (request.getParameter("Name") != null) {
            return 2;
        }
        if (request.getParameter("Show") != null) {
            return 3;
        }
        if (request.getParameter("ShowContactsOfGroup") != null) {
            return 4;
        }
        return 0;
    }
}
