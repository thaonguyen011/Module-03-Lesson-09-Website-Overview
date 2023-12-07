package com.example.simple_dictionary;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "TranslateServlet", value="/translate")
public class TranslateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       Map<String, String> dictionary = new HashMap<>();
       dictionary.put("hello", "xin chao");
       dictionary.put("how", "the nao");
       dictionary.put("book", "sach");
       dictionary.put("computer", "may tinh");
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
       String search = req.getParameter("txtSearch");
       if (dictionary.get(search) != null) {
           writer.println("Word: " + search);
           writer.println("Result: " + dictionary.get(search));
       } else {
           writer.println("Not found");
       }
        writer.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
