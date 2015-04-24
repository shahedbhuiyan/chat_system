package com.shahed.javaee.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import message.Chat;
/**
 * Created by SHAHED on 4/25/2015.
 */
@WebServlet(name = "ViewAllMessageServlet",urlPatterns = "/viewAllMsg")
public class ViewAllMessageServlet extends HttpServlet {
    Chat cht = new Chat();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Chat> list1 = (ArrayList)request.getServletContext().getAttribute("list1");
        PrintWriter out = response.getWriter();

        out.print("<table align = 'left' cellspacing = '1' border = '1' width = '500'>");
            out.print("<tr>");
                out.print("<th>SL</th>");
                out.print("<th>Name</th>");
                out.print("<th>Gender</th>");
                out.print("<th>Date</th>");
                out.print("<th>Message</th>");
            out.print("</tr>");
            int i = 0;
            for(Chat c : list1){
                i++;
                out.print("<tr>");
                    out.print("<td>"+i+"</td>");
                    out.print("<td>"+c.getName()+"</td>");
                    out.print("<td>"+c.getGender()+"</td>");
                    out.print("<td>"+c.getDate()+"</td>");
                    out.print("<td>"+c.getMsg()+"</td>");
                out.print("</tr>");
            }
        out.print("</table>");
    }
}
