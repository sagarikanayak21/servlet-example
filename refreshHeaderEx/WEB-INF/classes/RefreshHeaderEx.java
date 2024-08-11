package com.rh.web;

import java.io.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import javax.servlet.*;

public class RefreshHeaderEx extends HttpServlet{
    public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
        res.setHeader("refresh","15");
        res.getWriter().println(new java.util.Date());
    }
}