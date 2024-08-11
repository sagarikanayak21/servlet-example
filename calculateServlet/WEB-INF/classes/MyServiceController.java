package com.msc.web;

import javax.servlet.*;
import java.io.*;
import java.io.*;

public class MyServiceController extends GenericServlet{
    public void service(ServletRequest req, ServletResponse res)throws ServletException, IOException{
        String op1 = req.getParameter("op1");
        String op2 = req.getParameter("op2");
        try{
            Integer.parseInt(op1);
            Integer.parseInt(op2);
        }catch(Exception e){
            res.setContentType("text/html");
            PrintWriter out = res.getWriter();
            out.println("Invalid inputs");
            RequestDispatcher rd = req.getRequestDispatcher("MyServiceForm.html");
            rd.include(req,res);
            return;
        }
        String operation = req.getParameter("operation");
        ServletContext ctxt = req.getServletContext();
        RequestDispatcher rd = ctxt.getNamedDispatcher(operation);
        rd.forward(req,res);
    }
}