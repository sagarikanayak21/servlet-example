package com.ac.web;

import javax.servlet.*;
import java.io.*;

public class ProfileController extends GenericServlet{
    public void service(ServletRequest req, ServletResponse res)throws ServletException, IOException{
        String fName = req.getParameter("fName");
        String lName = req.getParameter("lName");
       
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<br> Profile Details: ");
        out.println("<br>First Name: "+fName);
        out.println("<br>");
        out.println("<br>Last Name: "+lName);
        out.println("<br>");
    }
}