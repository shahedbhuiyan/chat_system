package com.shahed.javaee.web;

import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by SHAHED on 4/24/2015.
 */
@WebServlet(name = "LoginServlet",urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
        ArrayList<User> list = (ArrayList<User>) request.getServletContext().getAttribute("list");
        String gender = "";

        if(list.size() > 0) {
            for (User s : list) {
                if (s.getEmail().equals(email) && s.getPass().equals(pass)) {
                    request.setAttribute("user", s.getName());
                    request.setAttribute("email", s.getEmail());
                    if(s.getGender().equals("M")) gender = "Male";
                    if(s.getGender().equals("F")) gender = "Female";
                    request.setAttribute("sex",gender);
                    request.getRequestDispatcher("message.jsp").forward(request, response);
                    break;
                }
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
