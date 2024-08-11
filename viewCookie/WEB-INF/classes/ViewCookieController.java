package com.msc.web;

import javax.servlet.*;
import java.io.*;
import java.io.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet(urlPatterns="/viewCookie")
public class ViewCookieController extends HttpServlet{
    public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        Cookie[] ck = req.getCookies();
        if(null == ck) {
            out.println("<p>No Cookie Available</p>");
        } else {
            for(Cookie cookie: ck) {
                out.println("<p>Cookie Name: '+cookie.getName()+' Cookie Value: '+cookie.getValue()+' </p>");
            }
        }
    }
}