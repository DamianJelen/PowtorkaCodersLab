package modul_4.day_14.sessions.zad_6;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.Writer;
import java.util.Enumeration;

@WebServlet("/servlet33")
public class Servlet33 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        Writer writer = resp.getWriter();
        HttpSession session = req.getSession();
        writer.append("<form method=\"post\" action=\"/servlet33\">\n");

        if(session.getAttribute("txt1") != null ||
                session.getAttribute("txt2") != null ||
                session.getAttribute("txt3") != null ||
                session.getAttribute("txt4") != null ||
                session.getAttribute("txt5") != null) {
            writer.append("    <label>Pool 1: <input name=\"txt1\" type=\"text\" value=" + session.getAttribute("txt1") + "></label><br/>\n" +
                "    <label>Pool 2: <input name=\"txt2\" type=\"text\" value=" + session.getAttribute("txt2") + "></label><br/>\n" +
                "    <label>Pool 3: <input name=\"txt3\" type=\"text\" value=" + session.getAttribute("txt3") + "></label><br/>\n" +
                "    <label>Pool 4: <input name=\"txt4\" type=\"text\" value=" + session.getAttribute("txt4") + "></label><br/>\n" +
                "    <label>Pool 5: <input name=\"txt5\" type=\"text\" value=" + session.getAttribute("txt5") + "></label><br/>\n");
        } else {
            writer.append("    <label>Pool 1: <input name=\"txt1\" type=\"text\"/></label><br/>\n" +
                "    <label>Pool 2: <input name=\"txt2\" type=\"text\"/></label><br/>\n" +
                "    <label>Pool 3: <input name=\"txt3\" type=\"text\"/></label><br/>\n" +
                "    <label>Pool 4: <input name=\"txt4\" type=\"text\"/></label><br/>\n" +
                "    <label>Pool 5: <input name=\"txt5\" type=\"text\"/></label><br/>\n");
        }

        writer.append("    <input type=\"submit\"/>\n" +
                "</form>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        HttpSession session = req.getSession();
        session.setAttribute("txt1", req.getParameter("txt1"));
        session.setAttribute("txt2", req.getParameter("txt2"));
        session.setAttribute("txt3", req.getParameter("txt3"));
        session.setAttribute("txt4", req.getParameter("txt4"));
        session.setAttribute("txt5", req.getParameter("txt5"));

        resp.sendRedirect("servlet33");
    }
}
