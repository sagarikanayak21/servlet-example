package com.msc.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.io.*;

public class AddCookieController extends HttpServlet{
    public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
        String cname = req.getParameter("cname");
        String cvalue = req.getParameter("cvalue");

        //Create Cookie
        Cookie ck = new Cookie(cname, cvalue);
        // Add Cookie
        res.addCookie(ck);
      
        res.setContentType("text/html");
        res.getWriter().println("<p>Cookie Added Successfully</p>");
        RequestDispatcher rd=req.getRequestDispatcher("Home.html");
        rd.include(req,res);
    }
}