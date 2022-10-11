package modul_4.day_14.sessions.zad_7;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.Writer;
import java.util.Random;

@WebServlet(name = "Sess37", value = "/session37")
public class Sess37 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        Writer writer = response.getWriter();
        Random random = new Random();
        HttpSession session = request.getSession();
        int num1 = random.nextInt(980) + 21;
        int num2 = random.nextInt(980) + 21;
        session.setAttribute("num1", num1);
        session.setAttribute("num2", num2);
        writer.append("<p>Do it calculation on number " + num1 + ", " + num2 + " and writing the results:</p>\n" +
                "    <form action=\"session37\" method=\"post\">\n" +
                "        <label>adding: <input type=\"number\" name=\"add\"></label><br/>\n" +
                "        <label>subtracting: <input type=\"number\" name=\"sub\"></label><br/>\n" +
                "        <label>multiplying: <input type=\"number\" name=\"mul\"></label><br/>\n" +
                "        <input type=\"submit\" value=\"check\">\n" +
                "    </form>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        Writer writer = response.getWriter();
        HttpSession session = request.getSession();
        int num1 = (int) session.getAttribute("num1");
        int num2 = (int) session.getAttribute("num2");
        int correct_add = num1 + num2;
        int correct_sub = num1 - num2;
        int correct_mul = num1 * num2;
        int add = Integer.parseInt(request.getParameter("add"));
        int sub = Integer.parseInt(request.getParameter("sub"));
        int mul = Integer.parseInt(request.getParameter("mul"));

        writer.append("<table>\n" +
                "        <tr>\n" +
                "            <td align=\"left\">" + num1 + " + " + num2 + " = </td>\n" +
                "            <td align=\"right\">" + add + "</td>\n" +
                "            <td>" + (correct_add == add?"Correct":"Wrong") + "</td>\n" +
                "        </tr>\n" +
                "        <tr>\n" +
                "            <td align=\"left\">" + num1 + " - " + num2 + " = </td>\n" +
                "            <td align=\"right\">" + sub + "</td>\n" +
                "            <td>" + (correct_sub == sub?"Correct":"Wrong") + "</td>\n" +
                "        </tr>\n" +
                "        <tr>\n" +
                "            <td align=\"left\">" + num1 + " * " + num2 + " = </td>\n" +
                "            <td align=\"right\">" + mul + "</td>\n" +
                "            <td>" + (correct_mul == mul?"Correct":"Wrong") + "</td>\n" +
                "        </tr>\n" +
                "    </table>");
    }
}
