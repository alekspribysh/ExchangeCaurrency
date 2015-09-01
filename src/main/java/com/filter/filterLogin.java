package com.filter;



import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;
import java.io.IOException;


/**
 * Created by alekspribysh on 8/31/15.
 */
@WebServlet(urlPatterns = {"/*"})
public class filterLogin implements javax.servlet.Filter {


    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        ServletContext context = request.getServletContext();
        String name = (String) context.getAttribute("name");

        if (name != null){
            chain.doFilter(request,response);

        }
    }

    public void destroy() {

    }
}
