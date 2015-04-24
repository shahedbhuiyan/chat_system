package com.shahed.javaee.web;

import message.Chat;
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

public class ChatServlet extends HttpServlet {
    ArrayList<Chat> list = new ArrayList<Chat>();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Chat chat = new Chat();
        chat.setName(request.getParameter("user"));
        chat.setGender(request.getParameter("sex"));
        chat.setDate(request.getParameter("date"));
        chat.setMsg(request.getParameter("text"));
        list.add(chat);

        request.setAttribute("user", request.getParameter("user"));
        request.setAttribute("sex",request.getParameter("sex"));

        request.getServletContext().setAttribute("list1",list);
        request.getRequestDispatcher("message.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
