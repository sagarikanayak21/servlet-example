package com.msc.web;

import javax.servlet.*;
import java.io.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import  com.msc.vo.*;

@WebServlet(urlPatterns="/profile")
public class ProfileController extends HttpServlet{
    public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
        HttpSession session = req.getSession(false);
        Student st = (Student) session.getAttribute("user");
        PrintWriter out = res.getWriter();
        res.setContentType("text/html");
        out.println("User Name:" + st.getUserName() + "<br/>");
        out.println("First Name:" + st.getFName() + "<br/>");
        out.println("Last Name:" + st.getLName() + "<br/>");
        out.println("Degree:" + st.getDegree() + "<br/>");
        out.println("Dob:" + st.getDob() + "<br/>");
        RequestDispatcher rd=req.getRequestDispatcher("UserHome.html");
        rd.include(req,res);
    }
}