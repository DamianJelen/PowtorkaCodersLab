package modul_4.day_14.formularze.zad_4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/post4")
public class Form4 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");

        double a = Double.parseDouble(req.getParameter("num_a"));
        double b = Double.parseDouble(req.getParameter("num_b"));
        double c = Double.parseDouble(req.getParameter("num_c"));

        resp.getWriter().append(calculate(a, b, c));
    }

    static String calculate(double a, double b, double c) {
        String result = "";
        double delta = b * b - 4 * a * c;
        System.out.println(delta);
        if(delta < 0) {
            result = "not exist";
        } else if(delta == 0) {
            double x0 = - b / 2 * a;
            result = "x0 = " + x0;
        } else {
            double x1 = (- b - Math.sqrt(delta)) / 2 * a;
            double x2 = (- b + Math.sqrt(delta)) / 2 * a;
            result = "x1 = " + x1 + "<br/>x2 = " + x2;
        }

        return result;
    }
}
