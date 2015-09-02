package com.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;


/**
 * Created by alekspribysh on 8/31/15.
 */

public class filterLogin implements javax.servlet.Filter {

    FilterConfig filterConfig = null;

    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;

    }



    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {

        ServletContext context = req.getServletContext();
       String name = (String) context.getAttribute("name");


        if (name == null){
            chain.doFilter(req,resp);

        }

        else {
            //resp.
        }
    }


    public void destroy() {

    }
}
