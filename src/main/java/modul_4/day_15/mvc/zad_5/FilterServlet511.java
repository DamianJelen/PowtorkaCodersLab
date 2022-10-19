package modul_4.day_15.mvc.zad_5;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "FilterServlet511", urlPatterns = "/servlet/*")
public class FilterServlet511 implements Filter {
    private final String CHARACTER_ENCODING = "UTF-8";
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding(CHARACTER_ENCODING);
        request.setCharacterEncoding(CHARACTER_ENCODING);
        chain.doFilter(request, response);
    }
}
