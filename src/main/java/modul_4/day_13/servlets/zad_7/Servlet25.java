package modul_4.day_13.servlets.zad_7;

import com.google.common.collect.Lists;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

@WebServlet(name = "Servlet25", urlPatterns = "/servlet25")
public class Servlet25 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();
        List<Integer> integerList = new ArrayList<>();
        Random random = new Random();
        writer.append("<table><tr><td>");
        for (int i = 0; i < 10; i++) {
            integerList.add(random.nextInt(100) + 1);
            writer.append(integerList.get(i) + "<br>");
        }

        writer.append("</td><td>&emsp;</td><td>");

        Collections.sort(integerList);
        for (int i = 0; i < integerList.size(); i++) {
            writer.append(integerList.get(i) + "<br>");
        }

        writer.append("</td></tr></table>");
    }
}
