package modul_4.day_14.formularze.zad_7;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servlet32")
public class Servlet32 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String binaryNum = req.getParameter("number");

        if(binaryNum.matches("^[01]+$")) {
            resp.getWriter().append(binaryNum).append("&nbsp;->&nbsp;").append(convertBinToDec(binaryNum)+ "");
        } else {
            resp.getWriter().append("Write correct binary number");
        }

    }

    private static int convertBinToDec(String binNumber) {
        int result = 0;

        char[] nums = binNumber.toCharArray();
        for (int i = nums.length - 1; i >= 0 ; --i) {
            result += Integer.valueOf(String.valueOf(nums[i])) * Math.pow(2, nums.length - 1 - i);
        }

        return result;
    }
}
