package modul_4.day_14.sessions.zad_2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/sessionDj/calc")
public class showAvgRating extends HttpServlet {
    List<Integer> ratingList = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        double avg = 0;
        String rating = req.getParameter("rating");
        ratingList.add(Integer.valueOf(rating));
        for (int i = 0; i < ratingList.size(); i++) {
            avg += ratingList.get(i);
        }

        avg = avg / ratingList.size();

        resp.sendRedirect("/session2?avg=" + avg);
    }
}