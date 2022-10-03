package modul_4.day_14.cookies.zad_1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CookieSet", value = "/setCookie")
public class Cookie1Set extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie userCookie = new Cookie("User", "CodersLab");
        userCookie.setMaxAge(60 * 60 * 24);
        resp.addCookie(userCookie);
    }
}
