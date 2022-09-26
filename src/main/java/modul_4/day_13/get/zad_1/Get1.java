package modul_4.day_13.get.zad_1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet
public class Get1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getParameter("start") != null || req.getParameter("end") != null ) {
            int start = Integer.parseInt(req.getParameter("start"));
            int end = Integer.parseInt(req.getParameter("end"));
            for (int i = start; i <= end; i++) {
                resp.getWriter().append(i + " ");
            }
        } else {
            resp.getWriter().append("Brak");
        }
    }
}
