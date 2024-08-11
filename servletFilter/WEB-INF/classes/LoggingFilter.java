package com.sn.filter;

import javax.servlet.*;
import java.io.*;


public class LoggingFilter implements Filter{
    public void init(FilterConfig fc) {}
    public void destroy() {}
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws ServletException, IOException {
        System.out.println("In Logging Filter before chain.dofiler");
        // Implement the PreProcessing logic
        chain.doFilter(req, res);
         // Implement the Post Processing logic
        System.out.println("In Logging Filter After chain.dofiler");
    }
}
 