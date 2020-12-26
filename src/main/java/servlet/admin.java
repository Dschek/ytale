package servlet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import dbApi.HibernateUtil;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class admin extends HttpServlet {
    private final static Logger log = LogManager.getLogger();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            System.out.println("Work");
        } catch (Exception e) {
            log.trace("Error with the database.", e);
            System.out.println(e);
        }
        System.out.println("Start");
    }
}