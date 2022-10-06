package modul_4.day_14.cookies.zad_6;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

@WebServlet("/servlet34")
public class Servlet34 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        Writer writer = resp.getWriter();
        boolean checkCookie = false;
        int cookieValue = 0;

        Cookie[] cookies = req.getCookies();
        for (int i = 0; i < cookies.length; i++) {
            if(cookies[i].getName().equals("visits")) {
                checkCookie = true;
                cookieValue = Integer.parseInt(cookies[i].getValue());
                cookieValue++;
                cookies[i].setValue(cookieValue + "");
                resp.addCookie(cookies[i]);
            }
        }

        if(!checkCookie) {
            resp.addCookie(new Cookie("visits", "1"));
            writer.append("Welcome to the website for the 1 time");
        } else {
            writer.append("Welcome to the website for the " + cookieValue +" time");
        }
    }
}
