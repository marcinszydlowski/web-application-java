package Java;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


//verify login form and undertake appropriate action
@WebServlet("/Login")
public class LoginController extends HttpServlet {

    //post method
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

        //fetch submitted credentials
        String user = req.getParameter("username");
        String pass = req.getParameter("password");

        //check if credentials match
        if (user.equals("admin") && pass.equals("admin")) {
            req.setAttribute("userWelcomeMessage", "Welcome back "+ user + " !");
            req.getRequestDispatcher("/welcomePage.jsp").forward(req,res);
        }
        //ensuring of server-side validation
        else if (user.equals("") || pass.equals("")) {
            req.setAttribute("errorMessage", "Please enter your credentials before trying to sign in.");
        }
        //if credentials are wrong
        else {
            req.setAttribute("errorMessage", "Invalid login and password. Please try again.");
            req.getRequestDispatcher("/index.jsp").forward(req,res);
        }
    }
}