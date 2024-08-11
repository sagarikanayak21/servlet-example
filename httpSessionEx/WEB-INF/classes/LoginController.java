package com.msc.web;

import javax.servlet.*;
import java.io.*;
import java.io.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import com.msc.vo.*;

@WebServlet(urlPatterns="/login")
public class LoginController extends HttpServlet{
    public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        // Call UserDAOFactory to validate the student username and password
       // boolean isvalidUser = UserDAO.isValidUser(userName, password);
        boolean isvalidUser = userName.equals(password) ? true : false;
        PrintWriter out = res.getWriter();
        res.setContentType("text/html");
        if(isvalidUser) {
            // Call UserDAOFactory to get the student details
            // Student std = UserDAO.getStudent(userName);
            Student std = new Student(userName, "101", "Sagarika", "Nayak", "MCA", "27-12-1996");
            HttpSession session = req.getSession();
            session.setAttribute("user", std);
            out.println("<p>Login Success</p>");
            RequestDispatcher rd=req.getRequestDispatcher("UserHome.html");
            rd.include(req,res);
        } else {
            out.println("<p>In valid user, please try with correct credential</p>");
            RequestDispatcher rd=req.getRequestDispatcher("Login.html");
            rd.include(req,res);
        }
    }
}