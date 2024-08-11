package com.sn.web;
import com.sn.vo.*;
import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.*;

@WebServlet(urlPatterns="/searchStudent")

public class SearchStudentController extends GenericServlet{
    // private StudentDAOI sdao;
    // public void init(){
    //     //sdao = DAOFactory.getStudentDAO();
    // }
    public void service(ServletRequest req, ServletResponse res)throws ServletException,IOException {
        String error_msg =null;
        try{
            int sid = Integer.parseInt(req.getParameter ("sid"));
           // Student s = sdao.getStudent(sid);
           Student s = new Student();
           s.setSID(101);
           s.setFName("Sagarika");
           s.setLName("Nayak");
           s.setCourse("MCA");
            if(s==null){
                error_msg = "<hr>Student not found</hr>";
            }else{
                req.setAttribute("student" , s);
                RequestDispatcher rd = req.getRequestDispatcher("/searchStudentView");
                rd.forward(req,res);
                return;
            }
        }catch(NumberFormatException e){
            error_msg = "<hr><i>Student ID should be a Number</i>";
        }
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        RequestDispatcher rd = req.getRequestDispatcher("studentForm.html");
        rd.include(req, res);
        out.println(error_msg);
    }
}