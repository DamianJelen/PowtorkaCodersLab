package modul_4.day_14.cookies.zad_1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name="CookieDel", value = "/deleteCookie")
public class Cookie1Del extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        int licz = 0;
        boolean checkCookie = false;
        for(Cookie cookie : cookies) {
            ++licz;
            if(cookie.getName().equals("User")) {
                resp.getWriter().append("Delete cookie \"" + cookie.getName() + "\"");
                cookie.setMaxAge(0);
                resp.addCookie(cookie);
                checkCookie = true;
            }
        }

        if((!checkCookie) || cookies.length == 0) {
            resp.getWriter().append("Cookies not exist");
        }
    }
}
