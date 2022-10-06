package modul_4.day_14.sessions.zad_5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.Writer;
import java.util.Random;

@WebServlet("/session5")
public class Session5 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("UTF-8");
        Writer writer = resp.getWriter();
        Random random = new Random();
        int num1 = random.nextInt(101);
        int num2 = random.nextInt(101);
        HttpSession session = req.getSession();

        if(session.getAttribute("commentCaptcha") != null) {
            writer.append(session.getAttribute("commentCaptcha") + "").append("<br/>");
            session.removeAttribute("commentCaptcha");
        }

        writer.append("<form action=\"/session5\" method=\"post\">\n" +
                "        <label>Name: <input type=\"text\" name=\"name\"/></label><br/>\n" +
                "        <label>Surname: <input type=\"text\" name=\"surname\"/></label><br/>\n" +
                "        <label>Email: <input type=\"email\" name=\"email\"/></label><br/>\n" +
                "        <label>Write correct the equation result:<br/>" + num1 + " + "  + num2 +" = <input type=\"number\" name=\"resultCaptcha\"/></label><br/>\n" +
                "        <input type=\"submit\" value=\"Send\"/>\n" +
                "    </form>");
        session.setAttribute("captcha", (num1 + num2));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("UTF-8");
        HttpSession session = req.getSession();

        if(session.getAttribute("captcha") == Integer.valueOf(req.getParameter("resultCaptcha"))) {
            session.setAttribute("commentCaptcha", "Your data is added.");
        } else {
            session.setAttribute("commentCaptcha", "Your result the equate is incorrect");
        }

        resp.sendRedirect("/session5");
    }
}
