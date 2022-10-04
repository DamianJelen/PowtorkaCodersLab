package modul_4.day_14.cookies.zad_5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cookie51")
public class Cookie51 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String linkToCookie52 = "<a href=\"../cookie52\">Link do Cookie52</a>";
        Cookie cookie = new Cookie("cookie51", "someValueInCookie");
        resp.addCookie(cookie);
        String msg = req.getParameter("msg");
        if(msg == null) {
            resp.getWriter().append(linkToCookie52);
        } else {
            resp.getWriter().append(msg).append("<br/>").append(linkToCookie52);
        }
    }
}
