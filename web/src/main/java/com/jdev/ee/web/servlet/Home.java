package com.jdev.ee.web.servlet;

import com.jdev.ee.ejb.remote.ProductService;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/home")
public class Home extends HttpServlet {

    @EJB
    private ProductService productService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<h1>Hello World</h1>");

        productService.getProducts().forEach(product -> {
            try {
                resp.getWriter().println("<p>" + product.getName() + "</p>");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
