import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PageCounterServlet", urlPatterns = "/count")

public class PageCounterServlet extends HttpServlet {

    public static int count;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        count += 1;
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>The page has been viewed " + count + " times.</h1>");

    }
}
