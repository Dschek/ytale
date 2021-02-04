package api;

import dbApi.HibernateUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import table.M.PostM;

import java.util.List;

public class Post {
    private final static Logger log = LogManager.getLogger();

    public static List<PostM> getRandomM(int size, int start) {
        List<PostM> post = null;
        try (Session session = HibernateUtil.getSession()) {
            post = session.createSQLQuery("SELECT * FROM postM LIMIT :size , :start ")
                    .setParameter("size", size)
                    .setParameter("start", start)
                    .addEntity("postM", PostM.class)
                    .list();
        } catch (Exception e) {
            log.trace("Error with the database.", e);
        }
        return post;
    }

    public static List<PostM> getMorePopularM(int size, int start) {
        List<PostM> post = null;
        try (Session session = HibernateUtil.getSession()) {
            post = session.createSQLQuery("SELECT * FROM postM ORDER BY watchesPM DESC LIMIT :size , :start")
                    .setParameter("size", size)
                    .setParameter("start", start)
                    .addEntity("postM", PostM.class)
                    .list();
        } catch (Exception e) {
            log.trace("Error with the database.", e);
        }
        return post;
    }

    public static List<PostM> getNewM(int size, int start) {
        List<PostM> post = null;
        try (Session session = HibernateUtil.getSession()) {
            post = session.createSQLQuery("SELECT * FROM postM ORDER BY idPM DESC LIMIT :size , :start")
                    .setParameter("size", size)
                    .setParameter("start", start)
                    .addEntity("postM", PostM.class)
                    .list();
        } catch (Exception e) {
            log.trace("Error with the database.", e);
        }
        return post;
    }

    public static List<PostM> getLastUpdateM(int size, int start) {
        List<PostM> post = null;
        try (Session session = HibernateUtil.getSession()) {
            post = session.createSQLQuery("SELECT postM.* FROM postM, glavam WHERE glavam.postIdM = postM.idPM " +
                    "GROUP BY glavam.postIdM " +
                    "ORDER BY glavam.createDateGM DESC " +
                    "LIMIT :size , :start")
                    .setParameter("size", size)
                    .setParameter("start", start)
                    .addEntity("postM", PostM.class)
                    .list();
        } catch (Exception e) {
            log.trace("Error with the database.", e);
        }
        return post;
    }
}