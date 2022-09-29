package modul_4.day_14.formularze.zad_2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/post2")
public class Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("UTF-8");

        String textBox = req.getParameter("text");

        if(req.getParameter("agree") != null) {
            resp.getWriter().append(textBox);
        } else {
            String[] words = textBox.split(" ");
            textBox = "";
            for (String word : words) {
                textBox += Wulgaryzmy.clearVulgarismFromText(word) + " ";
            }
            resp.getWriter().append(textBox);
        }
    }
}
