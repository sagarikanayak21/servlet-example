package com.sn.web;
import com.sn.model.Student;
import javax.servlet.*;


import com.sn.dao.StudentDAO;

import java.io.*;

public class ServletDemo implements Servlet {
    public void init(ServletConfig sc) throws ServletException{
        System.out.println("in init");
    }
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
        StudentDAO sdao = new StudentDAO();
        Student s = sdao.getStudentById(107);
        System.out.println("in servlet");
        System.out.println(s.getSid());
        System.out.println(s.getFName());
        PrintWriter out = res.getWriter();
        out.println("Sid: "+s.getSid() +"First Name: " +s.getFName() +"Last Name: " +s.getLName());
        out.println("Hello Sagarika");
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

    // public static void main(String[] args) {
    //     StudentDAO sdao = new StudentDAO();
    //     Student s = sdao.getStudentById(107);
    //     System.out.println(s.getFName());
    //     System.out.println(s.getLName() );
    // }
}