package com.kodoma.servlets;

import com.kodoma.datasource.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
 * Created by Кодома on 28.08.2017.
 */
public class EditContactServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");

        /*Enumeration<String> enumeration = request.getParameterNames();

        System.out.println("EditContactServlet");

        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }*/
        System.out.println(request.getParameter("Edit"));
    }
}
