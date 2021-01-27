package form;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/formServlet")
public class FormServlet extends HttpServlet {

    private String topic;
    private String content;
    private String email;
    private String telephone;


    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        setTopic(req.getParameter("topic"));
        setContent(req.getParameter("content"));
        setEmail(req.getParameter("email"));
        setTelephone(req.getParameter("telephone"));

        String returnInformation = "Dziękujemy za wypełnienie formularza";

        req.setAttribute("returnInformation", returnInformation);
        req.getServletContext().getRequestDispatcher("/home.jsp").forward(req, res);
    }

}
