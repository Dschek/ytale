package dbApi.M;

import dbApi.HibernateUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;
import table.M.CategoryM;

import java.util.List;

public class menu {
    private final static Logger log = LogManager.getLogger();

    public List<CategoryM> getMenuCM() {
        List<CategoryM> menuList = null;
        try (Session session = HibernateUtil.getSession()) {
            menuList = session.createSQLQuery("SELECT * FROM categoryM ").list();
        } catch (Exception e) {
            log.trace("Error with the database.", e);
        }
        return menuList;
    }

    public boolean addCategory(CategoryM category) {
        try (Session session = HibernateUtil.getSession()) {
            Transaction tran = session.getTransaction();
            session.save(category);
            tran.commit();
        } catch (Exception e) {
            log.trace("Error with the database.", e);
            return false;
        }
        return true;
    } ///public boolean add
}