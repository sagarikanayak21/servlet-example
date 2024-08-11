package com.sn.web.view;
import com.sn.vo.*;
import javax.servlet.annotation.*;
import javax.servlet.*;
import java.io.PrintWriter;
import java.io.*;

@WebServlet(name="ssv", urlPatterns="/searchStudentView")

public class SearchStudentView extends GenericServlet {
    public void service(ServletRequest req, ServletResponse res)throws ServletException, IOException{
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        Student s = (Student)req.getAttribute("student");
        out.println("<hr>");
        out.println("SId: " + s.getSID());
        out.println("<br>First Name: " +s.getFName());
        out.println("<br>Last Name: " +s.getLName());
        out.println("<br>Course: " +s.getCourse());
    }
}
