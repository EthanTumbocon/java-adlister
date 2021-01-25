import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="PizzaServlet", urlPatterns ="/pizza-order")
public class  PizzaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/pizzaform.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String crustType = req.getParameter("crust");
        String[] toppings = req.getParameterValues("topping");
        String address = req.getParameter("address");
        System.out.println("Your crust type:" + crustType);
        for(int i= 0; i < toppings.length; i++) {

            System.out.println(toppings[i]);
        }
        System.out.println(address);
    }
}

