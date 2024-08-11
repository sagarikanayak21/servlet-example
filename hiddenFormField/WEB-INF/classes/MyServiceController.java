package com.msc.web;

import javax.servlet.*;
import java.io.*;
import java.io.*;

public class MyServiceController extends GenericServlet{
    public void service(ServletRequest req, ServletResponse res)throws ServletException, IOException{
        res.setContentType("text/html");
        String fName = "Miss." + req.getParameter("fName");
        String lName = "Langudi" + req.getParameter("lName");
        PrintWriter out = res.getWriter();
        out.println("<form action = 'profile'>");
        out.println("<input type='hidden' name='fName' value='"+fName+"'/><br/>");
        out.println("<input type='hidden' name='lName' value='"+lName+"'/><br/>");
        out.println("<input type='submit' value='Profile'>");
        out.print("</form>");
    }
}