package Java;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/Login")
public class LoginController extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

        String user = req.getParameter("username");
        String pass = req.getParameter("password");

        if (user.equals("admin") && pass.equals("admin")) {
            req.setAttribute("userWelcomeMessage", "Welcome back: "+ user);
            req.getRequestDispatcher("/WelcomePage.jsp").forward(req,res);
        }
        else if (user.equals("") || pass.equals("")) {
            req.setAttribute("errorMessage", "Please enter your credentials before trying to sign in.");
        }
        else {
            req.setAttribute("errorMessage", "Invalid login and password. Please try again.");
            req.getRequestDispatcher("/index.jsp").forward(req,res);
        }
    }
}