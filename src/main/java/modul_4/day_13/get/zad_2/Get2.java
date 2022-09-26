package modul_4.day_13.get.zad_2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

@WebServlet(name = "Get2", urlPatterns = "/get2")
public class Get2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String[]> parameterMap = req.getParameterMap();

        Iterator<Map.Entry<String, String[]>> mapIterator = parameterMap.entrySet().iterator();
        while (mapIterator.hasNext()) {
            Map.Entry keyValue = mapIterator.next();
            resp.getWriter().append(keyValue.getKey() + "\t" + Arrays.toString((String[]) keyValue.getValue())).append("\n");
        }
    }
}
