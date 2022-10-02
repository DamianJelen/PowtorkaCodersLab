package modul_4.day_14.formularze.zad_5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/post5")
public class Form5 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        try {
            double value = Double.parseDouble(req.getParameter("degrees"));
            String buttonVal = req.getParameter("conversionType");
            if ("CelcToFahr".equals(buttonVal)) {
                resp.getWriter().append("C -> F").append("<br>").append((2 * (value - (value * 0.1)) + 32) + "");
            } else if ("FahrToCelc".equals(buttonVal)) {
                resp.getWriter().append("F -> C").append("<br>").append(((value - 32)/2) * 1.1 + "");
            }
        } catch (NumberFormatException e) {
            resp.getWriter().append("Wprowadz poprawną wartość");
        }
    }
}
