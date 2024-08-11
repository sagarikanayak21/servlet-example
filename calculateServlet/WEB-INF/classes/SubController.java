package com.ac.web;

import javax.servlet.*;
import java.io.*;

public class SubController extends GenericServlet{
    public void service(ServletRequest req, ServletResponse res)throws ServletException, IOException{
        int op1 = Integer.parseInt(req.getParameter("op1"));
        int op2 = Integer.parseInt(req.getParameter("op2"));
        int result = op1-op2;
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<br>Result: "+result);
        out.println("<br>");
        RequestDispatcher rd=req.getRequestDispatcher("MyServiceForm.html");
        rd.include(req,res);
    }
}