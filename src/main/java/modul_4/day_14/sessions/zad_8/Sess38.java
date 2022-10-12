package modul_4.day_14.sessions.zad_8;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Sess38", value = "/session38")
public class Sess38 extends HttpServlet {
    Countries[] countries = {new Countries("Litwa", "Wilno"),
            new Countries("Białoruś", "Mińsk"),
            new Countries("Ukraina", "Kijów"),
            new Countries("Słowacja", "Bratyslawa"),
            new Countries("Czechy", "Praga"),
            new Countries("Niemcy", "Berlin")};
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        int licznik = 0;
        if (session.getAttribute("licznik") == null) {
            session.setAttribute("licznik", 0);
        } else {
            licznik = (int) session.getAttribute("licznik");
            licznik++;
            session.setAttribute("licznik", licznik);
        }
        response.getWriter().append("<form action=\"/session38\" method=\"post\">\n" +
                "        <label>Write capital of " + countries[licznik].getCountryName() + " <input type=\"text\" name=\"capital\"></label>\n" +
                "        <input type=\"submit\" value=\"next\">\n" +
                "    </form>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        HttpSession session = request.getSession();
        String answer = request.getParameter("capital");
        int licznik = (int) session.getAttribute("licznik");
        int correctAnswer = 0;
        if (session.getAttribute("correctAnswers") == null) {
            session.setAttribute("correctAnswers", 0);
        }
        correctAnswer = (int) session.getAttribute("correctAnswers");
        if(answer.equals(countries[licznik].getCapitalName())) {
            ++correctAnswer;
            session.setAttribute("correctAnswers", correctAnswer);
        }
        if(licznik < countries.length - 1) {
            response.sendRedirect("/session38");
        }
        if (licznik == countries.length - 1) {
            session.removeAttribute("correctAnswers");
            session.removeAttribute("licznik");
            response.getWriter().append("Correct answers: ").append(correctAnswer + "<br/>").
                    append("<a href=\"../session38\">Repeat test</a>");
        }
    }
}
