package modul_4.day_14.cookies.zad_3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Cookie3", value = "/Cookie3")
public class Cookie3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String key = request.getParameter("key");
        String val = request.getParameter("value");
        int lifeTime = Integer.parseInt(request.getParameter("time")) * 60 * 60;
        Cookie cookie = new Cookie(key, val);
        cookie.setMaxAge(lifeTime);
        response.addCookie(cookie);

        response.sendRedirect("localhost:8080/day_14/cookies/zad_3/cookie3.html");
    }
}
