package modul_4.day_14.cookies.zad_4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/showAllCookies")
public class Cookie4Show extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        Cookie[] cookies = req.getCookies();
        for(Cookie cookie : cookies) {
            String coockieName = cookie.getName();
            resp.getWriter().append(coockieName).append("|").append("<a href=\"../removeCookie?cookieName=" + coockieName + "\"> delete cookie </a><br/>");
        }
    }
}
