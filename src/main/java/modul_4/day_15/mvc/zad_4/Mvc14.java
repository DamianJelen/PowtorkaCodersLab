package modul_4.day_15.mvc.zad_4;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@WebServlet(name = "Mvc14", value = "/mvc14")
public class Mvc14 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        List<Book> books = new ArrayList<>();
        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            String title = "Title_" + i;
            String author = "Author_" + i;
            String isbn = 1000 + random.nextInt(500) + "";
            books.add(new Book(title, author, isbn));
        }
        request.setAttribute("books", books);
        getServletContext().getRequestDispatcher("/day_15/mvc/zad_4/mvc_ex4.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
