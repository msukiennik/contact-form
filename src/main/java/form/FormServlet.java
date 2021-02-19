package form;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/formServlet")
public class FormServlet extends HttpServlet {

    protected void doPost(HttpServletResponse res, HttpServletRequest req) throws IOException, ServletException {
        Form createForm = new Form();
        createForm.setVoiceNumber(req.getParameter("voice-number"));
        createForm.setProductSymbol(req.getParameter("product-symbol"));
        createForm.setContent(req.getParameter("content"));
        createForm.setEmail(req.getParameter("email"));
        createForm.setTelephone(req.getParameter("telepphone"));

        String returnInformation = "Dziękujemy za wypełnienie formularza. Twoja faktura nr " + createForm.getVoiceNumber() + " została przesłana do reklamacji.";
        req.setAttribute("returnInformation", returnInformation);
        getServletContext().getRequestDispatcher("/home.jsp").forward(req, res);

    }
}
