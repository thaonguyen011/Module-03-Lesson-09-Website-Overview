package com.example.currency_converter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ConverterServlet", value = "/convert")
public class ConvertedServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        float rate = Float.parseFloat(req.getParameter("rate"));
        float usd = Float.parseFloat(req.getParameter("usd"));

        float vnd = rate * usd;

        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<p>Rate: " + rate +"</p>");
        writer.println("<p>USD: " + usd +"</p>");
        writer.println("<p>VND: " + vnd +"</p>");
        writer.println("</html");
    }
}
