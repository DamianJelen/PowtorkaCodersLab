package modul_4.day_14.sessions.zad_4;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Session4", value = "/Session4")
public class Session4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        Writer writer = response.getWriter();
        List<CartItem> items = CartItem.resultCartItems((List<CartItem>) session.getAttribute("cartItems"));
        double sumPrice = CartItem.sumPriceItems(items);
        writer.append("<table>\n");

        for (int i = 0; i < items.size(); i++) {
            int quantity = items.get(i).getQuantity();
            double price = items.get(i).getPrice();
            writer.append("        <tr>\n" +
                    "            <td align=\"left\" style=\"color: green\">" + items.get(i).getName() + "</td>\n" +
                    "            <td> - </td>\n" +
                    "            <td align=\"right\" style=\"color: darkred\">" + quantity + "</td>\n" +
                    "            <td> x </td>\n" +
                    "            <td align=\"right\"><text style=\"color: darkred\">" + price + "</text>zł</td>\n" +
                    "            <td> = </td>\n" +
                    "            <td align=\"right\"><text style=\"color: darkred\">" + (quantity * price) + "</text>zł</td>\n" +
                    "        </tr>\n");
        }

        writer.append("        <tr>\n" +
                "            <td colspan=\"6\" align=\"right\" style=\"color: green\">Sum:&ensp;</td>\n" +
                "            <td align=\"right\"><text style=\"color: darkred\">" + sumPrice + "</text>zł</td>\n" +
                "        </tr>\n" +
                "    </table>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        List<CartItem> cartItems;
        String productName = request.getParameter("productName");
        int quantity = Integer.valueOf(request.getParameter("quantity"));
        double price = Double.parseDouble(request.getParameter("price"));
        CartItem item = new CartItem(productName, quantity, price);

        if(session.getAttribute("cartItems") != null) {
            cartItems = (List<CartItem>) session.getAttribute("cartItems");
        } else {
            cartItems = new ArrayList<>();
        }

        cartItems.add(item);
        session.setAttribute("cartItems", cartItems);

        response.sendRedirect("/day_14/sessions/zad_4/session4.html");
    }
}
