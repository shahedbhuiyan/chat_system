
package com.shahed.javaee.web;

import model.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Created by SHAHED on 4/24/2015.
 */
public class SignupServlet extends HttpServlet {

    ArrayList<User> list = new ArrayList<User>();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int list_size = list.size();
        User user = new User();
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
        String age = request.getParameter("age");
        String gender = request.getParameter("gender");
        //PrintWriter out = response.getWriter();
        if(name != "" && email != "" && pass != "") {
            user.setName(name);
            user.setEmail(email);
            user.setPass(pass);
            user.setAge(age);
            user.setGender(gender);
            list.add(user);

            int newlist_size = list.size();
            if(newlist_size > list_size) {
                request.setAttribute("status","Successfully Inserted");
                request.getRequestDispatcher("login.jsp").forward(request, response);
                request.getServletContext().setAttribute("list",list);
            } else {
                request.setAttribute("status", "Insertion Failed");
                request.getRequestDispatcher("index.jsp").forward(request,response);
            }

        } else {
            request.setAttribute("status", "Please enter your name,email and password");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
