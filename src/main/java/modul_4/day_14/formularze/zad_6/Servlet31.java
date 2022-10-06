package modul_4.day_14.formularze.zad_6;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/servlet31")
public class Servlet31 extends HttpServlet {
    static double PLN = 1;
    static double EUR = 4.8445;
    static double USD = 4.8989;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        String convertType = req.getParameter("convertType");
        double amount = Double.parseDouble(req.getParameter("amount"));
        double result = 0;

        switch (convertType) {
            case "EU": result = Math.round((amount * EUR / USD * 100));
                result = result / 100;
                break;
            case "UE": result = Math.round((amount * USD / EUR * 100));
                result = result / 100;
                break;
            case "EP": result = Math.round((amount * EUR / PLN * 100));
                result = result / 100;
                break;
            case "UP": result = Math.round((amount * USD / PLN * 100));
                result = result / 100;
                break;
            case "PE": result = Math.round((amount * PLN / EUR * 100));
                result = result / 100;
                break;
            case "PU": result = Math.round((amount * PLN / USD * 100));
                result = result / 100;
                break;
        }

        resp.getWriter().append(req.getParameter("amount")).append("&nbsp;->&nbsp;").append(result + "");
    }
}
