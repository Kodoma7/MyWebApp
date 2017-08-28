package com.kodoma.servlets;

import com.kodoma.dao.ContactDAO;
import com.kodoma.dao.DAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Кодома on 26.08.2017.
 */
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.print("Hello from MyServlet");

        DAO dao = ContactDAO.getInstance();

        try {
            dao.showAllContacts();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
