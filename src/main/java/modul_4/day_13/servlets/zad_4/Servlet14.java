package modul_4.day_13.servlets.zad_4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/servlet14")
public class Servlet14 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Enumeration<String> headerNames = req.getHeaderNames();

        if(headerNames != null) {
            while(headerNames.hasMoreElements()) {
                String tmpStr = headerNames.nextElement();
                resp.getWriter().append(tmpStr).append(": ").append(req.getHeader(tmpStr)).append("\n");
            }
        }

    }
}
