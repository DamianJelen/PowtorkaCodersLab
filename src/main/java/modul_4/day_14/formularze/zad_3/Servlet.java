package modul_4.day_14.formularze.zad_3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/getForm3")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");

        int page = Integer.valueOf(req.getParameter("page"));

        resp.getWriter().append("Integer divisors for number " + page + ": ").append(integerDivisors(page));
    }

    private static String integerDivisors(int number) {
        String result = "";
        for (int i = 1; i <= number; i++) {
            result += number % i == 0 ? i + ", " : "";
        }
        return result.substring(0, result.length() - 2);
    }
}
