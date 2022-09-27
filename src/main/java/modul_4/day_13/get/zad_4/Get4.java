package modul_4.day_13.get.zad_4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet(name = "Get4", urlPatterns = "/get4")
public class Get4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        Map<String, String[]> parameterMap = req.getParameterMap();
        resp.getWriter().append(printParamsValue(parameterMap));
    }

    protected StringBuilder printParamsValue(Map<String, String[]> parameterMap) {
        StringBuilder result = new StringBuilder();

        for(Map.Entry entryMap : parameterMap.entrySet()) {
            result.append(entryMap.getKey()).append("<br>");
            for(String val : (String[]) entryMap.getValue()) {
                result.append("&nbsp;- ").append(val).append("<br/>");
            }
        }

        return result;
    }
}
