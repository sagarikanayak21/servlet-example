package com.st.web;
import javax.servlet.*;
import java.io.*;

public class HelloServletExample implements Servlet { 
    public void init(ServletConfig Sc) throws ServletException{
        System.out.println("in init");
    }
    public void service(ServletRequest req, ServletResponse res) throws ServletException , IOException{
        System.out.println("in servlet");
        PrintWriter out = res.getWriter();
        out.println("Hii Sagarika... Hello from Servlet");     //this will print to client browser
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