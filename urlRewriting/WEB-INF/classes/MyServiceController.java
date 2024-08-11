package com.msc.web;

import javax.servlet.*;
import java.io.*;
import java.io.*;

public class MyServiceController extends GenericServlet{
    public void service(ServletRequest req, ServletResponse res)throws ServletException, IOException{
        String fName = req.getParameter("fName");
        String lName = req.getParameter("lName");
        PrintWriter out = res.getWriter();
        out.print("<a href='profile?fName="+fName+"&lName="+lName+"'>Profile</a>");
    }
}