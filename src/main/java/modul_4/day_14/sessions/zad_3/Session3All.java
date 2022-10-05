package modul_4.day_14.sessions.zad_3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.Writer;
import java.util.Enumeration;


@WebServlet("/showAllSessions")
public class Session3All extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        HttpSession session = req.getSession();
        Enumeration<String> attributeNames = session.getAttributeNames();
        Writer writer = resp.getWriter();
        writer.append("<table>\n");
        while (attributeNames.hasMoreElements()) {
            String attrName = attributeNames.nextElement();
            writer.append("<tr>\n" +
                    "            <td>" + attrName + "</td>\n" +
                    "            <td>" + session.getAttribute(attrName) + "</td>\n" +
                    "        </tr>");
        }
        writer.append("</table>").append("<br/>");
        writer.append("<a href=\"/addToSession\">Add to session</a>");
    }
}
