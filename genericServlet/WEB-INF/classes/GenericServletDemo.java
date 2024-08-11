package com.gs.web;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import java.util.*;

@WebServlet(urlPatterns = "/login")

public class GenericServletDemo extends GenericServlet{
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
        Enumeration em = req.getParameterNames();
        String userName = req.getParameter("userName");
        String passw = "Password";
        String password = req.getParameter(passw);
        PrintWriter out = res.getWriter();
        out.println("Names: " +em + " UserName: " + userName + " Password: " +password);
    }
}