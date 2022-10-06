package modul_4.day_14.formularze.zad_8;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

@WebServlet("/servlet35")
public class Servlet35 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        String[] parameterValues = req.getParameterValues("num");
        int sum = 0;
        double avg = 0;
        int multi = 1;
        Writer writer = resp.getWriter();

        writer.append("Numbers: ").append("<br/>");
        for (int i = 0; i < parameterValues.length; i++) {
            writer.append("- ").append(parameterValues[i]).append("<br/>");
            avg += Double.parseDouble(parameterValues[i]) / parameterValues.length;
            sum += Integer.valueOf(parameterValues[i]);
            multi *= Integer.valueOf(parameterValues[i]);
        }

        writer.append("Avg numbers: ").append("<br/>").append("- " + avg).append("<br/>");
        writer.append("Sum numbers: ").append("<br/>").append("- " + sum).append("<br/>");
        writer.append("Multiply numbers: ").append("<br/>").append("- " + multi).append("<br/>");
    }
}
