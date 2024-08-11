package com.st.controller;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.util.*;
import java.io.*;

import com.st.dao.DAOFactory;
import com.st.dao.*;


@WebServlet(urlPatterns = "/logins")

public class LoginServlet extends GenericServlet{
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
        String userName = req.getParameter("username");
        System.out.println("UserName: " +userName);
        // String passw = "password";
        String password = req.getParameter("password");
        System.out.println("Password: " +password);
        
        UserDAOI udao = DAOFactory.getUserDAO();
       // UserDAOI udao = new UserDAO();
        boolean flag = udao.findUser(password);
        PrintWriter out = res.getWriter();
        if(password.length()<8){
            out.println("Invalid password length.");
            return;
        }
    
        if(flag){
            out.println("Welcome "+ userName);
        }else{
            out.println("Invalid Username/password");
        }
    }
}