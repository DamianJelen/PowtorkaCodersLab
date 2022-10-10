package modul_4.day_14.cookies.zad_7;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.Writer;

@WebServlet(name = "Cookie36", value = "/Cookie36")
public class Cookie36 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        Writer writer = response.getWriter();
        boolean checkCookie = false;
        Cookie[] cookies = request.getCookies();
        if(cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("rememberName")) {
                    writer.append("Hi ").append(cookie.getValue()).append(", your data was loaded from the cookie.");
                    checkCookie = true;
                }
            }
        }
        if(!checkCookie) {
            writer.append("<form action=\"/Cookie36\" method=\"post\">\n" +
                    "    <label>Name: <input type=\"text\" name=\"name\"></label>\n" +
                    "    <label><input type=\"checkbox\" name=\"remember\"> remember me</label>\n" +
                    "    <input type=\"submit\" value=\"send\">\n" +
                    "</form>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String checkRemember = request.getParameter("remember");
        String name = request.getParameter("name");
        if(checkRemember != null) {
            response.addCookie(new Cookie("rememberName", name));
        }
        response.getWriter().append("Hello ").append(name).append("!!!").append(checkRemember);

    }
}
