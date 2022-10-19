package modul_4.day_15.mvc.zad_5;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Servlet512", value = "/servlet/512")
public class Servlet512 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String language = request.getParameter("language");
        response.addCookie(new Cookie("chooseLang", language));
        response.sendRedirect("/servlet/511");
    }
}
