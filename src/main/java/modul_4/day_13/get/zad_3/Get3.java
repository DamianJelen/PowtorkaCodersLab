package modul_4.day_13.get.zad_3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/get3")
public class Get3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        int width = req.getParameter("width") == null ? 5 : Integer.parseInt(req.getParameter("width"));
        int height = req.getParameter("height") == null ? 10 : Integer.parseInt(req.getParameter("height"));

        resp.getWriter().append(printTable(width, height));
    }

    protected StringBuilder printTable(int width, int height) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= height; i++) {
            result.append(i + "&emsp;");
            for (int j = 2; j <= width; j++) {
                result.append(i * j + "&emsp;");
            }
            result.append("<br/>");
        }
        return result;
    }
}
