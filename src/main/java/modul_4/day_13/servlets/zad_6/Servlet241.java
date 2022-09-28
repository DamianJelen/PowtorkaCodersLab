package modul_4.day_13.servlets.zad_6;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "Servlet241", value = "/servlet241")
public class Servlet241 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        Random random = new Random();
        response.getWriter().append("<a href='/servlet242?id=" + random.nextInt(8) + "'> Link to servlet 242</a>");
        response.getWriter().append("<br/><a href='/servlet242?id=10'> Link to servlet 242 with id out of scope</a>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
