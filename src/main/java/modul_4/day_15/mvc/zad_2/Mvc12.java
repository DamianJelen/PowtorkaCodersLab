package modul_4.day_15.mvc.zad_2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Mvc12", value = "/mvc12")
public class Mvc12 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int start = Integer.valueOf(request.getParameter("start"));
        int end = Integer.valueOf(request.getParameter("end"));
        start += 10;
        end += 10;
        request.setAttribute("start", start);
        request.setAttribute("end", end);
//        response.getWriter().append("od " + start).append(" dp " + end);
        getServletContext().getRequestDispatcher("/day_15/mvc/zad_2/mvc_ex2.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
