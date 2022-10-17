package modul_4.day_15.mvc.zad_3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Mvc13", value = "/mvc13")
public class Mvc13 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/day_15/mvc/zad_3/mvc_ex3.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String isbn = request.getParameter("isbn");
        Book book = new Book(title, author, isbn);
        request.setAttribute("book", book);
        getServletContext().getRequestDispatcher("/day_15/mvc/zad_3/result.jsp").forward(request, response);
    }
}
