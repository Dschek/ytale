package servlet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import page.Home;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class home extends HttpServlet {
    private final static Logger log = LogManager.getLogger();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        HttpSession session = req.getSession();
        String userId = null;
        if (session != null)
            userId = (String) session.getAttribute("id");
        String page = Home.getPage(userId);
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        try (PrintWriter pw = resp.getWriter()) {
            pw.write(page);
        } catch (IOException e) {
            log.trace("Error writer", e);
        }
    }
}