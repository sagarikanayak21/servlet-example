package com.st.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;

@WebServlet(urlPatterns="/httpEx")

public class HttpServletEx extends HttpServlet{
    public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
        try{
            res.setContentType("text/html");
            PrintWriter out = res.getWriter();
            // res.sendError(404);
            out.println("Req method= " +req.getMethod());
            out.println("<br> Request url: " +req.getRequestURL());
            out.println("<br>Context path: " +req.getContextPath());
            out.println("<br>Servlet path: " +req.getServletPath());
            out.println("<br>Query String: " +req.getQueryString());
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Exception occured");
        }
    }
}