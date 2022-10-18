package modul_4.day_15.filtry.zad_3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Login", value = "/login")
public class Login extends HttpServlet {
    private final static String USER = "admin";
    private final static String PASSWORD = "coderslab";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        if(Boolean.valueOf(String.valueOf(session.getAttribute("login")))) {
            request.setAttribute("badLog" ,"Podany login lub hasło są nieprawidłowe.");
        }
        getServletContext().getRequestDispatcher("/day_15/filtry/zad_3/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        HttpSession session = request.getSession();
        if (user.equals(USER) && pass.equals(PASSWORD)) {
            // dodaj dane do sesji pod kluczem: username
            session.removeAttribute("login");
            session.setAttribute("username", user);
            // przekieruj na adres /admin
            response.sendRedirect("/admin");
        } else {
            // wyświetl informacje o błędnych danych
            session.setAttribute("login", true);
            response.sendRedirect("/login");
        }

    }
}
