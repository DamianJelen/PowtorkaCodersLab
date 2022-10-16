package modul_4.day_15.mvc.zad_1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Mvc11", value = "/mvc11")
public class Mvc11 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String paramRole = request.getParameter("role");
        String userRole = !paramRole.equals("") ? "ROLE_" + paramRole.toUpperCase() : null;
        request.setAttribute("userRole", userRole);
        getServletContext().getRequestDispatcher("/day_15/mvc/zad_1/mvc_ex1.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
