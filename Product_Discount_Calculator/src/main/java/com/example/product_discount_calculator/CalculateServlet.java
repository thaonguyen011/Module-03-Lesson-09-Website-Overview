package com.example.product_discount_calculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="CalculateServlet", value="/calculate")
public class CalculateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int price = Integer.parseInt(req.getParameter("listPrice"));
        int discountPercent = Integer.parseInt(req.getParameter("discountPercent"));
        String description = req.getParameter("description");

        float discountAmount = (float) (price * discountPercent * 0.01);
        float discountPrice = price - discountAmount;

        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<br>");
        writer.println("<p>Description: " + description + "</p>");
        writer.println("<p>List price: " + price + "</p>");
        writer.println("<p>Discount percent: " + discountPercent + "</p>");
        writer.println("<br>");
        writer.println("<p>Discount amount: " + discountAmount + "</p>");
        writer.println("<p>Discount price: " + discountPrice + "</p>");
        writer.println("</html>");

    }
}
