package com.sn.web;

import javax.servlet.*;
import java.io.*;

public class HelloServletEx implements Servlet{
    public void init(ServletConfig sc) throws ServletException{
        System.out.println("in init");
    }
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
        System.out.println("in service");
        PrintWriter out = res.getWriter();
        out.println("sagarika... Hello from Servlet");
    }
    public void destroy(){
        System.err.println("in destroy");
    }
    public String getServletInfo(){
        return null;
    }
    public ServletConfig getServletConfig(){
        return null;
    }
}
