package com.anotation.web;
import javax.servlet.*;
import java.io.*;
import javax.servlet.annotation.*; 

@WebServlet(name = "sn", urlPatterns = "/helloAnnotation/*")

public class AnnotationDemo implements Servlet{
    public void init(ServletConfig sc) throws ServletException{
        System.out.println("in init");
    }
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
        System.out.println("in service");
        String SId = req.getParameter("SID");
        PrintWriter out = res.getWriter();
        out.println("Hello I'm using annotation configuration");
        out.println("Student ID: "+ SId);
    }
    public void destroy(){
        System.out.println("in destroy");
    }
    public String getServletInfo(){
        return null;
    }
    public ServletConfig getServletConfig(){
        return null;
    }
}