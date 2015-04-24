package com.shahed.javaee.web;

import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Created by SHAHED on 4/24/2015.
 */
@WebServlet(name = "ViewAllUserServlet",urlPatterns = "/view")
public class ViewAllUserServlet extends HttpServlet {
    User u = new User();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<User> list = (ArrayList) request.getServletContext().getAttribute("list");
        PrintWriter out = response.getWriter();
        int i = 0;
        int list_size = list.size();
        String gender = "";
        out.print("<table align = 'left' cellspacing = '1' border = '1' width = '500'>");
        out.print("<tr>");
            out.print("<th>SL</th>");
            out.print("<th>Name</th>");
            out.print("<th>Email</th>");
            out.print("<th>Age</th>");
            out.print("<th>Gender</th>");
        out.print("</tr>");

        if(list_size > 0) {
            for (User u : list) {
                if (u.getGender().equals("M")) gender = "Male";
                if (u.getGender().equals("F")) gender = "Female";

                i++;
                out.print("<tr>");
                out.print("<td>" + i + "</td>");
                out.print("<td>" + u.getName() + "</td>");
                out.print("<td>" + u.getEmail() + "</td>");
                out.print("<td>" + u.getAge() + "</td>");
                out.print("<td>" + gender + "</td>");
                out.print("</tr>");
            }
            out.print("<table>");
        } else {
            out.print("There is no user exist....");
        }
    }
}
