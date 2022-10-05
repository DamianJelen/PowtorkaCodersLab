package modul_4.day_14.sessions.zad_3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/addToSession")
public class Session3Add extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        resp.getWriter().append("<form action=\"\" method=\"POST\">\n" +
                "        <label>\n" +
                "            Klucz:\n" +
                "            <input type=\"text\" name=\"key\">\n" +
                "        </label><br/>\n" +
                "        <label>\n" +
                "            Wartość:\n" +
                "            <input type=\"text\" name=\"value\">\n" +
                "        </label><br/>\n" +
                "        <input type=\"submit\">\n" +
                "    </form><br/>\n" +
                "    <a href=\"/showAllSessions\">Show all sessions</a>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.setAttribute(req.getParameter("key"), req.getParameter("value"));
        resp.sendRedirect("/addToSession");
    }
}
