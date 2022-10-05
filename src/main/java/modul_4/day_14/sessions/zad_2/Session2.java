package modul_4.day_14.sessions.zad_2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

@WebServlet("/session2")
public class Session2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        Writer writer = resp.getWriter();
        String avg = req.getParameter("avg");

        if(avg != null) {
            writer.append("Avg raiting: ").append(avg).append("<br/>");
        }

        writer.append("<form action=\"/sessionDj/calc\">\n" +
                "<label>Enter a rating: <input name=\"rating\" type=\"number\" min=\"1\" max=\"6\" step=\"1\"/></label>\n" +
                "<input type=\"submit\"/>\n" +
            "</form>");
    }
}