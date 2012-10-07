package edu.uml.project90308.presentation;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

import edu.uml.project90308.businesslogic.*;


public class StockQuoteServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String symbol = req.getParameter("stocksymbol");

        if (!symbol.isEmpty()) {
            out.println("<html");
            out.println("<head><title>Stock Symbol Report</title></head>");
            out.println("<body>");
            out.println("<p>");
            out.println("Stock symbol entered: " + symbol);

            try {
                StringWriter res = StockQuote.getQuote(symbol);
                out.println("</p>");
                out.println(res);
                out.println("</p>");
                out.println("</body>");
                out.println("</html");
            }
            catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
        else {
            out.println("<html");
            out.println("<head><title>Error Page</title></head>");
            out.println("<body>");
            out.println("<p>");
            out.println("No stock symbol entered!");
            out.println("</p>");
            out.println("</body>");
            out.println("</html");
        }


        //resp.sendRedirect("result"); // Home page?
        /*
        if (user != null) {
            request.getSession().setAttribute("user", user); // Logged in!
            response.sendRedirect("home"); // Home page?
        } else {
            response.sendRedirect("error"); // Error page? You can eventually redisplay same JSP with error message.
        }
        */
    }
}
