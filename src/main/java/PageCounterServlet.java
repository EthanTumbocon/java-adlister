import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PageCounterServlet", urlPatterns = "/pagecounter")
public class PageCounterServlet extends HttpServlet {
    private int counter = 0;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        counter +=1;
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1> You have viewed this page " + counter + " times</h1>");

    }
}
