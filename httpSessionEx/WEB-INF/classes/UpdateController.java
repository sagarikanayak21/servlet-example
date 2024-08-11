package com.msc.web;

import javax.servlet.*;
import java.io.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import  com.msc.vo.*;

@WebServlet(urlPatterns="/update")
public class UpdateController extends HttpServlet{
    public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
        String attributeName = req.getParameter("attributeName");
        String attributeValue = req.getParameter("attributeValue");
        HttpSession session = req.getSession(false);
        Student st = (Student) session.getAttribute("user");
        String userId = st.getUserId();
        // Call UserDAOFactory to update the record based on attribute name and its' value
       // boolean isUpdateSuccess = UserDAO.update(userId, attributeName, attributeName);
        boolean isUpdateSuccess = attributeName.startsWith("xyz") ? true : false;
        PrintWriter out = res.getWriter();
        res.setContentType("text/html");
        if(isUpdateSuccess) {
            out.println("<p>Updation Sucess</p>");
            RequestDispatcher rd=req.getRequestDispatcher("UserHome.html");
            rd.include(req,res);
        } else {
            out.println("<p>Updation failed try after sometime</p>");
            RequestDispatcher rd=req.getRequestDispatcher("UserHome.html");
            rd.include(req,res);
        }
    }
}