package modul_4.day_15.filtry.zad_1;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebFilter(filterName = "Filter_1", value = "/filters/*")
public class Filter_1 implements Filter {
    private final String CHARACTER_ENCODING = "UTF-8";
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        request.setCharacterEncoding(CHARACTER_ENCODING);
        response.setCharacterEncoding(CHARACTER_ENCODING);
        response.setContentType("text/html");
        chain.doFilter(request, response);
    }
}
