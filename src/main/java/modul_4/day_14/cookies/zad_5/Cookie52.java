package modul_4.day_14.cookies.zad_5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

@WebServlet("/cookie52")
public class Cookie52 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        Cookie[] cookies = req.getCookies();
        boolean checkCookie = false;

        for(Cookie cookie : cookies) {
            if(cookie.getName().equals("cookie51")) {
                cookie.setMaxAge(0);
                resp.addCookie(cookie);
                checkCookie = true;
                resp.getWriter().append("Welcome on website Cookie52");
            }
        }

        if(!checkCookie) {
            String message = "Nie odwiedziles jeszcze tej strony";
            resp.sendRedirect("cookie51?msg=" + URLEncoder.encode(message, "UTF-8"));
        }
    }
}
