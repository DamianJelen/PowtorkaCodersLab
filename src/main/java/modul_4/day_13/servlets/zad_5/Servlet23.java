package modul_4.day_13.servlets.zad_5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

@WebServlet(urlPatterns = "/servlet23")
public class Servlet23 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().append("Here should be write txt file").append("<br/>");
        resp.getWriter().append(readFileTxt("../../../../../home/damian/Java Developer/PowtorkaCodersLab/day_12/regex/operations.txt"));

    }

    protected static StringBuilder readFileTxt(String fileName){
        StringBuilder result = new StringBuilder();
        Path file = Paths.get(fileName);
        try (Scanner scanner = new Scanner(file)) {
            while(scanner.hasNextLine()) {
                String str = scanner.nextLine();
                System.out.println(str);
                result.append(str).append("<br/>");
            }
        } catch (IOException e) {
            result.append("<br/>Something goes wrong");
        }

        return result;
    }
}
